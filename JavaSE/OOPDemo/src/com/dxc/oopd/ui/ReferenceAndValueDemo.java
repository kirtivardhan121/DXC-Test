package com.dxc.oopd.ui;

import com.dxc.oopd.model.ComplexNumber;

public class ReferenceAndValueDemo {

	public static void main(String[] args) {
		
int value = 100;
        
        ComplexNumber z = new ComplexNumber();
        z.setReal(200);
        z.setImaginary(250);
        
        System.out.println("Before Step Up");
        System.out.println(value);
        System.out.println(z.getReal() +"," + z.getImaginary());
        
        stepUp(value); // call by value
        stepUp(z); // call by ref
        
        System.out.println("After Step Up");
        System.out.println(value);
        System.out.println(z.getReal() +"," + z.getImaginary());
    }

 

    private static void stepUp(int x) {
        x++;
    }
    
    private static void stepUp(ComplexNumber zx) {
        zx.setReal(zx.getReal()+1);
        zx.setImaginary(zx.getImaginary()+1);
    }
}
