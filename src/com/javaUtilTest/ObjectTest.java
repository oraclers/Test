package com.javaUtilTest;

import com.javaUtilTest.TestObj;
import org.testng.annotations.Test;

public class ObjectTest {

	
	@Test
	public void testObject(){
		TestObj<String> testStr=new TestObj<String>("ObjectTest");

		System.out.println(testStr.getOb());
		testStr.showOb();
		
		testStr.setOb("SetObjectTest");
		System.out.println(testStr.getOb());
		
		
		TestObj<Student> testStu=new TestObj<Student>(new Student("111","xxxx"));
		
		System.out.println("ID为： "+testStu.getOb().id+",Name为： "+testStu.getOb().name);
		testStu.showOb();
		
		Student newStudent=new Student("222","zzzzz");
		testStu.setOb(newStudent);
		System.out.println("ID为： "+testStu.getOb().id+",Name为： "+testStu.getOb().name);
		
		
	}
	
	
	
	
	
}
