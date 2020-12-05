package com.homedepot.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class All_Daprtment_Elements {
	
	WebDriver driver;
	
	@FindBy(linkText = "All Departments")public WebElement departmentNav;
	
	
	
	public All_Daprtment_Elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
