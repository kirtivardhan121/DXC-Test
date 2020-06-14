package com.dxc.jd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		/*
		 * this step is optional if your runtime is above 1.6
		 */
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
			System.exit(0);
		}

		try( Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dxcbatch","root","root")) {

			PreparedStatement pinsert = con.prepareStatement("Insert into dept values(?,?,?)");

			System.out.println("deptNo: ");
			int deptno = sc.nextInt();

			System.out.println("dname: ");
			String  dname = sc.next();

			System.out.println("location: ");
			String loc = sc.next();

			pinsert.setInt(1, deptno);
			pinsert.setString(2, dname);
			pinsert.setString(3, loc);
			int rowCount = pinsert.executeUpdate();

			System.out.println(rowCount + " record(s) inserted!");
		} catch (SQLException exp) {
			System.out.println(exp.getMessage());
		}

		sc.close();
	}
}
