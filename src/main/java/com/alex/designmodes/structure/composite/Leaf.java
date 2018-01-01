package com.alex.designmodes.structure.composite;

public class Leaf implements Component {
	
	private String name;
	
	public Leaf(String name) {
		super();
		this.name = name;
	}

	@Override
	public void printStruct(String preStr) {
		// TODO Auto-generated method stub
		System.out.println(preStr+"-"+name);
	}

}
