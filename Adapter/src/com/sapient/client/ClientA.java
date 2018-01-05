package com.sapient.client;

import java.util.ArrayList;
import java.util.List;

import com.sapient.service.IPaymentService;
import com.sapient.service.PaymentFactory;
import com.sapient.service.PaymentSerImpl;

public class ClientA {

	public static void main(String[] args) throws Exception {
		IPaymentService ser = PaymentFactory.getPaymentInstance();
		List<String> lst = new ArrayList<String>();
		lst.add("ram");
		lst.add("syn101011010");
		lst.add("492");
		ser.makePayment(lst);

	}

}
