package com.javaTestThree;

import org.testng.annotations.Test;

public class HomeChargeTest {
	
	
	Home home=new Home();
	EnPlugin enPlugin=new EnPlugin();
	CnPlugin cnPlugin=new CnPlugin();
	
	PluginAdapter pluginAdapter=new PluginAdapter(enPlugin);
	
	
	@Test
	public void enPluginChargeTest(){
		enPlugin.chargeWith3Pins();
	}
	
	@Test
	public void enPluginAdapterChargeTest(){
		pluginAdapter.chargeWith2Pins();
	}
	
	
	@Test
	public void cnPluginChargeTest(){
		cnPlugin.chargeWith2Pins();
	}
	
	@Test
	public void homeCnPluginChargeTest(){
		home.setPlugin(cnPlugin);
		home.charge();
	}
	
	@Test
	public void homeEnPluginChargeTest(){
		home.setPlugin(pluginAdapter);
		home.charge();
	}
	
}
