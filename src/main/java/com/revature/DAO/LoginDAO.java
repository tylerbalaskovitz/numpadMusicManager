package com.revature.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.revature.models.Login;
import com.revature.utils.ConnectionUtil;

public class LoginDAO implements LoginDAOInterface {


	
	@Override
	public void addUsername(Login login) {
		//opening a connection to the database with a try block
		try (Connection conn = ConnectionUtil.getConnection()){
			
		//a String containing what will be put inside of the table of SQL
		String sql = "insert into login_table (username, pword)"
				+ "values(?, ?);";
		
		//Instantiating a PreparedStatement to fill in the variables of the above SQL string
		PreparedStatement ps = conn.prepareStatement(sql);
		
		//filling in the values of the variable using ps.set, etc. Make sure the parameters are filled in for this
		
	
		ps.setString(1, login.getUsername());
		ps.setString(2, login.getPword());
		
		
		
		//Execute the update for putting this information into the DB
		ps.executeUpdate();
		
		
			System.out.println("The username " + login.getUsername() + " was created. Rock on");
			
			
		} catch (SQLException e) {
			System.out.println("Something went wrong when trying to add a username");
			e.printStackTrace();
		}
		
	}

	@Override
	public ArrayList<Login> displayUsername() {
		// TODO Auto-generated method stub
		
		//starting the connection with the try block
		try (Connection conn = ConnectionUtil.getConnection()){
			String sql = "select * from login_table;";
			
			//Instantiating a Statement object s to execute our query
			Statement s = conn.createStatement();
			
			ResultSet rs = s.executeQuery(sql);
			
			//Instantiating an ArrayList to  put the Login ID's into the table.
			ArrayList<Login> loginList = new ArrayList<>();
			
			while (rs.next()) {
				
				Login l = new Login(
						
						rs.getString("username"),
						rs.getString("pword")
						);
						
			
				
				loginList.add(l);
				
				
				
			}
			return loginList;
		} catch (SQLException e) {
			System.out.println("Something went wrong with the Query");
			e.printStackTrace();
		}
		return null;
		
		
		
	}

	@Override
	public void removeUsername() {
		// TODO Auto-generated method stub
		
	}

	

	
}
