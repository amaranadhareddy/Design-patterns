package com.sap.vo;

public class Pspec {

	private String sname;
	private String svalue;
	
	public Pspec(String sname, String svalue) {
		super();
		this.sname = sname;
		this.svalue = svalue;
	}
	@Override
	public String toString() {
		
		return sname + " " + svalue;
	}
	
	
}
