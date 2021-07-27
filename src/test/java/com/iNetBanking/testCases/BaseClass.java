package com.iNetBanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
//import org.apache.logging.log4j.core.config.Loggers;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import com.iNetBanking.utilities.ReadConfig;

public class BaseClass {
	
	//Getting date from ReadConfig and properties file...
	ReadConfig rc = new ReadConfig();
	public String baseUrl  = rc.getApplicationUrl();
	public String  username = rc.getUsername();
	public String password = rc.getPassword();
	public static WebDriver driver;
	
	
	
	public static Logger logger;
	
	@Parameters("browser")
	@BeforeClass
	public void SetUp(String br) 
	{
		
        logger = Logger.getLogger(BaseClass.class);
		PropertyConfigurator.configure("D:\\Automation\\iNetBanking\\log4j.properties");
		
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",rc.getChromepath());
		driver = new ChromeDriver();
		logger.info("Chrome Browser Launching....");
		}
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",rc.getFirefoxpath());
			driver = new FirefoxDriver();
		}
		else if(br.equals("IE")){
			System.setProperty("webdriver.ie.driver",rc.getIExplorerpath());
			driver = new InternetExplorerDriver();
		}
		//Opening application url..
		driver.manage().window().maximize();
		logger.info("Maximizing Browser....");

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(baseUrl);
		logger.info("Entered Application site URL......");

		
				
	}
	
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
	}
	
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}

}
