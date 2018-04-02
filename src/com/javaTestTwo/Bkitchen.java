package com.javaTestTwo;

public class Bkitchen implements KitchenFactory {

	@Override
	public Food getFood() {
		return new Egg();
	}

	@Override
	public TableWare getTableWare() {
		
		return new Bowl();
	}

}
