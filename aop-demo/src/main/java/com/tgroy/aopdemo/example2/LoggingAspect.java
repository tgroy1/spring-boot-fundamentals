package com.tgroy.aopdemo.example2;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class LoggingAspect {
	
	private Logger logger = Logger.getLogger(LoggingAspect.class.getName());
	
	@Before("execution(* *.*Employee(..))")
	public void before() {
		logger.info("Entering method");
	}
	
	@After("execution(* *.*Employee(..))")
	public void after() {
		logger.info("Exiting method");
	}
} 
