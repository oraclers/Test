package com.javaTestOne;

public class HumanStaticFactory {
	public static Human  createMale(){
		return new Male();
	}
	
	public static Human createFemale(){
		return new Female();
	}
}
