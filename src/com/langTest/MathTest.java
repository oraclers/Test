package com.langTest;

import org.testng.annotations.Test;

public class MathTest {

	@Test
	public void testMath(){
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println(Math.abs(30));
		System.out.println(Math.sqrt(9));
		System.out.println(Math.rint(13.4));
	}
	
}
