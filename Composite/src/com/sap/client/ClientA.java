package com.sap.client;

import java.util.List;

import com.sap.service.MyService;
import com.sap.vo.Category;
import com.sap.vo.Product;
import com.sap.vo.Pspec;

public class ClientA {

	public static void main(String[] args) {
		MyService ser = new MyService();
		Category cat = ser.getCategory();
		System.out.println(cat);
		List<Product> plist = cat.getProducts();
		for(Product p: plist){
			System.out.println(p);
			List<Pspec> slist = p.getPspecs();
			display(slist);
			System.out.println("------------------------------");
		}
	}

	
	private static void display(List<Pspec> lst){
		for(Pspec s: lst){
			System.out.println(s);
		}
	}
}









