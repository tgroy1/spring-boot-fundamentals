package com.tgroy.aopdemo.example6;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FlightsManager {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("example6/aop.xml");

		Flight flight = (Flight) ctx.getBean("flight");

		flight.print();
		System.out.println(flight.getId());
		flight.setId("AA5678");
		System.out.println(flight.getCompany());

		for (Passenger passenger : flight.getPassengers()) {
			System.out.println(passenger.getName());
			passenger.print();
		}

		Ticket ticket = (Ticket) ctx.getBean("ticket");
		ticket.setNumber("0987654321");

		ctx.close();
	}

}
