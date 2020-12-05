package com.homedepot.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.homedepot.pages.Store_Finder_Page;
import com.homedepot.pages.TruckTool_Page;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationTest {
	TruckTool_Page trucktool;
	Store_Finder_Page store;
	WebDriver driver;
	
  @Test
  public void f() {
	  store.ClickStore();
	
	  
  }
  
  @Test 
  public void g () {
	  trucktool.ClickTrucktool();
	  String url= driver.getCurrentUrl();
	  System.out.println(url);
	  
	  
  }
  
  
  @BeforeMethod 
  public void SetUp() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(4L,TimeUnit.SECONDS);
	  driver.get("https://www.homedepot.com/");
	  driver.manage().window().maximize();
	  store = new Store_Finder_Page(driver);
	  trucktool = new TruckTool_Page(driver);
  }
  
  @AfterMethod
  public void Close() {
	  //driver.close();
  }
}
