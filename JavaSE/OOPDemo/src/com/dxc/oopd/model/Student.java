package com.dxc.oopd.model;

public class Student extends Person {

	private int clazz;
	
	public Student() {
		//left unimplemented
	}

	public Student(int pin, String firstName, String lastName, int clazz) {
		super(pin, firstName, lastName);
		this.clazz = clazz;
	}

	public int getClazz() {
		return clazz;
	}

	public void setClazz(int clazz) {
		this.clazz = clazz;
	}
	
	
}
