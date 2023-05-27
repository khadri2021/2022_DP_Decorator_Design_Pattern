package com.khadri.dp.decorator;

public abstract class ToppingDecorator implements Pizza {

	protected Pizza pizza;
	
	public ToppingDecorator(Pizza pizza) {
		this.pizza = pizza;
	}
	
	@Override
	public String regular() {
		return pizza.regular();
	}
}
