package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.EmpService;
import com.sapient.vo.Emp;

public class Client {

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.println("enter eid:");
		int eid = scn.nextInt();
		System.out.println("enter ename:");
		String ename = scn.next();
		System.out.println("enter sal:");
		double sal = scn.nextDouble();
		
		Emp emp = new Emp();
		emp.setEid(eid);
		emp.setEname(ename);
		emp.setSal(sal);
		
		EmpService eser = new EmpService();
		boolean res = eser.addToFile(emp);
	}
}
