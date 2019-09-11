package com.example.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.UserReview;
import com.example.models.UserReviewList;

@RestController
@RequestMapping("/reviewservice")
public class UserReviewService {

	/*
	 * @RequestMapping("/{productId}") public UserReview
	 * getUserReview(@PathVariable("productId") String productId) { return new
	 * UserReview(productId,"5"); }
	 */
	
	@RequestMapping("/{userId}") 
	public UserReviewList getUserReview(@PathVariable("userId") String productId) {
		List<UserReview> reviews=Arrays.asList(new UserReview("123","5"));
		
		UserReviewList userReviewList=new UserReviewList();
		userReviewList.setUserReview(reviews);
		return userReviewList;
	}
}
