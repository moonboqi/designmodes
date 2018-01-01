package com.alex.designmodes.structure.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

	private List<Component> childComponents = new ArrayList<>();
	private String name;

	public Composite(String name) {
		super();
		this.name = name;
	}

	public void addChild(Component child) {
		childComponents.add(child);
	}
	
	public void removeChild(int index) {
		childComponents.remove(index);
	}
	
	public List<Component> getChild(){
		return childComponents;
	}

	@Override
	public void printStruct(String preStr) {
		// TODO Auto-generated method stub
		System.out.println(preStr+"+"+this.name);
		if(this.childComponents != null) {
			preStr += "  ";
			for(Component c: childComponents){
				c.printStruct(preStr);
			}
		}
	}

}
