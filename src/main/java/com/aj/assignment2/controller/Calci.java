package com.aj.assignment2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calci")
public class Calci {

	@RequestMapping("/add")
	public String addition() {
		String str = "10+5 ="+(10+5);
		return str;
	}
	
	@RequestMapping("/sub")
	public String substraction() {
		String str = "10-5 ="+(10-5);
		return str;
	}
	
	@RequestMapping("/mul")
	public String multiplication() {
		String str = "10*5 ="+(10*5);
		return str;
	}
	
	@RequestMapping("/div")
	public String division() {
		String str = "10/5 ="+(10/5);
		return str;
	}
	
	@RequestMapping("/mod")
	public String modules() {
		String str = "10%5 ="+(10%5);
		return str;
	}
}
