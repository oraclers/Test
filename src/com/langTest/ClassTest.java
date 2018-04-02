package com.langTest;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

;

public class ClassTest {

	
	@Test
	public void testClass(){
		
		
		System.out.println(this.getClass().getName());
		System.out.println(this.getClass().getSimpleName());
		System.out.println(this.getClass().getPackage());
		System.out.println(this.getClass().getCanonicalName());
		
		
		Method[] methods=this.getClass().getMethods();
		for(Method method:methods){
			System.out.println(method.getName());
			System.out.println(method.getReturnType());
			System.out.println(method.getParameterCount());
		}
	}
	
	
	@Test
	public void testObject(){
		Object ob=new Object();
		Object ob1=new Object();
		System.out.println(ob.getClass());
		System.out.println(ob.toString());
		System.out.println(ob.hashCode());
		
		System.out.println(ob.equals(ob1));
		
	}
}
