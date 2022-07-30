package com.masai;

import org.springframework.stereotype.Service;

@Service(value = "b1")
public class B {
public void funB() {
	System.out.println("Inside funB of B");
}
}
