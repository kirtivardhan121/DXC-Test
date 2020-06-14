package com.dxc.oopd.model;

public class ComplexNumber {

	private int real;
	private int imaginary;
	
	private static int count;
	
	static {
		
		System.out.println("This is peice of code from static block");
		
	}
	
	public ComplexNumber() {
		count++;
		System.out.println(count +"th object is created");
	}
	
	public ComplexNumber(int real, int imaginary) {
		this();
		this.real = real;
		this.imaginary = imaginary;
	}
	
	public ComplexNumber(ComplexNumber z) {
		this(z.real, z.imaginary);
	}
	
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImaginary() {
		return imaginary;
	}
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	
	public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
		return new ComplexNumber(a.real+b.real, a.imaginary+b.imaginary);
	}
		
}
