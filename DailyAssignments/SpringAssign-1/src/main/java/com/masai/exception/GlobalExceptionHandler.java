package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(BookAlreadyExistsException.class)
		public ResponseEntity<ErrorDetails> ExpHandler1(BookAlreadyExistsException ie, WebRequest wr){
			ErrorDetails ed= new ErrorDetails(LocalDateTime.now(),ie.getMessage(),wr.getDescription(false));
			return new ResponseEntity<ErrorDetails>(ed,HttpStatus.BAD_REQUEST);
		}
	
	@ExceptionHandler(BookNotFoundException.class)
		public ResponseEntity<ErrorDetails> ExpHandler2(BookNotFoundException ie, WebRequest wr){
			ErrorDetails ed= new ErrorDetails(LocalDateTime.now(),ie.getMessage(),wr.getDescription(false));
			return new ResponseEntity<ErrorDetails>(ed,HttpStatus.BAD_REQUEST);
		}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorDetails> ExpHandler3(NoHandlerFoundException ie, WebRequest wr){
		ErrorDetails ed= new ErrorDetails(LocalDateTime.now(),ie.getMessage(),wr.getDescription(false));
		return new ResponseEntity<ErrorDetails>(ed,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorDetails> ExpHandler4(MethodArgumentNotValidException ie, WebRequest wr){
		ErrorDetails ed= new ErrorDetails(LocalDateTime.now(),ie.getMessage(),wr.getDescription(false));
		return new ResponseEntity<ErrorDetails>(ed,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> ExpHandler5(Exception ie, WebRequest wr){
		ErrorDetails ed= new ErrorDetails(LocalDateTime.now(),ie.getMessage(),wr.getDescription(false));
		return new ResponseEntity<ErrorDetails>(ed,HttpStatus.BAD_REQUEST);
	}
	
	
}
