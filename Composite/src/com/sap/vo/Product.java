package com.sap.vo;

import java.util.List;

public class Product {

	private int pid;
	private String pname;
	private double price;
	private List<Pspec> pspecs;
	
	public Product(int pid, String pname, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public List<Pspec> getPspecs() {
		return pspecs;
	}

	public void setPspecs(List<Pspec> pspecs) {
		this.pspecs = pspecs;
	}

	@Override
	public String toString() {
		
		return pid + " " + pname + " " + price;
	}
	
	
	
}
