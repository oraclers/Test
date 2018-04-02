package com.javaUtilTest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.testng.annotations.Test;

public class FileReaderTest {

	@Test
	public void testFileReader() throws IOException{
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("user.dir")+"\\test.txt");
		File f1=new File(System.getProperty("user.dir")+"\\test.txt");

		if(!f1.exists()){
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			f1.delete();
			try {
				f1.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileInputStream fileIn=new FileInputStream(System.getProperty("user.dir")+"\\testng.xml");
		FileOutputStream fileOut=new FileOutputStream(f1);
		
		int c;
		
		while((c=fileIn.read())!=-1){
			fileOut.write(c);
		};
		

		
		fileIn.close();
		fileOut.close();
		
		
	}
	
	@Test
	public void testBufferStream() throws IOException{		
		
		File f1=new File(System.getProperty("user.dir")+"\\BufferTest.txt");
		if(!f1.exists()){
			f1.createNewFile();
		}else{
			f1.delete();
			f1.createNewFile();
		}
		BufferedInputStream fileIn=new BufferedInputStream(new FileInputStream(System.getProperty("user.dir")+"\\testng.xml"),256);
		BufferedOutputStream fileOut=new BufferedOutputStream(new FileOutputStream(f1),256);
		
		int len;
		byte bArray[]=new byte[256];
		
		len=fileIn.read(bArray);
		fileOut.write(len);
		
		
	}
	
	
	@Test
	public void testDataStream() throws IOException{
		File f1=new File(System.getProperty("user.dir")+"\\DataTest.txt");
		if(!f1.exists()){
			f1.createNewFile();
		}else{
			f1.delete();
			f1.createNewFile();
		}
		
		FileOutputStream fos=new FileOutputStream(f1);
		DataOutputStream dos=new DataOutputStream(fos);
		
		
		dos.writeBoolean(true);
		dos.writeBytes("Hello World!");
		dos.writeInt(123);
		
		FileInputStream fis=new FileInputStream(f1);
		DataInputStream dis=new DataInputStream(fis);
		
		System.out.println(dis.readBoolean());
		System.out.println(dis.read());
		System.out.println(dis.readLine());
			
	}


	@Test
	public void testFileToUnicode() throws IOException{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\testng.xml");
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(fis));
		String s;
		
		while((s=reader.readLine())!=null){
			System.out.println(s);
		}
		
		fis.close();
	}
	
	
	@Test
	public void testFile(){
		String path="D:\\workspace\\Test\\src\\com\\javaTestThree";
		getFile(path);
	}


	public void getFile(String path){
		File file=new File(path);
		File[] fileList=file.listFiles();
		for(File f:fileList){
			if(f.isDirectory()){
				System.out.println(f.getName());
				getFile(f.getAbsolutePath());
			}else{
				System.out.println(f.getName());
			}
		}
	}
	
	
}
	
	
	
