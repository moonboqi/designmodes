package com.alex.designmodes.structure.bridge;

public abstract class Abstraction {
	protected Implementor impl;

	public Abstraction(Implementor impl) {
		super();
		this.impl = impl;
	}
	
	public void operation() {
		impl.operationImpl();
	}
}
