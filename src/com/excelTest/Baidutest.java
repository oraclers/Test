package com.excelTest;

import org.testng.annotations.Test;



public class Baidutest {
	
	
    @Test(dataProvider = "ExcelDataProvider", dataProviderClass = ExcelDataProvider.class)
    public void test1(String URL, String context) {
    	System.out.println(URL);
    	System.out.println(context);
       
}
    @Test(dataProvider = "ExcelDataProvider", dataProviderClass = ExcelDataProvider.class)
    public void test2(String keyA, String keyB, String keyC){
    	System.out.println(keyA);
    	System.out.println(keyB);
    	System.out.println(keyC);
    }
    
    @Test(dataProvider = "ExcelDataProvider", dataProviderClass = ExcelDataProvider.class)
    public void A0_test3(String keyA, String keyB, String keyC){
    	System.out.println(keyA);
    	System.out.println(keyB);
    	System.out.println(keyC);
    }
  
    }