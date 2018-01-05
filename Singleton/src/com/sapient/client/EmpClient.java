package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.EmpService;
import com.sapient.service.IEmpSer;

public class EmpClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		IEmpSer ser = null;
		String opt = null;
		int eid = 0;
		do{
			ser = EmpService.getInstance();
			System.out.println("enter EID");
			eid = scan.nextInt();
			try{
				System.out.println(ser.display(eid));
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
			System.out.println("press y to continue");
			opt = scan.next();
		}while(opt.equals("y"));
	}

}
