package com.sapient.service;

public class ProxyFactory {
	
	public static ISer getProxy(String uname, String pwd){
		
		ISer ser = new ProxyImpl(uname, pwd);
		return ser;
	}

}
