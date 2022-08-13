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
@ExceptionHandler(BookException.class)
public ResponseEntity<ErrorDetails> ExpHandler1(BookException ie, WebRequest wr){
	ErrorDetails err= new ErrorDetails(LocalDateTime.now(),ie.getMessage(),wr.getDescription(false));
	return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
}

@ExceptionHandler(NoHandlerFoundException.class)
public ResponseEntity<ErrorDetails> ExpHandler2(NoHandlerFoundException ie, WebRequest wr){
	ErrorDetails err= new ErrorDetails(LocalDateTime.now(),ie.getMessage(),wr.getDescription(false));
	return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
}

@ExceptionHandler(MethodArgumentNotValidException.class)
public ResponseEntity<ErrorDetails> ExpHandler3(MethodArgumentNotValidException ie, WebRequest wr){
	ErrorDetails err= new ErrorDetails(LocalDateTime.now(),ie.getMessage(),wr.getDescription(false));
	return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
}

@ExceptionHandler(Exception.class)
public ResponseEntity<ErrorDetails> ExpHandler4(Exception ie, WebRequest wr){
	ErrorDetails err= new ErrorDetails(LocalDateTime.now(),ie.getMessage(),wr.getDescription(false));
	return new ResponseEntity<ErrorDetails>(err,HttpStatus.BAD_REQUEST);
}
}
