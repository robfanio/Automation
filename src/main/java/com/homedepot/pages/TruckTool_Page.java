package com.homedepot.pages;

import org.openqa.selenium.WebDriver;

import com.homedepot.elements.TruckTool_Element;

public class TruckTool_Page {
	WebDriver driver;
	TruckTool_Element Trucktoolpage;
	
	public TruckTool_Page(WebDriver driver) {
		this.driver=driver;
		Trucktoolpage = new TruckTool_Element(driver);
	}
	
	
	public void ClickTrucktool() {
		Trucktoolpage.TruckTool.click();
	}

}
