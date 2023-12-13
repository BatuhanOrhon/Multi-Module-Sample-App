package com.demo.springbootsampleapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import component.HelloService;

@RestController
public class HelloController {
	@Autowired
	HelloService helloService;

	@GetMapping(value = "/hello")
	@ResponseBody
	public String hello() {
		return helloService.returnHello();
	}
}
