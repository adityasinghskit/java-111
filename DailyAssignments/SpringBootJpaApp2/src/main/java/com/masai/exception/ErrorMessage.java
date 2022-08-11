package com.masai.exception;

import java.time.LocalDateTime;

public class ErrorMessage {
private LocalDateTime timestamp;
private String details;
private String message;
public ErrorMessage() {
	super();
}
public ErrorMessage(LocalDateTime timestamp, String details, String message) {
	super();
	this.timestamp = timestamp;
	this.details = details;
	this.message = message;
}
public LocalDateTime getTimestamp() {
	return timestamp;
}
public void setTimestamp(LocalDateTime timestamp) {
	this.timestamp = timestamp;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
@Override
public String toString() {
	return "ErrorMessage [timestamp=" + timestamp + ", details=" + details + ", message=" + message + "]";
}


}
