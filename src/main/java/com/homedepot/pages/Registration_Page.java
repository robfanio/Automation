package com.homedepot.pages;

import org.openqa.selenium.WebDriver;

import com.homedepot.elements.Registration_Element;

public class Registration_Page {
	WebDriver driver;
	Registration_Element RegisterPage;
	
	public Registration_Page(WebDriver driver) {
		this.driver = driver;
		RegisterPage = new Registration_Element(driver);
	}
	
	public void ClickAccount() {
		 RegisterPage.account.click();
	}
	
	public void ClickRegister() {
		RegisterPage.register.click();
	}
	
	public void SelectAccount() {
		RegisterPage.selectContinue.click();
	}
	
	public void Email() {
		RegisterPage.email.sendKeys("robt381@yahoo.com");
		
	}
	public void Password() {
		RegisterPage.password.sendKeys("orangekey128");
		
	}
	public void Zipcode() {
		RegisterPage.zipcode.sendKeys("08205");
	}
	
	public void Phone() {
		RegisterPage.phone.sendKeys("6095534826");
		
	}
	public void CreateAccount() {
		RegisterPage.createAccount.click();
		
	}
}
