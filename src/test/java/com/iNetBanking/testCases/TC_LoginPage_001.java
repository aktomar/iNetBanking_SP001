package com.iNetBanking.testCases;

import java.io.IOException;

//import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.iNetBanking.pageObjects.LoginPage;

public class TC_LoginPage_001 extends BaseClass
{

	
	@Test
	public void LoginTest() throws IOException 
	{
		
		LoginPage lp = new LoginPage(driver);
		lp.SetUserName(username);
		logger.info("Username Entered....");
		lp.SetPassword(password);
		logger.info("Password Entered....");
		lp.ClickSubmit();
		logger.info("Submit Button Clicked....");
		
		
		
	//Verifying home page title....	
	if(driver.getTitle().equals("GTPL Bank Manager HomePage")) {
		
		Assert.assertTrue(true);
		logger.info("Title verfiied sucessfully....");

		//logger.info("Title verified....");
		
	}
	else {
		captureScreen(driver,"LoginTest");
		Assert.assertTrue(false);
	}
		
		
		
	}
	
	
}
