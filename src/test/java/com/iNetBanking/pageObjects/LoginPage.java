package com.iNetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpasword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy(xpath="/html/body/div[3]/div/ul/li[10]/a")
	@CacheLookup
	WebElement logout;
	//Creating action methods
	
	public void SetUserName(String uname) {
		txtusername.sendKeys(uname);
		}
	public void SetPassword(String psswd) {
		txtpasword.sendKeys(psswd);
	}
	public void ClickSubmit() {
		btnlogin.click();
	}
	public void ClickLogout() {
		logout.click();
	}
	
	

}
