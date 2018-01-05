package com.sap.dao;

import java.util.ArrayList;
import java.util.List;

import com.sap.vo.Category;
import com.sap.vo.Product;
import com.sap.vo.Pspec;

public class Mydao {

	public Category getCategory(){
		return new Category(1, "computer");
	}
	
	public List<Product> getProducts(){
		List<Product> lst = new ArrayList<Product>();
		lst.add(new Product(1001,"dell",45000));
		lst.add(new Product(1002,"hp",35000));
		return lst;
	}
	
	public List<Pspec> getSpecs(int pid){
		List<Pspec> lst = new ArrayList<Pspec>();
		if(pid ==1001){
			lst.add(new Pspec("HDD","1TB"));
			lst.add(new Pspec("processor","i7"));
		}else{
			lst.add(new Pspec("HDD","60GB"));
			lst.add(new Pspec("processor","i5"));
		}
		
		
		return lst;
	}
}












