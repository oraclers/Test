package com.javaUtilTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class CollectionsTest {

	@Test
	public void testList(){
		List<Student> List=new ArrayList<Student>();
		Student stu1=new Student("111","study");
		List.add(stu1);
		List.add(new Student("222","xxxx"));
		List.add(new Student("333","tttt"));
		List.add(0, new Student("444","tttt"));
		List.add(3, new Student("555","tttt"));
		for(Student s:List){
			s.ToString();
		}
		System.out.println("================");
		List.remove(2);
		
		for(Student s:List){
			s.ToString();
		}
		System.out.println("================");
		
		List.remove(stu1);
		for(Student s:List){
			s.ToString();
		}
		System.out.println("================");
		
		Student[] studentList={new Student("666","xxx"),new Student("777","yyy"),new Student("888","zzz")};
		
		List.addAll(Arrays.asList(studentList));
		for(Student s:List){
			s.ToString();
		}
		System.out.println("================");
		
		Iterator<Student> it =List.iterator();
		while(it.hasNext()){
			Student stuX=it.next();
			System.out.println("ID为： "+stuX.id+" Name为： "+stuX.name);
		}
		List.set(3, new Student("xxx","xxxx"));
		System.out.println("================");
		it =List.iterator();
		while(it.hasNext()){
			Student stuX=it.next();
			System.out.println("ID为： "+stuX.id+" Name为： "+stuX.name);
		}
		System.out.println("================");
		List.removeAll(List);
		it =List.iterator();
		while(it.hasNext()){
			Student stuX=it.next();
			System.out.println("ID为： "+stuX.id+" Name为： "+stuX.name);
		}
		
	}



}
