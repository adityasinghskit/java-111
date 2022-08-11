package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(InvalidIdException.class)
public ResponseEntity<ErrorDetails> ExpHandler(InvalidIdException ie, WebRequest wr){
	System.out.println("Inside ExpHandler");
	ErrorDetails err= new ErrorDetails(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
	return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
}
@ExceptionHandler(Exception.class)
public ResponseEntity<ErrorDetails> ExpHandler2(Exception ie, WebRequest wr){
	System.out.println("Inside ExpHandler2");
	ErrorDetails err= new ErrorDetails(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
	return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
}
@ExceptionHandler(NoHandlerFoundException.class)
public ResponseEntity<ErrorDetails> ExpHandler3(NoHandlerFoundException ie, WebRequest wr){
	System.out.println("Inside ExpHandler3");
	ErrorDetails err= new ErrorDetails(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
	return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
}
}
