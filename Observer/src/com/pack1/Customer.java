package com.pack1;

import java.util.Observable;
import java.util.Observer;

public class Customer implements Observer{

	@Override
	public void update(Observable arg, Object msg) {

		if(arg instanceof Order){
			Order order = (Order)arg;
			System.out.println("customer notifies "+order.getStatus());
		}
	}

}
