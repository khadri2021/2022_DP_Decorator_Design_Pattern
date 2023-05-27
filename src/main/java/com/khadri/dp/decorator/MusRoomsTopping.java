package com.khadri.dp.decorator;

public class MusRoomsTopping extends ToppingDecorator {

	public MusRoomsTopping(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String regular() {
		return pizza.regular()+applyTopping();
	}
	
	private String applyTopping() {
		return " With  Musrooms Applied";
	}

}
