package com.sapient.dao;

public class JdbcDao implements IDao{

	@Override
	public void display() {
		System.out.println("accessing from DB");
	}

}
