package com.tgroy.aopdemo.example2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class EmployeeManager {

	public static void main(String[] args) {

		//ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("example2/aop.xml");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//EmployeeDao employeeDao = (EmployeeDao) ctx.getBean("employeeDao");
		EmployeeDao employeeDao = (EmployeeDao) ctx.getBean(EmployeeDao.class);
		System.out.println(employeeDao.getEmployee(2));

		//ctx.close();
	}
}
