package com.langTest;

import org.testng.annotations.Test;

public class CharacterTest {

	
	@Test
	public void test(){
		char ch='A';
		Character b=new Character(ch);
		Character c=new Character('b');
		
		char[] charArray={'a','1','%','F'};
		
		
		System.out.println(b.charValue());
		System.out.println(b.compareTo(c));
		System.out.println(b.equals(c));
		
		for(int i=0;i<charArray.length;i++){
			if(Character.isAlphabetic(charArray[i])){
				System.out.println(charArray[i]+" is Alphabetic");
			}
			if(Character.isDigit(charArray[i])){
				System.out.println(charArray[i]+" is Digit");
			}
			if(Character.isUpperCase(charArray[i])){
				System.out.println(charArray[i]+" is UpperCase");
			}
			if(Character.isLowerCase(charArray[i])){
				System.out.println(charArray[i]+" is LowerCase");
			}
			System.out.println(Character.toUpperCase(charArray[i]));
			System.out.println(Character.toLowerCase(charArray[i]));
		}
	}
}
