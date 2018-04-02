package com.javaUtilTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import org.testng.annotations.Test;

public class MapTest {
	
	
	@Test
	public void testMap(){
		Map<Integer, Course> courses=new HashMap<Integer, Course>();
		Course courseEnglish=new Course("001","英语");
		Course courseChinese=new Course("002","中文");
		Course courseMath=new Course("003","数学");
		Course courseReplace=new Course("004","随机");
		courses.put(1, courseEnglish);
		
		courses.put(2, courseChinese);
		courses.put(3, courseMath);
		
		for(Entry<Integer, Course> item : courses.entrySet()){
			System.out.println("key为： "+item.getKey());
			System.out.println("value为： "+item.getValue().name);
		}
		System.out.println("================");
		courses.remove(2);
		
		for(Entry<Integer,Course>item:courses.entrySet()){
			System.out.println("key为： "+item.getKey());
			System.out.println("value为： "+item.getValue().name);
		}
		
		System.out.println("================");
		courses.replace(1, courseReplace);
		for(Entry<Integer,Course>item:courses.entrySet()){
			System.out.println("key为： "+item.getKey());
			System.out.println("value为： "+item.getValue().name);
		}
		
	}
	
	@Test
	public void testInput(){
		Map<Integer, Course> courses=new HashMap<Integer, Course>();
		Course course;
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<10;i++){
			System.out.println("请输入课程ID： ");
			String courseId= scanner.next();
			System.out.println("请输入课程名称： ");
			String courseName= scanner.next();
			
			course=new Course(courseId,courseName);
			courses.put(i, course);
		}
		
		for(Entry<Integer, Course> item:courses.entrySet()){
			System.out.println("key为： "+item.getKey());
			System.out.println("value为： "+item.getValue().name);
		}
	}
}
