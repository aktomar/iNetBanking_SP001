package com.iNetBanking.testCases;


import org.testng.annotations.Test;

import com.iNetBanking.pageObjects.AddCustomerPage;
import com.iNetBanking.pageObjects.LoginPage;

public class TC_AddCustomerDetails_002 extends BaseClass {
	
	
	
	@Test
	public void AddCutomerDetails() throws InterruptedException {
		
		LoginPage lp = new LoginPage(driver);
	    lp.SetUserName(username);
		logger.info("Username Succesfully entered ...");
		lp.SetPassword(password);
		logger.info("password Succesfully entered ...");
        lp.ClickSubmit();
		logger.info("button clicked ...");

		
		Thread.sleep(3000);
		
		AddCustomerPage Cp = new AddCustomerPage(driver);
		Cp.ClickOnAddCustomer();
		logger.info("Clicked on Edit customer ...");

		Cp.AddCustomerName("Akshay");
		logger.info("Customer name entered ...");

		Cp.SelectGender();
		logger.info("Gender selected...");

		Cp.SelectDOB("17","07","1998");
		logger.info("DOB selected ...");

		Cp.AddCustomerAddress("B-104, Sagar Avenue");
		logger.info("Customer address entered ...");

		Cp.AddCustomerCity("Bhopal");
		logger.info("Customer city entered ...");

		Cp.AddCutomerStste("Madhay Pradesh");
		logger.info("Customer State entered ...");

		Cp.AddCutomerPinNo("213001");
		logger.info("Customer PIN Code entered ...");

		Cp.AddCutomerTelephoneNo("8982405678");
		logger.info("Customer Telephone number entered ...");

		Cp.AddCutomerEmailid("meakshay2123@gmail.com");
		logger.info("Customer mailID entered ...");

		Cp.ResetCustomerdetails();
		logger.info("Reset all cutomer details...");

		
	}

}
