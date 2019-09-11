package com.example.models;

import java.util.List;

public class UserReviewList {
	
	private List<UserReview> userReview;

	public UserReviewList() {};
	public UserReviewList(List<UserReview> userReview) {
		this.userReview = userReview;
	}

	public List<UserReview> getUserReview() {
		return userReview;
	}

	public void setUserReview(List<UserReview> userReview) {
		this.userReview = userReview;
	}
	
}
