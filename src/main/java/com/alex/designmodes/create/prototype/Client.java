package com.alex.designmodes.create.prototype;

public class Client {
	private Prototype prototype;

	public Client(Prototype prototype) {
		super();
		this.prototype = prototype;
	}
	
	public void operation(Prototype prototype){
		Prototype copyPrototype = (Prototype) prototype.clon();
	}
}
