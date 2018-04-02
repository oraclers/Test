package com.javaTestSix;

import org.testng.annotations.Test;

public class WifeTest {


	@Test(threadPoolSize = 3, invocationCount = 10,  timeOut = 10000) 
	public void test(){
		Wife.getWife();
	}
	
}
