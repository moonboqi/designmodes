package com.alex.designmodes.structure.bridge;

public class Client {
	public static void main(String[] args) {
		Implementor impl = new ConcreteImplementorA();
		RefinedAbstraction ra = new RefinedAbstraction(impl);
		ra.otherOperation();
		ra.operation();
		Implementor impl2 = new ConcreteImplementorB();
		RefinedAbstraction rb = new RefinedAbstraction(impl2);
		rb.otherOperation();
		rb.operation();
	}
}
