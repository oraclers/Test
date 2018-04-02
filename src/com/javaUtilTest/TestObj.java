package com.javaUtilTest;

public class TestObj<T> {
	private T ob;
	
	public TestObj(T ob){
		this.ob=ob;
	}
	
	
	public T getOb(){
		return ob;
	}
	
	
	public void setOb(T ob){
		this.ob=ob;
	}
	
	public void showOb(){
		System.out.println("T的实际类型是： "+ob.getClass().getName());
	}
	
}
