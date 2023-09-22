package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Laptop1")
public class Laptop {
	
	@Id
	@GeneratedValue
	private int lid;
	private String lname;
	private String company;
	
	/*
	 * @ManyToOne(cascade = CascadeType.ALL) // mappedBy="laptops" will not work
	 * 
	 * @JoinColumn(name="jid",referencedColumnName = "cid") //@JsonBackReference
	 * //@JsonIgnore Coder coder;
	 */

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}
		public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	/*
	 * public Coder getCoder() { return coder; }
	 * 
	 * public void setCoder(Coder coder) { this.coder = coder; }
	 */

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", company=" + company ;
	}
}
