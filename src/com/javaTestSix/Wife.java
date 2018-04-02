package com.javaTestSix;

public class Wife {
	
	private static Wife wife;
	
	public Wife(){};
	
	public static Wife getWife(){
		
		if(wife==null){
			wife=new Wife();
		}
		
		System.out.println(Thread.currentThread().getName()+System.currentTimeMillis()+"test");
		return wife;
	}
}
