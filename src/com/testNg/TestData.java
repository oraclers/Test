package com.testNg;

public class TestData {

	public String url;
	public String projId;
	public String tempId;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getProjId() {
		return projId;
	}

	public void setProjId(String projId) {
		this.projId = projId;
	}

	public String getTempId() {
		return tempId;
	}

	public void setTempId(String tempId) {
		this.tempId = tempId;
	}

	public TestData getTestData(String testFlag){
		if(testFlag.equals("test")){
			this.setProjId("projId-test");
			this.setTempId("tempId-test");
			this.setUrl("url-test");
			
		}else{
			this.setProjId("projId-online");
			this.setTempId("tempId-online");
			this.setUrl("url-online");
		}

		return this;
	}
	
	
}
