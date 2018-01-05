package com.sapient.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.paypal.service.IPayPal;
import com.paypal.service.PayPalImpl;

public class PaymentAdapter {

	private IPayPal paypal = new PayPalImpl();

	
	public void makePayment(List<String> lst) {
		Map<String, String> cmap = new HashMap<>();
		cmap.put("cname", lst.get(0));
		cmap.put("card", lst.get(1));
		cmap.put("cvv", lst.get(2));
		paypal.doPayment(cmap);
		
	}
	
}
