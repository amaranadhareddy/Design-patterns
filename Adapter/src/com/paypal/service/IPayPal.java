package com.paypal.service;

import java.util.Map;

public interface IPayPal {

	void doPayment(Map<String, String> custMap);
}
