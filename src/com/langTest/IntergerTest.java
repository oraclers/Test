package com.langTest;

import org.testng.annotations.Test;

public class IntergerTest {

	@Test
	public void test(){
		Integer a=new Integer(10);
		Integer b=new Integer(20);
		String str = "a";
		
		System.out.println(a.SIZE);
		System.out.println(a.compareTo(b));
		System.out.println("byteValue: "+a.byteValue());
		System.out.println("equals: "+a.equals(b));
		System.out.println("intValue: "+a.intValue());
		System.out.println("shortValue: "+a.shortValue());
		System.out.println("longValue: "+a.longValue());
		System.out.println("floatValue: "+a.floatValue());
		
		System.out.println("valueOf: "+str.valueOf(a));
		System.out.println(str);
	}
}
