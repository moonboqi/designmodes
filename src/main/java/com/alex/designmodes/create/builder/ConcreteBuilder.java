package com.alex.designmodes.create.builder;

public class ConcreteBuilder implements Builder {

	private Product product = new Product();
	
	@Override
	public void buildPart1() {
		// TODO Auto-generated method stub
		product.setPart1("编号:9527");
	}

	@Override
	public void buildPart2() {
		// TODO Auto-generated method stub
		product.setPart2("编号:9528");
	}

	@Override
	public Product retrieveResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
