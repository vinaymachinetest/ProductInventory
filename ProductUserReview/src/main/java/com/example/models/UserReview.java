package com.example.models;

public class UserReview {

	private String productName;
	private String price;
	
	public UserReview() {}
	
	public UserReview(String productName, String price) {
		super();
		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}	
	
}
