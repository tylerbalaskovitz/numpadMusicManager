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
				Sales e = new Sales(
						rs.getInt("employee_id"),
						rs.getString("first_name"),
						rs.getString("last_name"),
						null
						);
						
				//get the foreign key from the Employees table to user in our getRoleByID emthod
				int roleFK = rs.getInt("role_id_fk");
				
				Sale sale = saleDAO.getRoleByID(roleFK);
				
				//Fill in the previously null Role variable in this new employee object with the setter.
				saleDAO.getRoleByID(roleFK);
				
				//fill in the employeeList with each while loop until eventually rs.next() == false;
				salesList.add(e);
				
				
			}
			
			return salesList;
			
		} catch (SQLException e) {
			
			System.out.println("Something went wrong");
			e.printStackTrace();
			
		}
		
		return null;
	}

	
	

}
