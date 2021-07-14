package com.tgroy.speldemo.dto;

import org.springframework.stereotype.Component;

@Component("city")
public class City {

	private String name;
	private double shipping;
	private boolean capital;

	public City() {

	}

	public City(String name, double shipping, boolean isCapital) {
		this.name = name;
		this.shipping = shipping;
		this.capital = isCapital;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getShipping() {
		return shipping;
	}

	public void setShipping(double shipping) {
		this.shipping = shipping;
	}

	public boolean isCapital() {
		return capital;
	}

	public void setCapital(boolean isCapital) {
		this.capital = isCapital;
	}

}
