package com.testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class testTest {

	@BeforeTest
	public void beforeTestTest(){
		System.out.println("beforeTestTest");
	}
	
	

	@AfterTest
	public void afterTestTest(){
		System.out.println("afterTestTest");
	}
}
