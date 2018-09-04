package com.kumar.Work;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.xml.sax.SAXException;



public class App 
{
    public static void main(String[] args )
    {
    	try{
    	ApplicationContext context = new ClassPathXmlApplicationContext("NewFile.xml");
    	
    	
    	MethodsFile mef = (MethodsFile) context.getBean("MethodsFile");
    	mef.display2();
    }catch (IOException | SAXException | ParserConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
    }
}
}