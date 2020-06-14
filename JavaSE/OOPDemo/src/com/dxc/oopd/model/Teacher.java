package com.dxc.oopd.model;

public class Teacher extends Person {

	private String subject;
	
	public Teacher() {
		//left unimplemented
	}

	public Teacher(int pin, String firstName, String lastName, String subject) {
		super(pin, firstName, lastName);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
