package com.sapient.service;

public class NEFTPayment implements PaymentStrategy{

private static final NEFTPayment obj = new NEFTPayment();
	
	private NEFTPayment(){
		
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

		System.out.println("NEFT payment");
	}

}
