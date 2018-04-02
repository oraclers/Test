package com.javaTestTwo;

public class Foodaholic {
	public void eat(KitchenFactory k) {
		System.out.println("A foodaholic is eating "
				+ k.getFood().getFoodName() + " with "
				+ k.getTableWare().getToolName());
	}
}
