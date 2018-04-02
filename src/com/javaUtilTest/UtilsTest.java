package com.javaUtilTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

import org.testng.annotations.Test;

public class UtilsTest {

	@Test
	public void testData(){
		Date data=new Date();
		long times = 1412654676572L;
		Date data2=new Date(times);
		System.out.println(data);
		System.out.println(data2);
		System.out.println(data.getDate());
		System.out.println(data.getTimezoneOffset());
		System.out.println(data.after(data2));
		
		
		long curTimes=data.getTime();
		System.out.println(curTimes);
		
		CharSequence charSequence=data.toString().subSequence(11, 19);
		System.out.println(data.toString().substring(11,19));
		
		System.out.println(charSequence.toString());
		
	}
	
	
	@Test
	public void testCalendar(){
		GregorianCalendar gregorianCalendar=new GregorianCalendar();
		System.out.println(gregorianCalendar.getTime());
		System.out.println(gregorianCalendar.getFirstDayOfWeek());
		System.out.println(gregorianCalendar.getWeekYear());
		
		DateFormat dtf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		String str=dtf.format(new Date()); 
		
		System.out.println("当前日期为："+str);

		Calendar calendar=Calendar.getInstance();
		calendar.setTime(new Date());
		
		System.out.println("当前日期为："+calendar.get(1));
		System.out.println("当前日期为："+calendar.get(2));
		System.out.println("当前日期为："+calendar.get(3));
		System.out.println("当前日期为："+calendar.get(4));
		System.out.println("当前日期为："+calendar.get(5));
		System.out.println("当前日期为："+calendar.get(6));
		System.out.println("当前日期为："+calendar.get(Calendar.HOUR));
		System.out.println("当前日期为："+calendar.get(Calendar.MONTH));
		
		
		calendar.add(Calendar.YEAR, 3);
		System.out.println("当前日期为："+calendar.getTime());
		
		
		calendar.add(Calendar.MONTH, 3);
		System.out.println("当前日期为："+calendar.getTime());
		
	}
	
	@Test
	public void testRandom(){
		Random random=new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextDouble());
		System.out.println(random.nextBoolean());
	}
}
