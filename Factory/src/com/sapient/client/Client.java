package com.sapient.client;

import com.sapient.dao.DaoFactory;
import com.sapient.dao.IDao;

public class Client {

	public static void main(String[] args) {

		IDao dao = DaoFactory.getDaoInstance();
		dao.display();
	}

}
