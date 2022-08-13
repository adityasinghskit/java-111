package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entities.Book;
import com.masai.entities.BookDTO;
import com.masai.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bService;
	
	@GetMapping("/books")
	public ResponseEntity<List<Book>> getAllBooks(){
		List<Book> list=bService.getAllBooks();
		return new ResponseEntity<List<Book>>(list,HttpStatus.ACCEPTED);
	}
	@GetMapping("/books/{id}")
	public ResponseEntity<Book> getBookById(Integer id){
		Book foundBook= bService.getBookById(id);
		return new ResponseEntity<Book>(foundBook,HttpStatus.ACCEPTED);
	}
	/*
	//Reader API
	@GetMapping("/books/reader")
	public ResponseEntity<List<BookDTO>> getAllBooksReader(){
		List<BookDTO> list=bService.getAllBooksDTO();
		return new ResponseEntity<List<BookDTO>>(list,HttpStatus.ACCEPTED);
	}
	@GetMapping("/books/reader{id}")
	public ResponseEntity<BookDTO> getBookByIdReader(Integer id){
		BookDTO foundBook= bService.getBookByIdDTO(id);
		return new ResponseEntity<BookDTO>(foundBook,HttpStatus.ACCEPTED);
	}
	*/
	@PostMapping("/books")
	public ResponseEntity<Book> addBook(@Valid @RequestBody Book book){
		
		Book foundBook=bService.addBook(book);
		return new ResponseEntity<Book>(foundBook,HttpStatus.ACCEPTED);
			
	}
	@DeleteMapping("/books")
	public String deleteBook(@Valid @RequestBody Book book) {
		Book delBook= bService.deleteBook(book);
		return "deleted book: "+delBook;
	}
	@PutMapping("/books")
	public String updateBook(@Valid @RequestBody Book book) {
		Book uptBook= bService.updateBook(book);
		return "deleted book: "+uptBook;
	}
	
}
