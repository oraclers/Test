/*** Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao (cnfree2000@hotmail.com) ***/
package com.test;

import org.apache.jmeter.config.Arguments;
import org.apache.jmeter.protocol.java.sampler.AbstractJavaSamplerClient;
import org.apache.jmeter.protocol.java.sampler.JavaSamplerContext;
import org.apache.jmeter.samplers.SampleResult;

import com.test.webservice.Hello;

public class perftest extends AbstractJavaSamplerClient {
	private String a;
	private String b;
	private String resultData;

	public Arguments getDefaultParameters() {
		Arguments params = new Arguments();
		params.addArgument("num1", "");
		params.addArgument("num2", "");
		return params;
	}

	public void setupTest(JavaSamplerContext arg0) {
	}

	public SampleResult runTest(JavaSamplerContext arg0) {
		this.a = arg0.getParameter("num1");
		this.b = arg0.getParameter("num2");
		SampleResult sr = new SampleResult();
		sr.setSampleLabel("Java请求哦");
		try {
			sr.sampleStart();
			Hello test = new Hello();

			this.resultData = String.valueOf(test.sum(Integer.parseInt(this.a),
					Integer.parseInt(this.b)));
			if ((this.resultData != null) && (this.resultData.length() > 0)) {
				sr.setResponseData("结果是：" + this.resultData, null);
				sr.setDataType("text");
			}
			System.out.println(this.resultData);
			sr.setSuccessful(true);
		} catch (Throwable e) {
			sr.setSuccessful(false);
			e.printStackTrace();
		} finally {
			sr.sampleEnd();
		}
		return sr;
	}

	public void teardownTest(JavaSamplerContext arg0) {
	}
	
	
 
    public static void main(String[] args) {  
        Arguments params = new Arguments();  
        params.addArgument("num1", "1");//设置参数，并赋予默认值1  
        params.addArgument("num2", "2");//设置参数，并赋予默认值2 
        JavaSamplerContext arg0 = new JavaSamplerContext(params);  
        perftest test = new perftest();  
        test.setupTest(arg0);  
        test.runTest(arg0); 
        test.teardownTest(arg0);  
    } 
 
}