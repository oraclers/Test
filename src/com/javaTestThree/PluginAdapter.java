package com.javaTestThree;

public class PluginAdapter implements CnPluginInterface{

	EnPlugin enPlugin;
	
	
	public PluginAdapter(EnPlugin enPlugin){
		this.enPlugin=enPlugin;
	}
	
	public void chargeWith2Pins() {
		enPlugin.chargeWith3Pins();
	}

}
