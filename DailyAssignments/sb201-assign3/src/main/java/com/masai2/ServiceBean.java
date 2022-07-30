package com.masai2;

import org.springframework.stereotype.Service;

@Service(value="sb")
public class ServiceBean {
public int sum(int a, int b) {
	return a+b;
}
public int diff(int a, int b) {
	return a-b;
}
public int mul(int a, int b) {
	return a*b;
}
public int div(int a, int b) {
	return a/b;
}
}
