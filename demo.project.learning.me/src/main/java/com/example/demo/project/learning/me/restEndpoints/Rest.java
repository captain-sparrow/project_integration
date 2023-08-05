package com.example.demo.project.learning.me.restEndpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.project.learning.me.service.Service;

@RestController
public class Rest {

	@Autowired
	Service service;
	
	
	@GetMapping(value = "/hi")
	public String sayHi()
	{
		return service.sayHi();
	}
	
	
}
