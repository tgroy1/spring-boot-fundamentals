package com.tgroy.aopdemo.example1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeManager {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("example1/aop.xml");

		EmployeeDao employeeDao = (EmployeeDao) ctx.getBean("employeeDao");
		System.out.println(employeeDao.getEmployee(1));

		ctx.close();
	}
}
