package com.alex.designmodes.structure.adapter.forclass;

public class Adapter extends Adaptee implements Target {

	@Override
	public void sampleOperation2() {
		// TODO Auto-generated method stub
		System.out.println("Adapter协助Adaptee实现了oper2方法的调用");
	}

}
