package com.sapient.dao;

import java.util.ResourceBundle;

/**
 * 
 * @author alingi
 *creates instance based on the value configured in properties file
 */
public class DaoFactory {

	private static ResourceBundle rb;
	
	static{
		rb = ResourceBundle.getBundle("sapient");
	}
	
	public static IDao getDaoInstance(){
		IDao dao = null;
		try{
			Class cls = Class.forName(rb.getString("cname"));
			dao = (IDao)cls.newInstance();
		}catch(ClassNotFoundException | InstantiationException | IllegalAccessException e){
			System.out.println(e.getMessage());
		}
		return dao;
	}
}
