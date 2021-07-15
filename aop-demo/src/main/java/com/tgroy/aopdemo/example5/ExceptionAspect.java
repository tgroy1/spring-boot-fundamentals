package com.tgroy.aopdemo.example5;

import java.util.logging.Logger;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class ExceptionAspect {
	
	private Logger logger = Logger.getLogger(ExceptionAspect.class.getName());
	
	@AfterThrowing(pointcut = "execution(* *(..))", throwing = "exception")
	public void processException(RuntimeException exception) {
		logger.severe(exception.getMessage());
	}
}
