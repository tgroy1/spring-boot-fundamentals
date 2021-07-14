package com.tgroy.speldemo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tgroy.speldemo.dto.City;
import com.tgroy.speldemo.dto.Order;
import com.tgroy.speldemo.dto.Shipping;
import com.tgroy.speldemo.dto.User;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private Order order;

	@Autowired
	private User user;

	@Autowired
	private Shipping shipping;

	@Autowired
	private City city;

	@GetMapping("/customer")
	public String getCustomer() {
		return user.getName();
	}

	@GetMapping("/amount")
	public Double getOrderAmount() {
		return order.getAmount();
	}

	@GetMapping("/discount")
	public Double getDiscount() {
		return order.getDiscount();
	}

	@GetMapping("/origin")
	public String getOrigin() {
		return order.getOrigin();
	}

	@GetMapping("/deliveryDays")
	public int getDeliveryDays() {
		return order.getDeliveryDays();
	}

	@GetMapping("/amount/formatted")
	public String getFormattedOrderAmount() {
		return order.getFormattedAmount();
	}

	@GetMapping("/shipping/locations")
	public List<City> getShippingLocations() {
		return order.getShippingLocations();
	}

	@GetMapping("/shipping/locations/nonCapital")
	public List<City> getNonCapitalLocations() {
		return order.getNonCapitalShippingLocations();
	}

	@GetMapping("/shipping/locations/western")
	public Map<String, List<City>> getWesternLocations() {
		return order.getWesternShippingLocations();
	}

	@GetMapping("/shipping/locations/cheap")
	public Integer getCheapLocations() {
		return order.getNoOfCheapShippingLocations();
	}

	@GetMapping("/summary")
	public String getOrderSummary() {
		return order.getOrderSummary();
	}
}
