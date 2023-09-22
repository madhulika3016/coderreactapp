package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



@Entity
//@Table(name="Java_Coder")
@Table(name="Coder1")
public class Coder {
	
	@Id
	@GeneratedValue
	int cid;
	
	//@Column(name="codername")
	@NotNull
	@NotEmpty(message="Name can not be empty")
	String cname;
	String tech;

	/*
	 * @OneToMany List<Laptop> laptops;
	 * 
	 * public List<Laptop> getLaptops() { return laptops; } public void
	 * setLaptops(List<Laptop> laptops) { this.laptops = laptops; }
	 */
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Coder [cid=" + cid + ", cname=" + cname + ", tech=" + tech + "]";
	}
	
}
