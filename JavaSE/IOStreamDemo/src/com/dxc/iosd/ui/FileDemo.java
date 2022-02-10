package com.dxc.iosd.ui;

import java.io.File;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a path");
		String path = sc.next();

		File file = new File(path);
		if(file.exists()) {
			
			if(file.isFile()) {
				System.out.println("This file is: "+file.length()+"byte in size");
			} else {
				System.out.println("The following are contained in this folder: ");
				
				File[] subFiles = file.listFiles();
				
				for(File subFile : subFiles) {
					System.out.println(subFile.isDirectory()?"DIR":"FIL"+ "\t" + subFile.getName()+ "\t" +subFile.length());
				}
			}
		} else {
			System.out.println("File not found");
		}
		sc.close();
	}	
}