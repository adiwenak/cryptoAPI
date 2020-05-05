package com.model;

import java.util.List;

// COMMENTS: for all your model try to use lombok package
// You can use @Builder and @Data annotation here
public class Cryptocurrency {

	private String id;
	private double current_price;
	private String market_cap;
	private List<StatusUpdate> statusUpdates;

	public Cryptocurrency() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cryptocurrency(String id, double current_price, String market_cap, List<StatusUpdate> statusUpdates) {
		super();
		this.id = id;
		this.current_price = current_price;
		this.market_cap = market_cap;
		this.statusUpdates = statusUpdates;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getCurrent_price() {
		return current_price;
	}

	public void setCurrent_price(double current_price) {
		this.current_price = current_price;
	}

	public String getMarket_cap() {
		return market_cap;
	}

	public void setMarket_cap(String market_cap) {
		this.market_cap = market_cap;
	}

	public List<StatusUpdate> getStatusUpdates() {
		return statusUpdates;
	}

	public void setStatusUpdates(List<StatusUpdate> statusUpdates) {
		this.statusUpdates = statusUpdates;
	}

}
