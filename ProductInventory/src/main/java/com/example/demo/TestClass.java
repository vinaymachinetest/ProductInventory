package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testservice") 
public class TestClass {

	@RequestMapping("/test") 
	public String test() {
		return "!Hey this is test page";
	}
}

