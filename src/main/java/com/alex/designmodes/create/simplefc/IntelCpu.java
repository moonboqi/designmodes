package com.alex.designmodes.create.simplefc;

public class IntelCpu implements Cpu {

	private int pins = 0;
	
	public IntelCpu(int pins) {
		super();
		this.pins = pins;
	}

	public void calculate() {
		System.out.println("Intel CPU的针脚数："+pins);
	}

}
