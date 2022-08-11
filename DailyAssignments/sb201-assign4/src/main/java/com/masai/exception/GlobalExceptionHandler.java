package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.masai.exception.InvalidRollException;
import com.masai.exception.MyErrorDetails;

@ControllerAdvice
public class GlobalExceptionHandler {
@ExceptionHandler(InvalidRollException.class)
public ResponseEntity<MyErrorDetails> myExHandler(InvalidRollException ie, WebRequest wr){
	MyErrorDetails err= new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
	return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
}
@ExceptionHandler(Exception.class)
public ResponseEntity<MyErrorDetails> myExpHandler2(Exception ie, WebRequest wr){
	System.out.println("inside myHandler2 method");
	MyErrorDetails err= new MyErrorDetails(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
	return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
}
@ExceptionHandler(NoHandlerFoundException.class)
public ResponseEntity<MyErrorDetails> mynotFoundHandler(NoHandlerFoundException nfe,WebRequest req) {
MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(), nfe.getMessage(), req.getDescription(false));
return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
}
}
