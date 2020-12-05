package com.homedepot.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class NewTestProperties {
  @Test
  public void f() throws IOException {
	  Properties pro=new Properties();
	  FileInputStream fI= new FileInputStream("C:\\Users\\robfa\\Desktop\\cucumber Framework\\homedepot\\config.properties");
	  pro.load(fI);
	  System.out.println(pro.getProperty("name"));
	  System.out.println(pro.getProperty("studentNumber"));
  }
}
