package com.testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class methodTest {

	@BeforeMethod
	public void beforeMethodTest(){
		System.out.println("beforeMethodTest");
	}
	
	@Test
	public void testMethod(){
		System.out.println("testMethod");
	}

	@AfterMethod
	public void afterMethodTest(){
		System.out.println("afterMethodTest");
	}
}
