package com.dxc.oopd.model;

public abstract class Person {

	private int pin;
	private String firstName;
	private String lastName;
	
	public Person() {
		//left unimplemented
	}

	public Person(int pin, String firstName, String lastName) {
		super();
		this.pin = pin;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
