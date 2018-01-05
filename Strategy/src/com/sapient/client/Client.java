package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.PaymentFactory;
import com.sapient.service.PaymentStrategy;

public class Client {

	public static void main(String[] args) throws Exception {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter the payment strategy: card || NEFT");
		String strategy = scan.next();
		PaymentStrategy obj = PaymentFactory.getInstance(strategy);
		obj.doPayment();
	}

}
