package com.iNetBanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		
		File src = new File("./Configuration/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch(Exception e){
			System.out.println("Exception is" + e.getMessage());
		}
	}
	
	//Accessing properties file elements
	
	//Get Application Url...
	public String getApplicationUrl() {
		
		String url = pro.getProperty("baseUrl");
		return url;
	}
    
	//Get Username...
	public String getUsername() {
		
		String username = pro.getProperty("username");
		return username;
	}
    
	//Get password...
    public String getPassword() {
	
	    String password = pro.getProperty("password");
	    return password;
	} 
    
    //Get Chromepath...
    public String getChromepath() {
		
		String chromepath = pro.getProperty("ChromePath");
		return chromepath;
		
	}
    
    //Get firefox path...
    public String getFirefoxpath() {
		
		String firefox = pro.getProperty("firefox");
		return firefox;
		
	}
   
    //Get Internet explorer path
   public String getIExplorerpath() {
		
		String IExplorer = pro.getProperty("IE");
		return IExplorer;
		
	}
}
