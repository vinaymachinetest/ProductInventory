package com.example.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.models.ProductInfo;

@RestController
@RequestMapping("/productinfoservice")
public class ProductInfoService {

	@RequestMapping("/{productId}") 
	public ProductInfo getProductInfo(@PathVariable("productId") String productId) {
		return new ProductInfo(productId, "HRX by Hrithik Roshan Grey Synthetic Regular Running");
	}	
	
}
