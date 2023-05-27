package com.khadri.dp.decorator;

public class BlackOlivesTopping extends ToppingDecorator{

	public BlackOlivesTopping(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String regular() {
		return pizza.regular() +applyTopping();
	}

	private String applyTopping() {
		return  " With  Black Olives Applied";
	}
}
