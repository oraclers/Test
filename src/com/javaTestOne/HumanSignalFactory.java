package com.javaTestOne;

public class HumanSignalFactory {
	public Human creatHuman(String gendar){
		if(gendar.equals("Male")){
			return new Male();
		}else if(gendar.equals("Female")){
			return new Female();
		}else{
			System.out.println("输入性别错误！");
			return null;
		}
	}
}
