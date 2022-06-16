package com.facebook.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.bouncycastle.util.Properties;

public class ConfigurationReader {
	Properties ps;
	public ConfigurationReader() throws IOException {
		File fp =new File ("src\\test\\java\\com\\facebook\\helper\\facebook.property");
		FileInputStream fis =new FileInputStream(fp);
		ps = new Properties();
		ps.Load(fis);
	}

	public String launchBroser() {
		String broswerName1= ps.getPropertyValue("Browser");
		return broswerName1;
	}
     public String brosweUrl() {
    	 String address= ps.getPropertyValue("url");
    	 return address;
    	 
     }





