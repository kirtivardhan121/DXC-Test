package com.dxc.assignments;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class CopyFile {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("C:\\Users\\SOE-Load\\Documents/Assignment6.txt");
		BufferedReader buf = new BufferedReader(new InputStreamReader(is));

		String line = null;
		try {
			line = buf.readLine();
		} catch (IOException e) {

			e.printStackTrace();
		}
		StringBuilder sb = new StringBuilder();

		while(line != null){
			sb.append(line).append("\n");
			line = buf.readLine();
		}

		String fileAsString = sb.toString();
		System.out.println("Contents : " + fileAsString);

		try {
			FileWriter fw=new FileWriter("C:\\Users\\SOE-Load\\Documents/Assignments6.txt");    
			fw.write(fileAsString);    
			fw.close();    
		}catch(Exception e){System.out.println(e);}    
		System.out.println("Success...");    
	}
}

