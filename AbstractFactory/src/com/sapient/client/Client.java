package com.sapient.client;

import java.util.Collection;
import java.util.Scanner;

import com.sapient.service.CollectionFactory;

public class Client {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the type");
		String type = scan.next();
		Collection<String> col = CollectionFactory.getCollection(type);
		col.add("ram");
		col.add("tom");
		col.add("sam");
		col.add("tom");
		col.add("ram");
		System.out.println(col.getClass().getSimpleName()+" "+col);
		scan.close();
	}

}
