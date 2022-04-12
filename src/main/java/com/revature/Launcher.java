package com.revature;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.models.Menu;

public class Launcher {

	public static void main(String[] args) {
		
		//FIrst, we'll try to connect to our database.
		//We'll do this using a try/catch to test our connection
		//remember - the getConnection() method will return a connection object
		
		try(Connection conn = (ConnectionUtil.getConnection())){
			System.out.println("Connection Successful");
		} catch (SQLException e) {
			
			System.out.println("Connection Failed");
			e.printStackTrace();
			
		}
		
		
		
		
		
		
		Menu menu = new Menu();
		
		menu.displayMenu();
		
		
		
	}
	
}
