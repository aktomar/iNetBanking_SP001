package com.iNetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(how = How.XPATH,using="//*[text()='New Customer']")
	@CacheLookup
	WebElement LinkAddNewCustomer;
	
	@FindBy(how = How.NAME,using="name")
	@CacheLookup
	WebElement CustomerName;
	
	@FindBy(how = How.NAME,using="rad1")
	@CacheLookup
	WebElement SelectGender;
	
	@FindBy(how = How.NAME,using="dob")
	@CacheLookup
	WebElement SelectDOB;
	
	@FindBy(how = How.NAME,using="addr")
	@CacheLookup
	WebElement Address;

	@FindBy(how = How.NAME,using="city")
	@CacheLookup
	WebElement City;
	
	@FindBy(how = How.NAME,using="state")
	@CacheLookup
	WebElement state;
	
	@FindBy(how = How.NAME,using="pinno")
	@CacheLookup
	WebElement PINno;
	
	@FindBy(how = How.NAME,using="telephoneno")
	@CacheLookup
	WebElement TelePhoneno;
	
	@FindBy(how = How.NAME,using="emailid")
	@CacheLookup
	WebElement Emailid;
	
	@FindBy(how = How.NAME,using="res")
	@CacheLookup
	WebElement Reset;

	
	
	//Actions methods....
	
	public void ClickOnAddCustomer() {
		LinkAddNewCustomer.click();
	}
	
	public void AddCustomerName(String name) {
		CustomerName.sendKeys(name);
	}
	
	public void SelectGender() {
		SelectGender.click();
	}
	
	public void SelectDOB(String dd, String mm, String yy) {
		SelectDOB.sendKeys(dd);
		SelectDOB.sendKeys(mm);
		SelectDOB.sendKeys(yy);
		
	}
	
	public void AddCustomerAddress(String addrs) {
		Address.sendKeys(addrs);
	}
	
	public void AddCustomerCity(String cty) {
		City.sendKeys(cty);
	}
	
	public void AddCutomerStste(String Ste) {
		state.sendKeys(Ste);
	}
	
	public void AddCutomerPinNo(String pin) {
		PINno.sendKeys(String.valueOf(pin));
	}
	
	public void AddCutomerTelephoneNo(String teleNo) {
		TelePhoneno.sendKeys(teleNo);
	}
	
	public void AddCutomerEmailid(String email) {
		Emailid.sendKeys(email);
	}
	
	public void ResetCustomerdetails() {
		Reset.click();
	}
	
	

}
