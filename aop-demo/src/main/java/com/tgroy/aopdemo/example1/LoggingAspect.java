package com.tgroy.aopdemo.example1;

import java.util.logging.Logger;

public class LoggingAspect {
	
	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
	
	public void before() {
		logger.info("Entering method");
	}
	
	public void after() {
		logger.info("Exiting method");
	}
} 
