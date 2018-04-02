package com.javaUtilTest;

public class Student {
	public String id;
	public String name;
	
	
	public Student(String id,String name){
		this.id=id;
		this.name=name;
	}
	
	public  void ToString(){
		System.out.println("ID为： "+this.id+" Name为： "+this.name);
	};
}
