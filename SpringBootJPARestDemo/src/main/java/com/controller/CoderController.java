package com.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Coder;
import com.service.CoderService;


@CrossOrigin
@RestController
@RequestMapping("/api")
public class CoderController 
{
	@Autowired
	CoderService coderservice;
	
	@GetMapping("/getcoder/{cid}")
	public Coder getCoder(@PathVariable int cid) throws Throwable
	{
		Coder c1=coderservice.getCoder(cid);
		return c1;
	}
	@GetMapping("/getcoderbyname/{cname}")
	public Optional<Coder> getCoderByName(@PathVariable String cname)
	{
		Optional<Coder> c1=coderservice.getCoderByName(cname);
		return c1;
	}
	
	@GetMapping("/getcoders")
	public ResponseEntity<List<Coder>> getCoders()
	{
		List<Coder> lc= coderservice.getcoders();
		ResponseEntity re=new ResponseEntity<List<Coder>>(lc,HttpStatus.OK);
		return re;
	}
	
	@GetMapping("/getcodersbytech/{tech}")
public ResponseEntity<List<Coder>> getCodersbytechsortedbycname(@PathVariable String tech)
	{
		List<Coder> lc= coderservice.getCoderByTechSortedbycname(tech);
		ResponseEntity re=new ResponseEntity<List<Coder>>(lc,HttpStatus.OK);
		return re;	
	}
	
	@PostMapping("/addcoder")
	public Coder addCoder(@Valid @RequestBody Coder c1)
	{
		coderservice.addCoder(c1);
		return c1;
	}
	
	@PostMapping("/addcoders")
	public List<Coder> addCoders(@RequestBody List<Coder> lc)
	{
		coderservice.addCoders(lc);
		return lc;	
	}
	
	@PutMapping(path="/updatecoder")
	public Coder updateCoder(@Valid  @RequestBody Coder c) throws Throwable 
	{
		Coder c1=coderservice.updateCoder(c);
		return c1;
	}
	
	
	@DeleteMapping(path="/deletecoder")
	public ResponseEntity<String> deleteCoder(@RequestBody Coder e)
	{
		coderservice.deleteCoder(e);
		
		ResponseEntity re=new ResponseEntity<String>("Deleted",HttpStatus.OK);
		return re;
	}
	
	@DeleteMapping(path="/deletecoderbyId/{eid}")
	public String deleteCoderById(@PathVariable int eid)
	{
		coderservice.deleteCoderById(eid);
		
		return "Deleted";
	}
}
