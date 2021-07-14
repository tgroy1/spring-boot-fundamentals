package com.tgroy.speldemo.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component("shipping")
public class Shipping {

	private Map<String, List<City>> locationsByCountry;
	private Map<String, List<City>> chargesByLocation;

	public Shipping() {
		List<City> usCities = new ArrayList<>();
		usCities.add(new City("New York", 10.00, false));
		usCities.add(new City("Texas", 7.50, false));
		usCities.add(new City("Washington", 12.00, true));

		List<City> ukCities = new ArrayList<>();
		ukCities.add(new City("London", 15.00, true));
		ukCities.add(new City("Cambridge", 17.50, false));
		ukCities.add(new City("Leeds", 10.50, false));

		List<City> indCities = new ArrayList<>();
		indCities.add(new City("New Delhi", 25.00, true));
		indCities.add(new City("Mumbai", 37.50, false));
		indCities.add(new City("Kolkata", 20.50, false));

		this.locationsByCountry = new HashMap<>();
		this.locationsByCountry.put("US", usCities);
		this.locationsByCountry.put("UK", ukCities);
		this.locationsByCountry.put("IN", indCities);

		this.chargesByLocation = new HashMap<>();
		this.chargesByLocation.put("US", usCities);
		this.chargesByLocation.put("UK", ukCities);
		this.chargesByLocation.put("IN", indCities);
	}

	public Map<String, List<City>> getLocationsByCountry() {
		return locationsByCountry;
	}

	public void setLocationsByCountry(Map<String, List<City>> locationsByCountry) {
		this.locationsByCountry = locationsByCountry;
	}

	public Map<String, List<City>> getChargesByLocation() {
		return chargesByLocation;
	}

	public void setChargesByLocation(Map<String, List<City>> chargesByLocation) {
		this.chargesByLocation = chargesByLocation;
	}

}
