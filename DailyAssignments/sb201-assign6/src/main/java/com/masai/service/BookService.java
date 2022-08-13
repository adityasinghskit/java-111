package com.masai.service;

import java.util.List;

import com.masai.entities.Book;
import com.masai.entities.BookDTO;
import com.masai.exception.BookException;
import com.masai.exception.InvalidIdException;

public interface BookService {
public List<Book> getAllBooks() throws BookException;
public Book getBookById(Integer id) throws InvalidIdException;
//Reader
public List<BookDTO> getAllBooksDTO() throws BookException;
public BookDTO getBookByIdDTO(Integer id) throws InvalidIdException;
public Book addBook(Book book);
public Book deleteBook(Book book) throws BookException;
public Book updateBook(Book book) throws BookException;
}
