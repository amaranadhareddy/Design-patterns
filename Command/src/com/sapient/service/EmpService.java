package com.sapient.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

import com.sapient.vo.Emp;

public class EmpService {

	/**
	 * Command pattern
	 * code process the client request
	 * @param emp
	 * @return
	 */
	public boolean addToFile(Emp emp){
		boolean res = false;
		double netSal = 0;
		double pf = 0;
		
		try(PrintWriter pw = new PrintWriter(new FileWriter("sap.txt",true))){
			pf = (emp.getSal()*0.12);
			netSal = emp.getSal() - pf;
			pw.println(emp.getEid()+","+emp.getEname()+","+emp.getSal()+","+pf+","+netSal);
			res = true;
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		return res;
	}
}
