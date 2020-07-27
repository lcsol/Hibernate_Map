package com.hibernate.com.list;

import java.util.Map;

public class Emp {
	private String id;
	private String name;
	private Map<Integer, Address> address;

	public Emp() {
		System.out.println("Empolyee Object Created");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Integer, Address> getAddress() {
		return address;
	}

	public void setAddress(Map<Integer, Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
