package com.masai.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.InvalidIdException;
import com.masai.model.Product;

@RestController
public class MyController {
	
@GetMapping("/products")
public ResponseEntity<List<Product>> getProducts(){
	List<Product> products= new ArrayList<>();
	products.add(new Product(1, "P1", 199, "B1", "C1", 123, 456));
	products.add(new Product(2, "P2", 299, "B2", "C2", 223, 556));
	products.add(new Product(3, "P3", 399, "B3", "C3", 323, 656));
	products.add(new Product(4, "P4", 499, "B4", "C4", 423, 756));
	return new ResponseEntity<List<Product>>(products,HttpStatus.ACCEPTED);
}
@GetMapping("/products/{id}")
public ResponseEntity<Product> getProductById(@PathVariable("id") Integer id){
	if(id<1)
		throw new InvalidIdException("Roll no cannot be less than 1");
	
	Product prod= new Product(id, "P1", 199, "B1", "C1", 123, 456);
	return new ResponseEntity<Product>(prod,HttpStatus.ACCEPTED);
}
@PostMapping("/product")
public String addProduct(@Valid @RequestBody Product product){
	return "Product added: "+product;
}
@DeleteMapping("/product/{id}")
public String deleteProductById(@PathVariable("id") Integer id) {
	if(id<1)
		throw new InvalidIdException("Roll no cannot be less than 1");
	Product prod= new Product(id, "P1", 199, "B1", "C1", 123, 456);
	return "deleted product: "+prod;
}
@PutMapping("/product/{id}")
public String updateProductById(@PathVariable("id") Integer id) {
	if(id<1)
		throw new InvalidIdException("Roll no cannot be less than 1");
	Product prod= new Product(id, "P1", 199, "B1", "C1", 123, 456);
	return "Updated product: "+prod;

}
}