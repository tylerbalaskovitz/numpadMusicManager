package com.revature.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.models.Login;
import com.revature.utils.ConnectionUtil;

public class LoginDAO implements LoginDAOInterface {

	@Override
	public void addUsername(Login logins) {
		//opening a connection to the database with a try block
		try (Connection conn = ConnectionUtil.getConnection()){
			
		//a String containing what will be put inside of the table of SQL
		String sql = "insert into login_table (username, pword)"
				+ "values(?, ?);";
		
		//Instantiating a PreparedStatement to fill in the variables of the above SQL string
		PreparedStatement ps = conn.prepareStatement(sql);
		
		//filling in the values of the variable using ps.set, etc. Make sure the parameters are filled in for this
		ps.setString(1, logins.getUsername());
		ps.setString(2, logins.getPword());
		
		//Execute the update for putting this information into the DB
		ps.executeUpdate();
		
		
			System.out.println("The username " + logins.getUsername() + " was create. Rock on");
			
			
		} catch (SQLException e) {
			System.out.println("Something went wrong when trying to add a username");
			e.printStackTrace();
		}
		
	}

	@Override
	public void displayUsername() {
		// TODO Auto-generated method stub
		
		
		
		
	}

	@Override
	public void removeUsername() {
		// TODO Auto-generated method stub
		
	}

	
}
