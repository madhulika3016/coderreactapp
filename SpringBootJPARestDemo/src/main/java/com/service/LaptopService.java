package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Laptop;
import com.repository.LaptopRepo;

@Service
public class LaptopService {
	
	@Autowired
	LaptopRepo lrepo;
	
	public Laptop addLaptop(Laptop l)
	{
		lrepo.save(l);
		return l;
		
	}
	

}
