package com.alex.designmodes.create.prototype;

public class ConcretePrototype1 implements Prototype {

	@Override
	public Object clon() {
		// TODO Auto-generated method stub
		Prototype prototype = new ConcretePrototype1();
		return prototype;
	}

}
