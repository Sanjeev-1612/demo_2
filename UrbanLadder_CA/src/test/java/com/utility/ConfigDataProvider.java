package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {

	Properties po;
	
	public ConfigDataProvider() {
		File src=new File(".\\Config\\Config.properties");
		
		try {
			FileInputStream fis=new FileInputStream(src);
			po=new Properties();
			po.load(fis);
		} 
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public String getDataFromConfig(String key) {
		return po.getProperty(key);
	}
	public String getBrowser() {
		return po.getProperty("Browser");
	}
	public String getURL() {
		return po.getProperty("URL");
	}
}
