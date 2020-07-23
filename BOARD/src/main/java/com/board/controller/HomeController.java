package com.board.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.Setter;

@RestController
public class HomeController {
	
	/*
	 * 1. 화면에 Hello, World! 가 출력됩니다. 
	 */
	@GetMapping("/")
	@ResponseBody
	public String Hello() {
		return "Hello, World!";
	}
	/*
	 *  2. 화면에 {message : "Hello World"} 라고 출력됩니다. 
	 */
	@GetMapping("/home/JSon")
	@ResponseBody
	public Hello HelloJson() {
		Hello hello = new Hello();
		hello.message = "Hello, world";
		return hello;
	}
	
	
	@Setter
	@Getter
	public static class Hello{
		private String message;
	}
		
}
