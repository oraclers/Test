package com.javaUtilTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.Test;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class SetTest {
	
	@Test
	public void testSet(){
		
		Student stu1=new Student("1","stu1");
		Student stu2=new Student("2","stu2");
		Student stu3=new Student("3","stu3");
		Student stu4=new Student("4","stu4");
		
		Set<Student> students=new HashSet<Student>();
		students.add(stu1);
		students.add(stu2);
		students.add(stu3);
		
		students.remove(stu3);
		Iterator<Student> it=students.iterator();
		
		while(it.hasNext()){
			Student stu=it.next();
			stu.ToString();
		}
		System.out.println("================");
		
		PD pd=new PD("001","王老师");
		
		pd.students=students;
		
		for(Student stu:pd.students){
			stu.ToString();
		}
		
		Student[] studentList={new Student("5","sut5"),new Student("6","sut6"),new Student("7","sut7")};
		
		students.addAll(Arrays.asList(studentList));
		
		System.out.println("================");
		it=students.iterator();
		while(it.hasNext()){
			Student stu=it.next();
			stu.ToString();
		}
		
	}
}
