package com.service;

import java.util.List;
import java.util.Optional;

import com.entity.Coder;

public interface CoderService {
	
	public Coder getCoder(int cid) throws Throwable ;
	
	public List<Coder> getcoders();
	
	public Coder addCoder(Coder c);
	
	public List<Coder> addCoders(List<Coder> lc);
	
	public String deleteCoderById(int cid) ;
	
	public String deleteCoder(Coder c);
	
	public Coder updateCoder(Coder c) throws Throwable;
	
	public Optional<Coder> getCoderByName(String cname);
	
	public List<Coder>  getCoderByTechSortedbycname(String tech);

}
