package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entities.Author;
import com.masai.entities.Book;
import com.masai.entities.BookDTO;
import com.masai.exception.BookException;
import com.masai.exception.InvalidIdException;
import com.masai.repository.AuthorDao;
import com.masai.repository.BookDao;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bDao;
	
	@Autowired
	private AuthorDao aDao;
	
	@Override
	public List<Book> getAllBooks() throws BookException {
		List<Book> list=bDao.findAll();
		if(list.size()>0)
			return list;
		else
			throw new BookException("No book not found");
	}

	@Override
	public Book getBookById(Integer id) throws InvalidIdException {
		if(id<1) 
			throw new InvalidIdException("Id cannot be less than 1");
		Optional<Book> opt=bDao.findById(id);
		return opt.orElseThrow(() -> new BookException("No book found with id: "+id));
		
	}

	@Override
	public Book addBook(Book book) {
		
		Author author=book.getAuthor();
		author.getBooks().add(book);
		aDao.save(author);
		return bDao.save(book);
	}

	@Override
	public Book deleteBook(Book book) {
		Optional<Book> opt=bDao.findById(book.getBookId());
		if(opt.isPresent()) {
			bDao.deleteById(book.getBookId());
			return book;
		}
		else
			throw new BookException("No book found");
	}

	@Override
	public Book updateBook(Book book) throws BookException {
		Optional<Book> opt=bDao.findById(book.getBookId());
		if(opt.isPresent()) {
			return bDao.save(book);
		}
		else
			throw new BookException("No book found");
	}
/*
	@Override
	public List<BookDTO> getAllBooksDTO() throws BookException {
		List<BookDTO> list=bDao.getAllBooksDTO();
		if(list.size()>0)
			return list;
		else
			throw new BookException("No book not found");
	}

	@Override
	public BookDTO getBookByIdDTO(Integer id) throws InvalidIdException {
		if(id<1)
			throw new InvalidIdException("Id cannot be less than 1");
		
		BookDTO dto= bDao.getBooksByIdDTO(id);
		
		if(dto!=null)
			return dto;
		else
			throw new BookException("No book found with id: "+id);
	}
*/
}
