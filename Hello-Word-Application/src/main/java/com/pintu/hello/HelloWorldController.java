package com.pintu.hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name) {
		return "Hello! " + name;
	}
	static  void test_main() {
		System.out.println("Git Chcek");
	}
}
