package com.revature.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	//recreating the ConnectionUtil to reinforce the code written previously
	
	public static Connection getConnection() throws SQLException {
		
		try {
			Class.forName("org.postgresql.Driver"); // This searches for the Postgresql driver
			// we have  dependency on this driver that helps u connection
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("A problem occurreding locating the drive. Check your ConnectionUtil file");
		}
		
		//Creating the credentials in the string so that way the proper database will be accessed and 
		//data will be added to it.
		String url = "jdbc:postgresql://localhost:5432/postgres?currentSchema=record_names"; //the records name database in postgresql
		String username = "postgres";
		String password = "password";
		
		return DriverManager.getConnection(url, username, password);
	}
	
	
}
