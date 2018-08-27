package com.pro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pro.model.Product;
import com.pro.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("welcome")
	public String welcome() {
		return "Welocme to Product REST API";
	}

	@GetMapping("products/{prodCode}")
	public Product getProduct(@PathVariable Integer prodCode) {
		return service.getProduct(prodCode);
	}
	
}
