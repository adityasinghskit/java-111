package com.masai.service;

import java.util.List;

import com.masai.exception.BookAlreadyExistsException;
import com.masai.exception.BookNotFoundException;
import com.masai.model.Book;

public interface BookService {
public List<Book> getAllBooks() throws BookNotFoundException;
public Book getBookById(Integer id) throws BookNotFoundException;
public Book addBook(Book book) throws BookAlreadyExistsException;
public Book deleteBookById(Integer id) throws BookNotFoundException;
public Book updateBook(Integer id,Book book) throws BookNotFoundException;
}
