package com.sapient.service;

import java.util.List;

import com.paypal.service.PayPalImpl;

public class PaymentSerImpl implements IPaymentService{

	
	
	@Override
	public void makePayment(List<String> lst) {
		System.out.println("payment processing");
		
	}

}
