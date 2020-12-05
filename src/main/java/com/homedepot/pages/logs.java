package com.homedepot.pages;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class logs {
	public static Logger  lg= Logger.getLogger(logs.class.getName());

	public static void main(String[] args) {
		PropertyConfigurator.configure("C:\\Users\\robfa\\Desktop\\cucumber Framework\\homedepot\\log.properties");
		lg.info("This is my first log");
	}

}
