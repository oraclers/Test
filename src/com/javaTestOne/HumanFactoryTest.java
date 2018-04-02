package com.javaTestOne;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Calendar;

public class HumanFactoryTest {
	HumanSignalFactory humanSignalFactory=new HumanSignalFactory();
	HumanMultipleFactory humanMultipleFactory=new HumanMultipleFactory();
	Human human;
	
	@Test
	public void maleTest(){
		human=humanSignalFactory.creatHuman("Male");
		Assert.assertNotNull(human);
		human.eat();
		human.eat();
		human.beat();
	}
	
	
	@Test
	public void femaleTest(){
		human=humanSignalFactory.creatHuman("Female");
		Assert.assertNotNull(human);
		human.eat();
		human.eat();
		human.beat();
	}
	
	@Test
	public void otherTest(){
		human=humanSignalFactory.creatHuman("other");
		Assert.assertNull(human);
	}
	
	
	@Test
	public void createMaleTest(){
		Male male=humanMultipleFactory.createMale();
		Assert.assertNotNull(male);
		male.eat();
		male.sleep();
		male.beat();
	}
	
	
	@Test
	public void createFemaleTest(){
		Female female=humanMultipleFactory.createFemale();
		Assert.assertNotNull(female);
		female.eat();
		female.sleep();
		female.beat();
	}
	
	@Test
	public void createStaticMaleTest(){
		Male male=(Male) HumanStaticFactory.createMale();
		Assert.assertNotNull(male);
		male.eat();
		male.sleep();
		male.beat();
	}
	
	@Test
	public void createStaticFemaleTest(){
		Female female=(Female) HumanStaticFactory.createFemale();
		Assert.assertNotNull(female);
		female.eat();
		female.sleep();
		female.beat();
	}
	
	
	
}
