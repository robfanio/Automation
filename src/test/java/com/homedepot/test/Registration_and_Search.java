package com.homedepot.test;

import org.testng.annotations.Test;


import com.homedepot.pages.Registration_Page;
import com.homedepot.pages.Search_Page;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Registration_and_Search {
	
	Search_Page search;
	Registration_Page page;
	WebDriver driver;
	
	
	
  @Test
  public void f() {
	  page.ClickAccount();
	  page.ClickRegister();
	  page.SelectAccount();
	  page.Email();
	  page.Password();
	  page.Zipcode();
	  page.Phone();
	  page.CreateAccount();
	  
		  
  }
  
  @Test
  public void g() {
	search.SearchInput();
	search.ClickSearchIcon();
	
  }
  
 
  
  @BeforeMethod
  public void beforeMethod() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);
	  driver.get("https://www.homedepot.com/");
	  driver.manage().window().maximize();
	  page = new Registration_Page(driver);
	  search = new Search_Page(driver);
	 
  }
  @AfterMethod
  public void Close() {
	  driver.close();
	  
  }

}
