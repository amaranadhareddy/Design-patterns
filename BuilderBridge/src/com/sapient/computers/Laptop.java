package com.sapient.computers;

public class Laptop extends AbstractComputer implements Computer{

	@Override
	public void start() {
		
		processor.process();
	}

}
