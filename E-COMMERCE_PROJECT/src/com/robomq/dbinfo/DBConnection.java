package com.robomq.dbinfo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	static Connection con;
	public static Connection getConnection() {
		 
		try {
			Class.forName("com.mysql.jdbc.Driver"); //load the driver
			  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","Arun@123Arun@123");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
		
	}
}
