package com.masai.exception;

public class DeptNotFoundException extends RuntimeException {
	public DeptNotFoundException() {
		
	}
	public DeptNotFoundException(String message) {
		super(message);
	}
}
