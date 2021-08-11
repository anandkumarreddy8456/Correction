package com.telusko.demo;

import org.springframework.stereotype.Component;


public class Customerdetails {
	private String id;
	private String name;
	private String cemail;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	@Override
	public String toString() {
		return "Customerdetails [id=" + id + ", name=" + name + ", cemail=" + cemail + "]";
	}
}
