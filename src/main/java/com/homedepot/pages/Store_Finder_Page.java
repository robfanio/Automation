package com.homedepot.pages;

import org.openqa.selenium.WebDriver;

import com.homedepot.elements.StoreFinder_Element;

public class Store_Finder_Page {
	WebDriver driver;
	StoreFinder_Element StorePage;

	public Store_Finder_Page(WebDriver driver) {
		this.driver = driver;
		StorePage = new StoreFinder_Element(driver);
	}
	
	public void ClickStore() {
		StorePage.findNav.click();
	}
}
