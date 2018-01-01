package com.alex.designmodes.create.simplefc;

public class AmdCpu implements Cpu {

	private int pins = 0;
	
	public AmdCpu(int pins) {
		super();
		this.pins = pins;
	}

	public void calculate() {
		System.out.println("AMD CPU的针脚数："+pins);
	}
	
}
