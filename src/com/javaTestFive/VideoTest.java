package com.javaTestFive;

import org.testng.annotations.Test;

public class VideoTest {
	
	VideoSite videoSite=new VideoSite();
	
	
	@Test
	public void test(){
		
		VideoFans PaulLong=new VideoFans("Paul Long");
		VideoFans HanMeiMei=new VideoFans("Han MeiMei");
		VideoFans XiaoMing=new VideoFans("XiaoMing");
		
		videoSite.registerObserver(PaulLong);
		videoSite.registerObserver(HanMeiMei);
		videoSite.registerObserver(XiaoMing);
		
		videoSite.addVideos("CCTV");
		videoSite.addVideos("JXTV");
		videoSite.addVideos("CATV");
		
		videoSite.removeObserver(PaulLong);
		videoSite.removeObserver(HanMeiMei);
		
		videoSite.addVideos("CNN");
		
		
	}
}
