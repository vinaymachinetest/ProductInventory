package com.example.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.models.ProductDetails;

@RestController
@RequestMapping("/productservice")
public class Products {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{userId}") 
	public List<ProductDetails> getProductDetails(@PathVariable("userId") String userId) {
		
		return null;
	}
}
