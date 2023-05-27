package com.khadri.dp.decorator;

public class TestDecoratorDesignPattern {

	public static void main(String[] args) {
		
		Pizza pizza1 = new RegularPizza();
		System.out.println(pizza1.regular());
		
		Pizza  pizza2 = new BlackOlivesTopping(new RegularPizza());
		System.out.println(pizza2.regular());
		
		Pizza pizza3 = new MusRoomsTopping(new RegularPizza());
		System.out.println(pizza3.regular());
	}
}
