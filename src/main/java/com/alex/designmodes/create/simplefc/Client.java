package com.alex.designmodes.create.simplefc;

public class Client {
	public static void main(String[] args) {
		CpuFactory f1 = new CpuFactory();
		Cpu c1 = f1.createCpu(1);
		c1.calculate();
		System.out.println("--------------------");
		CpuFactory f2 = new CpuFactory();
		Cpu c2 = f2.createCpu(2);
		c2.calculate();
	}
}
