package com.alex.designmodes.structure.bridge;

public class RefinedAbstraction extends Abstraction {

	public RefinedAbstraction(Implementor impl) {
		super(impl);
		// TODO Auto-generated constructor stub
	}
	
	public void otherOperation() {
		System.out.println("其他操作方法");
	}
}
