package com.homedepot.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TruckTool_Element {
	WebDriver driver;
	
	@FindBy(linkText="Truck & Tool Rental") public WebElement TruckTool;
	
	
	public TruckTool_Element(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}

}
