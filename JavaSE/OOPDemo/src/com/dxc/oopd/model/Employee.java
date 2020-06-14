package com.dxc.oopd.model;

public class Employee {

	private int empid;
	private String name;
	private double basic;
	
	public Employee() {
		//left unimplemented
	}

	public Employee(int empid, String name, double basic) {
		super();
		this.empid = empid;
		this.name = name;
		this.basic = basic;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	
}
