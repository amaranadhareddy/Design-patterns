package com.pack2;

import java.time.LocalDateTime;
import java.util.TimerTask;

public class ReportGenerator extends TimerTask{

	@Override
	public void run() {

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("generated report "+ldt);
	}

}
