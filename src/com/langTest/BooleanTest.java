package com.langTest;

import org.testng.annotations.Test;

public class BooleanTest {

	
	@Test
	public void test(){
		Boolean a=new Boolean(true);
		Boolean b=new Boolean("false");
		
		System.out.println(a.booleanValue());
		System.out.println(a.compareTo(false));
		System.out.println(a.logicalAnd(false, true));
	}
}
