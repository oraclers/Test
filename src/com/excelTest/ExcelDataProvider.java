package com.excelTest;


import java.io.FileNotFoundException;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

/**
 * @author kaixie
 * @version 1.0.0
 */


public class ExcelDataProvider {

    // ��XML�ı��ļ��л������
        @DataProvider(name = "ExcelDataProvider")
        public static Object[][] getTestDataFromExc(Method m) throws FileNotFoundException {

//            // ͨ�������ú������ƣ�����Ϊ������Է����ṩ��������
//            Object[][] o = new Object[][] {};
//
////            // ȡ�������ݼ�d1Test��ȫ������(excel����Դ)
////            if (m.getName().equals("test1")) {
////                return new BaseExcelData().getData("testA", "DataProvider.xls",0,3);
////            }
////            
////            if (m.getName().equals("test2")) {
////                return new BaseExcelData().getData("testB", "DataProvider.xls",2,5);
////            }
//            
//            //ȡ�������ݼ�d2Test��ȫ������(excel����Դ)
//            if (m.getName().equals("test1")) {
//                return new BaseExcelData().getData("d1Test","DataProvider.xls");
//            }
//            
//            
//            return o;
        	return new BaseExcelData().getData(m.getName(),"DataProvider.xls");
        }
}