package com.hibernate.com.list;

public class Address {
	private String aid;
	private String street;
	private String state;

	public Address() {
		System.out.println("Address Object Created");
	}

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", state=" + state + "]";
	}

}
