package com.homedepot.pages;

import org.openqa.selenium.WebDriver;

import com.homedepot.elements.Search_Element;

public class Search_Page {
	WebDriver driver;
	Search_Element Search;
	
	public Search_Page(WebDriver driver) {
		this.driver = driver;
		Search = new Search_Element(driver);
	}
	public void SearchInput() {
		Search.headInputs.sendKeys("electronics");
	}
	public void ClickSearchIcon() {
		Search.searchIcon.click();
	}
}
