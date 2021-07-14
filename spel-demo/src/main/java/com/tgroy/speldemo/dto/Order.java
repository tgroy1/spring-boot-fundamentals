package com.tgroy.speldemo.dto;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("order")
public class Order {

	@Value("#{100.00 + 200.50 + 301}")
	private double amount;
	@Value("#{order.amount >= 1000 ? order.amount * 5 / 100 : 0}")
	private double discount;
	@Value("#{user.country == 'US' ? 3 : 10}")
	private int deliveryDays;
	@Value("#{user.country}")
	private String origin;
	@Value("#{T(java.text.NumberFormat).getCurrencyInstance(T(java.util.Locale).getDefault()).format(order.amount)}")
	private String formattedAmount;
	@Value("#{shipping.locationsByCountry[user.country]}")
	private List<City> shippingLocations;
	@Value("#{order.shippingLocations.?[isCapital != true]}")
	private List<City> nonCapitalShippingLocations;
	@Value("#{(shipping.locationsByCountry.?[key == 'UK' or key == 'US'])}")
	private Map<String, List<City>> westernShippingLocations;
	@Value("#{order.shippingLocations.?[shipping<30].size()}")
	private Integer noOfCheapShippingLocations;
	@Value("#{user.name}, your order total is #{order.formattedAmount} and the payable amount after discount is #{order.amount - order.discount}.")
	private String orderSummary;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public int getDeliveryDays() {
		return deliveryDays;
	}

	public void setDeliveryDays(int deliveryDays) {
		this.deliveryDays = deliveryDays;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getFormattedAmount() {
		return formattedAmount;
	}

	public void setFormattedAmount(String formattedAmount) {
		this.formattedAmount = formattedAmount;
	}

	public List<City> getShippingLocations() {
		return shippingLocations;
	}

	public void setShippingLocations(List<City> shippingLocations) {
		this.shippingLocations = shippingLocations;
	}

	public List<City> getNonCapitalShippingLocations() {
		return nonCapitalShippingLocations;
	}

	public void setNonCapitalShippingLocations(List<City> nonCapitalShippingLocations) {
		this.nonCapitalShippingLocations = nonCapitalShippingLocations;
	}

	public Map<String, List<City>> getWesternShippingLocations() {
		return westernShippingLocations;
	}

	public void setWesternShippingLocations(Map<String, List<City>> westernShippingLocations) {
		this.westernShippingLocations = westernShippingLocations;
	}

	public Integer getNoOfCheapShippingLocations() {
		return noOfCheapShippingLocations;
	}

	public void setNoOfCheapShippingLocations(Integer noOfCheapShippingLocations) {
		this.noOfCheapShippingLocations = noOfCheapShippingLocations;
	}

	public String getOrderSummary() {
		return orderSummary;
	}

	public void setOrderSummary(String orderSummary) {
		this.orderSummary = orderSummary;
	}
}
