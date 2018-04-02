package com.javaTestFour;

import org.testng.annotations.Test;

public class GirlTest {

	
	@Test
	public void test(){
		Girl girl=new AmericanGirl();
		System.out.println(girl.getDescription());
		
		GoldenHair goldenHair=new GoldenHair(girl);
		System.out.println(goldenHair.getDescription());
	}
}
