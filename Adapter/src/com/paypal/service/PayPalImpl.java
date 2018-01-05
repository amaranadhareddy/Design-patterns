package com.paypal.service;

import java.util.Map;

public class PayPalImpl implements IPayPal{

	@Override
	public void doPayment(Map<String, String> custMap) {
		System.out.println("cust name " + custMap.get("cname"));
		System.out.println("Card No " + custMap.get("card"));
		
		System.out.println("paypl payment done");
		
	}

}
