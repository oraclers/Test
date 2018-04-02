package com.excelTest;

import org.testng.annotations.Test;



public class excelTest {
	
    @Test(dataProvider = "ExcelDataProvider", dataProviderClass = ExcelDataProvider.class)
    public void test3(String keyA, String keyB, String keyC){
    	System.out.println(keyA);
    	System.out.println(keyB);
    	System.out.println(keyC);
    }
  
    }