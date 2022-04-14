package com.revature.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import com.revature.models.RecordNames;
import com.revature.utils.ConnectionUtil;

public class RecordsDAO implements RecordsDAOInterface {

	ArrayList<RecordNames> recordsList =  new ArrayList<>();
	
	//Add a scanner to the inRecords method so when interacting with the menu
	//people can add records
	//Also, have a switch statement so people can choose to add a record or stop
	//Clear the console so things appear neat and orderly.
	public ArrayList<RecordNames> inputRecords(){
		//Clearing the console's code:
		

	
		return null;
	}

	@Override
	public ArrayList<RecordNames> displayAllRecords() {
		
		try (Connection conn = ConnectionUtil.getConnection()){
			
			//This string sql represents of the SQL Statement
			String sql = "select * from record_names;";
			
			//A statement object is created to execute the query to the database.
			Statement s = conn.createStatement();
			
			//Execute the query into a ResultSet object, which will hold all the data
			ResultSet rs = s.executeQuery(sql);
			
			//This will instantiate an ArrayList to put our Employee objects into
			ArrayList<RecordNames> recordNameList = new ArrayList<>();
			
			//This while loop is used to create the recordName object to populate the
			//ArrayList with them. The ResultSet (rs) from above is holding our data
			while (rs.next()) {
				
				RecordNames r = new RecordNames(
						
						rs.getString("artist_name"),
						rs.getString("album_name"),
						rs.getString("genre_type1"),
						rs.getString("genre_type2"),
						rs.getString("genre_type3"),
						rs.getInt("record_speec"),
						null
						
						
						);
						
				//finished the first part of this -- 
				
				
			}
			
		}
		
		
		
		return null;
	}

	@Override
	public void addMusic() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteMusic() {
		// TODO Auto-generated method stub
		
	}
	
}
