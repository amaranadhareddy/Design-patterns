package com.sapient.computers;

import com.sapient.processors.IProcessor;

public class AbstractComputer {

	protected IProcessor processor;

	public AbstractComputer() {
		super();
	}

	public void setProcessor(IProcessor processor) {
		this.processor = processor;
	}

}