package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyInfoRest {

	@GetMapping("/info")
	public String info() {

		String str = "my name is ashok kumar";

		return str;
	}

}
