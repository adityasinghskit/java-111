package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.BookAlreadyExistsException;
import com.masai.exception.BookNotFoundException;
import com.masai.model.Book;
import com.masai.repository.BookDao;
@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bDao;
	
	@Override
	public List<Book> getAllBooks() throws BookNotFoundException {
		List<Book> list=bDao.findAll();
		if(list.size()>0) {
			return list;
		}
		else {
			throw new BookNotFoundException("No book found!");
		}
	}

	@Override
	public Book getBookById(Integer id) throws BookNotFoundException {
		Optional<Book> opt=bDao.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}else {
			throw new BookNotFoundException("No book found by id : "+id);
		}
	}

	@Override
	public Book addBook(Book book) throws BookAlreadyExistsException {
		
		Optional<Book> opt=bDao.findById(book.getBookId());
		if(opt.isPresent()) {
			throw new BookAlreadyExistsException("Book by that id already exists");
		}
		else {
			return bDao.save(book);
		}
		
		//return bDao.save(book);
	}

	@Override
	public Book deleteBookById(Integer id) throws BookNotFoundException {
		Optional<Book> opt=bDao.findById(id);
		if(opt.isPresent()) {
			bDao.delete(opt.get());
			return opt.get();
		}
		else {
			throw new BookNotFoundException("No Book found by that id : "+id);
		}
	}

	@Override
	public Book updateBook(Integer id, Book book) throws BookNotFoundException {
		Optional<Book> opt=bDao.findById(id);
		if(opt.isPresent()) {
			return bDao.save(book);
		}
		else {
			throw new BookNotFoundException("No Book found by that id : "+id);
		}
	}

}
