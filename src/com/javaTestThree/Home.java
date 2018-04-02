package com.javaTestThree;

public class Home {

	CnPluginInterface cnPluginInterface;
	

	public void setPlugin(CnPluginInterface cnPluginInterface){
		this.cnPluginInterface=cnPluginInterface;
	}
	
	
	public void charge(){
		cnPluginInterface.chargeWith2Pins();
	}
	
	
}
