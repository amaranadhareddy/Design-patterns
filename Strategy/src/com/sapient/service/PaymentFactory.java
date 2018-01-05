package com.sapient.service;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {

	private static Map<String, PaymentStrategy> pmap;
	
	static{
	
		pmap = new HashMap<>();
		pmap.put("card", CardPayment.getCard());
		pmap.put("NEFT", NEFTPayment.getCard());
	}
	
	/**
	 * factory code pattern
	 * @param strategy
	 * @return
	 * @throws Exception
	 */
	public static PaymentStrategy getInstance(String strategy) throws Exception{
		PaymentStrategy obj = null;
		if(!pmap.containsKey(strategy))
			throw new Exception("invalid payment mode");
		obj = pmap.get(strategy);
		return obj;
	}
}
