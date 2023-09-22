package com.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.advices.ResourceNotFoundException;
import com.entity.Coder;
import com.repository.CoderRepository;

@Service
public class CoderServiceImpl implements CoderService 

{
	
	@Autowired
	CoderRepository repo;
	
	public Coder getCoder(int cid) throws Throwable
	{
		Supplier s1=()-> new ResourceNotFoundException("Coder Id does not exist in the database");
		Coder c1=repo.findById(cid).orElseThrow(s1);
		return c1;
	}
	
	public List<Coder> getcoders()
	{
		List<Coder>  lc=repo.findAll();
		return lc;
	}
	public Coder addCoder(Coder c)
	{
		repo.save(c);
		return c;	
	}
	
	public List<Coder> addCoders(List<Coder> lc)
	{
		repo.saveAll(lc);
		return lc;	
	}
	

public String deleteCoderById(int cid) {
		
	repo.deleteById(cid);
		
		return "Deleted";
	}

	public String deleteCoder(Coder c) {
		
		repo.delete(c);
		return "Deleted";
	}

	public Coder updateCoder(Coder c) throws Throwable
	{
		int id=c.getCid();
		Supplier s1= ()-> new ResourceNotFoundException("Coder Does not exist in the database");
		Coder c2=repo.findById(id).orElseThrow(s1);
		c2.setCname(c.getCname());
			c2.setTech(c.getTech());
			repo.save(c2);
			return c2;	
	}

	public Optional<Coder> getCoderByName(String cname) {
		Optional<Coder> c1=repo.getCoderByCname(cname);
		return c1;
	}
	
	public List<Coder>  getCoderByTechSortedbycname(String tech)
	{
		List<Coder> lc=repo.getCoderByTechSortedByCname(tech);
		return lc;
	}

}
