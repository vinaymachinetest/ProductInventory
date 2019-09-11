package com.example.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.models.ProductDetails;
import com.example.models.ProductInfo;
import com.example.models.UserReviewList;

@RestController
@RequestMapping("/productservice")
public class Products {

	@Autowired
	private RestTemplate restTemplate;
	
	@RequestMapping("/{userId}") 
	public List<ProductDetails> getProductDetails(@PathVariable("userId") String userId) {
		
     UserReviewList reviews = restTemplate.getForObject("http://localhost:8083/reviewservice/"+userId, UserReviewList.class);
     
     return reviews.getUserReview().stream().map(review -> {
			ProductInfo productInfo= restTemplate.getForObject("http://localhost:8081/productinfoservice/"+review.getProductId(), ProductInfo.class);
			return new ProductDetails(productInfo.getProductId(),"demo",review.getUserRating());
		 }).collect(Collectors.toList());	
		
	}
}