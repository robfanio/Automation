package com.homedepot.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.homedepot.pages.All_Department_Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class All_Department_Test {
	WebDriver driver;
	All_Department_Page department;
  @Test
  public void f() {
	  department.HoverDepartment();
  }
  
  @BeforeMethod
  public void beforeMthod() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.homedepot.com/");
	  driver.manage().window().maximize();
	  department = new All_Department_Page(driver);
  }
}
