package com.testNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class suitTest {

	@BeforeSuite
	public void beforeSuitTest(){
		System.out.println("beforeSuitTest");
	}
	
	

	@AfterSuite
	public void afterSuitTest(){
		System.out.println("afterSuitTest");
	}
}
