package com.example.models;

public class ProductDetails {
	private String productName;
	private String productDesc;
	private String productPrice;
		
	public ProductDetails() {}

	public ProductDetails(String productName, String productDesc, String productPrice) {
		this.productName = productName;
		this.productDesc = productDesc;
		this.productPrice = productPrice;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDesc() {
		return productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
}
