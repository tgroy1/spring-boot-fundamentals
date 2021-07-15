package com.tgroy.aopdemo.example6;

public class Ticket {

	private String number;
	private Passenger passenger;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public String emittingCountry() {
		return passenger.getCountry();
	}

	@Override
	public String toString() {
		return "Ticket [number=" + number + "]";
	}

}
