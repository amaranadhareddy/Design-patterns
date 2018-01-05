package com.sap.vo;

import java.util.List;

public class Category {

	private int cid;
	private String cname;
	private List<Product> products;
	
	public Category(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		
		return cid + " " + cname;
	}
	
	
	
	
	
}
