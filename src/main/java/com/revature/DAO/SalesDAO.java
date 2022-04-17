package com.revature.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.models.Employee;
import com.revature.models.Role;
import com.revature.models.Sales;
import com.revature.utils.ConnectionUtil;

public class SalesDAO implements SalesDAOInterface{
	
	SalesDAO saleDAO = new SalesDAO();

	@Override
	public void purhcase_location() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void purchase_price() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sale_location() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sale_price() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Sales> displayAllSales() {
		
	try(Connection conn = ConnectionUtil.getConnection()){
			
			//We need a SQL String with a JOIN
			
			//we need to join employees on roles in order to access the role_title column from the roles table
			//since I want employees to get theirr role title. I need to access both tables
			String sql = "select * from record_names full outer join record_sales "
					+ "on record_id = record_name_id_fk;";
			
			//We have a variable in the SQL statement, so we need a PreparedStatement to fill it in
			PreparedStatement ps = conn.prepareStatement(sql);
			
			//now we just need to input the variable value
			
			
			//Execute the query into a ResultSet object
			ResultSet rs = ps.executeQuery();
			
			//Instantiate an empty ArrayList that we'll fill with the data from the ResultSet
			ArrayList<Sales> salesList = new ArrayList<>();
			
			//While there are records remaining in the ResultSet...
			while(rs.next()) {
				
				//create new Employee objects based on the data, and fill in the ArrayList
				Sales sa = new Sales(
						rs.getInt("record_id"),
						rs.getString("artist_name"),
						rs.getString("album_name"),
						rs.getString("genre_type1"),
						rs.getString("genre_type2"),
						rs.getString("genre_type3"),
						rs.getString("record_speed"),
						//sales table information
						rs.getInt("record_sales_id"),
						rs.getString("purchase_location"),
						rs.getString("purchase_price"),
						rs.getString("sale_location"),
						rs.getString("sale_price"),
						rs.getInt("record_name_id_fk")
						
						);
						
			
				
				Sales sale = saleDAO.
				
				//Fill in the previously null Role variable in this new employee object with the setter.
				saleDAO.
				
				//fill in the employeeList with each while loop until eventually rs.next() == false;
				salesList.add(sa);
				
				
			}
			
			return salesList;
			
		} catch (SQLException e) {
			
			System.out.println("Something went wrong");
			e.printStackTrace();
			
		}
		
		return null;
	}

	
	

}
