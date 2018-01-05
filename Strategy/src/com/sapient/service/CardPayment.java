package com.sapient.service;

public class CardPayment implements PaymentStrategy{

	private static final CardPayment obj = new CardPayment();
	
	private CardPayment(){
		
	}
	
	/**
	 * Singleton code
	 * @return
	 */
	public static PaymentStrategy getCard(){
		return obj;
	}
	
	@Override
	public void doPayment() {
		System.out.println("card payment is processed");
	}

}
