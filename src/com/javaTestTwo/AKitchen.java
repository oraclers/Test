package com.javaTestTwo;

public class AKitchen implements KitchenFactory {

	public Food getFood() {
	
		return new Apple();
	}

	public TableWare getTableWare() {
		return new Knife();
	}

}
