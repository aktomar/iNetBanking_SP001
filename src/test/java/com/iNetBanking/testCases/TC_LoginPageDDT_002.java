package com.iNetBanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.iNetBanking.pageObjects.LoginPage;
import com.iNetBanking.utilities.XUtils;

public class TC_LoginPageDDT_002 extends BaseClass{
	
	@Test(dataProvider="LoginData")
	public void LoginDDT(String user, String pswrd) throws InterruptedException {
		
		LoginPage login = new LoginPage(driver);
		login.SetUserName(user);
		login.SetPassword(pswrd);
		login.ClickSubmit();
		
		Thread.sleep(3000);
		
		
		if(isAlertPresent()==true) {
			
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(true);
			logger.warn("Login failed");
			
		}
		else
		{
			Assert.assertTrue(true);
			logger.info("Login Passed...");
			login.ClickLogout();
			Thread.sleep(3000);
            driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			
			
		}
		
	}
	
	
	
	
	public boolean isAlertPresent() {
		
		try {
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
		  return false;
		}
		
		
		
		
	}
	
	
	@DataProvider(name="LoginData")
	String[][]getData() throws IOException{
		
		String path = System.getProperty("user.dir")+"/src/test/java/com/iNetBanking/testData/LoginData.xlsx";
		
		int rownum=XUtils.getRowCount(path, "Sheet1");
		int colcount=XUtils.getCellCount(path, "Sheet1",1);
		
		String logindata[][] = new String[rownum][colcount];
		
		for (int i=1;i<=rownum;i++)
		{
			
			for (int j=0;j<colcount;j++)
			{
			logindata[i-1][j]=XUtils.getCellData(path,"sheet1", i,j);
			
			}
		}
		return logindata;
		
	}

}
