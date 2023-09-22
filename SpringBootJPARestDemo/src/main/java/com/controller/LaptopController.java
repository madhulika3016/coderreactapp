package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Laptop;
import com.service.LaptopService;

@RestController
@RequestMapping(path="/api")
public class LaptopController {
	
	@Autowired
	LaptopService lservice;
	
	@PostMapping("/addLaptop")
	public ResponseEntity<Laptop> addLaptop(@RequestBody Laptop l)
	{
		Laptop l1=lservice.addLaptop(l);
		ResponseEntity re=new ResponseEntity<Laptop>(l1,HttpStatus.OK);
		return re;
	}

}
