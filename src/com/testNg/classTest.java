package com.testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class classTest {
	
	TestData testData=new TestData();


	@BeforeClass
	public void beforeClassTest(){
		System.out.println("beforeclassTest");

	}
	
	
	@Test(enabled=false)
	public void testDataTest(){
		testData.getTestData("test");
		System.out.println(testData.projId);
		System.out.println(testData.tempId);
		System.out.println(testData.url);
	}
	
	
	@Test
	public void classTest(){
		for(int i=0;i<1;i++){
			
		}
		testData.getTestData("online");
		System.out.println(testData.projId);
		System.out.println(testData.tempId);
		System.out.println(testData.url);
	}

	@AfterClass
	public void afterClassTest(){
		System.out.println("afterClassTest");
	}
}
