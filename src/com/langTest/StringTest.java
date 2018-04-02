package com.langTest;

import org.testng.annotations.Test;

public class StringTest {

	
	@Test
	public void TestString(){
		String str="a2bcsdfasdrqasdf";
	
		System.out.println(str.length());
		System.out.println(str.indexOf("q"));
		System.out.println(str.lastIndexOf("b"));
		System.out.println(str.lastIndexOf(2));
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3,6));
	}
	
	
	@Test
	public void TestStringBuffer(){
		StringBuffer sb=new StringBuffer("testng.xml");
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(3));
		System.out.println(sb.codePointAt(4));
		System.out.println(sb.codePointBefore(4));
		System.out.println(sb.codePointCount(1, 4));
		
		sb.append("-xxxx");
		System.out.println(sb.toString());
		
		sb.insert(2, "rrr");
		System.out.println(sb.toString());
		
		sb.reverse();
		System.out.println(sb.toString());
		
		sb.reverse();
		sb.replace(1, 3, "ccc");
		System.out.println(sb.toString());
		
		sb.delete(1, 3);
		System.out.println(sb.toString());
		
		sb.deleteCharAt(4);
		System.out.println(sb.toString());
		System.out.println(sb.capacity());
		
		sb.trimToSize();
		System.out.println(sb.capacity());
	}
	
}
