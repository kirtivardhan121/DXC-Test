package com.dxc.oopd.ui;
import com.dxc.oopd.model.ComplexNumber;
public class ComplexNumberApp {

	public static void main(String[] args) {
		
		ComplexNumber z1 = new ComplexNumber();
		z1.setReal(10);
		z1.setImaginary(5);
		
		ComplexNumber z2 = new ComplexNumber();
		z2.setReal(20);
		z2.setImaginary(-3);

		System.out.println(z1.getReal()+ "," + z1.getImaginary());
		System.out.println(z2.getReal()+ "," + z2.getImaginary());
		
		ComplexNumber z4 = new ComplexNumber(2,8);
		System.out.println(z4.getReal()+ "," + z4.getImaginary());
		
		ComplexNumber z5 = new ComplexNumber(z4);
		System.out.println(z5.getReal()+ "," + z5.getImaginary());
		
		ComplexNumber z6 = new ComplexNumber().add(z1, z5);
		System.out.println(z6.getReal()+ "," + z5.getImaginary());
	}

}
