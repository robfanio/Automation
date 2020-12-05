package com.homedepot.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Element {
	WebDriver driver;
	@FindBy(id ="headerSearch")public WebElement headInputs;
	@FindBy(css = "svg.SearchBox__buttonIcon") public WebElement searchIcon;
	
	public Search_Element(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
