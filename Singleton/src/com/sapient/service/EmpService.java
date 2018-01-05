package com.sapient.service;

import java.util.HashMap;
import java.util.Map;

public class EmpService implements IEmpSer{

	private static Map<Integer, String> emap;
	private static final EmpService ser;
	private EmpService(){
		
	}
	
	public  static IEmpSer getInstance(){
		/*if(ser==null){
			ser = new EmpService();
			System.out.println("new instance");
		}
		else 
			System.out.println("old instance");*/
		return ser;
	}
	
	static{
		ser = new EmpService();
		emap = new HashMap<>();
		emap.put(1001, "ram");
		emap.put(1002, "tom");
		emap.put(1003, "sam");
	}
	
	public String display(int eid) throws Exception{
		if(!emap.containsKey(eid))
			throw new Exception("no ID found");
		return emap.get(eid);
	}
}
