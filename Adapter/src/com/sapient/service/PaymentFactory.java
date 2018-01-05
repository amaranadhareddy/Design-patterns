package com.sapient.service;

import java.util.ResourceBundle;

public class PaymentFactory {

	private static ResourceBundle rb = ResourceBundle.getBundle("sapient");
	
	public static IPaymentService getPaymentInstance()throws Exception{
		IPaymentService ser = null;
		ser = (PayPalPayment)Class.forName(rb.getString("cname")).newInstance();
		return ser;
	}
	
}
