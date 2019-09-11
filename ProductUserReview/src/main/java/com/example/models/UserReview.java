package com.example.models;

public class UserReview {

	private String productId;
	private String userRating;
	
	public UserReview() {}
	
	public UserReview(String productId, String userRating) {
		super();
		this.productId = productId;
		this.userRating = userRating;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getUserRating() {
		return userRating;
	}

	public void setUserRating(String userRating) {
		this.userRating = userRating;
	}
	
	
}
