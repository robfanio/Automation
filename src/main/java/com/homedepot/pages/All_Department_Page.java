package com.homedepot.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.homedepot.elements.All_Daprtment_Elements;

public class All_Department_Page {
	WebDriver driver;
	All_Daprtment_Elements department;
	//Actions action = new Actions(driver);
	
	
	public All_Department_Page(WebDriver driver) {
		this.driver = driver;
		department = new  All_Daprtment_Elements(driver);
				}
	public void HoverDepartment() {
		
		//action.moveToElement(department.departmentNav).build().perform();
		
		department.departmentNav.click();
	}
}
