package com.tgroy.aopdemo.example6.aspects;

import java.util.logging.Logger;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class LoggingAspect2 {
	
	private Logger logger = Logger.getLogger(LoggingAspect2.class.getName());
	
	@Pointcut("execution(* com.tgroy.aopdemo.example6.*.*set*(..))")
	public void allSetters() {
		
	}
	
	@Around("allSetters()")
	public Object log(ProceedingJoinPoint thisJoinPoint) throws Throwable {
		String methodName = thisJoinPoint.getSignature().getName();
		Object[] methodArgs = thisJoinPoint.getArgs();
		logger.severe("Call method " + methodName + " with arg " + methodArgs[0]);
		Object result = thisJoinPoint.proceed();
		logger.severe("Method " + methodName + " returns " + result);
		return result;
	}
}
