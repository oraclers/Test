package com.javaTestOne;

public class HumanMultipleFactory {

	public Male createMale() {

		return new Male();
	}

	public Female createFemale() {
		return new Female();
	}

}
