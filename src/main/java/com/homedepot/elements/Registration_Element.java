package com.homedepot.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration_Element {
	WebDriver driver;
	@FindBy(linkText= "My Account")  public WebElement account;
	@FindBy(linkText = "Register") public WebElement register;
	@FindBy(linkText = "Personal Account")public WebElement personalAccount;
	@FindBy(xpath = "//button[@type = 'submit']")public WebElement selectContinue;
	@FindBy(id = "email")public WebElement email;
	@FindBy(id = "password-input-field")public WebElement password;
	@FindBy(id ="zipCode")	public	WebElement zipcode;
	@FindBy(id = "phone") public WebElement phone;
	@FindBy(xpath= "//span[@class='bttn__content' and text()='Create an Account']") public WebElement createAccount;
	
	
	public Registration_Element(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
}
