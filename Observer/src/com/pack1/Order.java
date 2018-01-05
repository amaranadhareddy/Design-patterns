package com.pack1;

import java.util.Observable;

public class Order extends Observable{

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
		setChanged();
		notifyObservers();
	}
}
