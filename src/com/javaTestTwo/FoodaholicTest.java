package com.javaTestTwo;

import org.testng.annotations.Test;

public class FoodaholicTest {

	
	Foodaholic foodaholic=new Foodaholic();
	AKitchen aKitchen=new AKitchen();
	Bkitchen bkitchen=new Bkitchen();
	
	@Test
	public void akithenFactorytest(){
		foodaholic.eat(aKitchen);
	}
	
	@Test
	public void bkithenFactorytest(){
		foodaholic.eat(bkitchen);
	}
	
	
}
