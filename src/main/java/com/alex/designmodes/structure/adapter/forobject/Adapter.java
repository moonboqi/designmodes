package com.alex.designmodes.structure.adapter.forobject;

public class Adapter {
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		super();
		this.adaptee = adaptee;
	}
	
	public void sampleOperation1() {
		this.adaptee.sampleOperation1();
	}
	
	public void sampleOperation2() {
		// TODO Auto-generated method stub
		System.out.println("Adapter协助Adaptee实现了oper2方法的调用");
	}
}
