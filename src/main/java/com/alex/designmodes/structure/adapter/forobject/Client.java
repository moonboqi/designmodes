package com.alex.designmodes.structure.adapter.forobject;

public class Client {
	public static void main(String[] args) {
		Adaptee ada = new Adaptee();
		Adapter ad = new Adapter(ada);
		ad.sampleOperation1();
		ad.sampleOperation2();
	}
}
