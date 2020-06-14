package com.dxc.iosd.ui;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadTextFromFile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter file name: ");
		String fileName = sc.next();

		File file = new File(fileName);
		
		if(file.exists() && file.isFile()) {
			System.out.println("The file content is as \n\n");
			
			try(BufferedReader fin = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
				
				String line = "";
				while((line=fin.readLine())!=null) {
					System.out.println(line);
				}
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}
			
		} else {
			System.out.println("File not found");
		}
		
		sc.close();
	}
}
