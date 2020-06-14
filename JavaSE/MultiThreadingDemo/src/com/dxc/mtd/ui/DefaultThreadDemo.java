package com.dxc.mtd.ui;

public class DefaultThreadDemo {

	public static void main(String[] args) {
		
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName());
	}
}
