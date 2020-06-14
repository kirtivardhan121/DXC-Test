package com.dxc.oopd.ui;
import com.dxc.oopd.model.Rectangle;

public class RectangleApp {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		r1.setLength(10);
		r1.setBreadth(10);
		
		Rectangle r2 = new Rectangle();
		r2.setLength(20);
		r2.setBreadth(10);
		
		System.out.println(r2.getLength() +"," +r2.getBreadth());
		System.out.println(r1.getLength() +"," +r1.getBreadth());
	}

}
