package com.javaTestFour;


public class GoldenHair extends GirlDecorator {
	Girl girl;
	
	GoldenHair(Girl girl){
		this.girl=girl;
	}
	
	@Override
	public String getDescription() {
		 
		return girl.getDescription()+"+with golden hair;";
	}


}
