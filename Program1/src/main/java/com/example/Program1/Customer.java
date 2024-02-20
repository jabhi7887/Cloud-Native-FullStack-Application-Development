package com.example.Program1;

public class Customer {
	String name, address;
	Ticket tick;
	public Ticket getTick() {
	return tick;
	}
	public void setTick(Ticket tick) {
	this.tick = tick;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getAddress() {
	return address;
	}
	public void setAddress(String address) {
	this.address = address;
	}
}
