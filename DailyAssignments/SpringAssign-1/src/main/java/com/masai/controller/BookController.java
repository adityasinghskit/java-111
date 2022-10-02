package com.masai.controller;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Book;
import com.masai.service.BookService;

@RestController
@RequestMapping("/bookservice")
public class BookController {
@Autowired
private BookService bService;

@GetMapping("/books")
public ResponseEntity<List<Book>> getAllBooks(){
	List<Book> list=bService.getAllBooks();
	return new ResponseEntity<List<Book>>(list,HttpStatus.ACCEPTED);
}

@GetMapping("/books/{id}")
public ResponseEntity<Book> getBooksById(@PathVariable("id") Integer id){
	Book b= bService.getBookById(id);
	return new ResponseEntity<Book>(b,HttpStatus.ACCEPTED);
}

@PostMapping("/books")
public ResponseEntity<Book> addBook(@Valid @RequestBody Book book){
	Book b=bService.addBook(book);
	return new ResponseEntity<Book>(b,HttpStatus.ACCEPTED);
}

@DeleteMapping("/books/{id}")
public ResponseEntity<Book> deleteBookById(@PathVariable("id") Integer id){
	Book b=bService.deleteBookById(id);
	return new ResponseEntity<Book>(b,HttpStatus.ACCEPTED);
}

@PutMapping("/books/{id}")
public ResponseEntity<Book> updateBook(@PathVariable("id") Integer id
									  ,@Valid @RequestBody Book book){
	Book b=bService.updateBook(id, book);
	return new ResponseEntity<Book>(b,HttpStatus.ACCEPTED);
}
}
