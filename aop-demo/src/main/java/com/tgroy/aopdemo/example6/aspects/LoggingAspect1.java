package com.tgroy.aopdemo.example6.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class LoggingAspect1 {
	
	private Logger logger = Logger.getLogger(LoggingAspect1.class.getName());
	
	@Before("execution(public String com.tgroy.aopdemo.example6.Flight.getId())")
	public void loggingAdviceGetId() {
		logger.info("Flight getId method will be called");
	}
	
	@AfterReturning("execution(public * *.print())")
	public void loggingAdvicePrint() {
		logger.warning("A print method has been called");
	}
	
	@Pointcut("within(com.tgroy.aopdemo.example6.Ticket)")
	public void allTicketMethods() {
		
	}
	
	@After("allTicketMethods()")
	public void loggingAdvice(JoinPoint joinPoint) {
		logger.info("A ticket method has been called");
		logger.info(joinPoint.toString());
		logger.info(joinPoint.getTarget().toString());
	}
}
