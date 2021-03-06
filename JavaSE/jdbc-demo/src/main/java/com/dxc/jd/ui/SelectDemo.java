package com.dxc.jd.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDemo {

	public static void main(String[] args) {

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

			PreparedStatement pselect = con.prepareStatement("SELECT deptno,dname,loc FROM dept");
			ResultSet rs = pselect.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1) +"\t"+ rs.getString(2) +"\t"+ rs.getString(3) );
			}
		}catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
