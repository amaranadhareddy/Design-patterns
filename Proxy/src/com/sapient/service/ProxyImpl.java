package com.sapient.service;

import java.util.HashMap;
import java.util.Map;

public class ProxyImpl implements ISer{
	private static Map<String, String> emap;
	
	private ISer ser= new SerImpl();
	private String uname;
	private String pwd;
	
	static{
		emap = new HashMap<>();
		emap.put("1001", "ram123");
		emap.put("1002", "abc123");
	}
	
	public ProxyImpl(String uname, String pwd) {
		super();
		this.uname = uname;
		this.pwd = pwd;
	}
	
	@Override
	public double calcSimple(double p, int n, float r) {
		if(!emap.containsKey(uname) || !emap.get(uname).equals(pwd)){
			 System.out.println("you are not authenticated to access");
			 return 0;
		}
		else
		    return ser.calcSimple(p, n, r);
	}

}
