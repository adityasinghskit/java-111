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
	@ExceptionHandler(StudentException.class)
	public ResponseEntity<ErrorMessage> handleStudentException(StudentException exp,WebRequest req){
		ErrorMessage err=new ErrorMessage(LocalDateTime.now(), exp.getMessage(), req.getDescription(false));
	return new ResponseEntity<>(err,HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessage> myExpHandler2(Exception ie, WebRequest wr){
		System.out.println("inside myHandler2 method");
		ErrorMessage err= new ErrorMessage(LocalDateTime.now(), ie.getMessage(), wr.getDescription(false));
		return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	}
	//to handle Not found exception
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<ErrorMessage> mynotFoundHandler(NoHandlerFoundException nfe,WebRequest req) {
		ErrorMessage err=new ErrorMessage(LocalDateTime.now(), nfe.getMessage(), req.getDescription(false));
	return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	}
}
