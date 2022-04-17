package com.revature.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
						
						rs.getInt("record_id"),
						rs.getString("artist_name"),
						rs.getString("album_name"),
						rs.getString("genre_type1"),
						rs.getString("genre_type2"),
						rs.getString("genre_type3"),
						rs.getString("record_speed")
						
						
						
						);
					recordNameList.add(r);	
				//finished the first part of this -- 
			}
			
			return recordNameList;
			
		} 
		catch (SQLException e) {
				System.out.println("There were problems adding the record information to the database.");
				e.printStackTrace();
				
		}
			
		
		
		
		
		return null;
	}

	@Override
	public void addMusic(RecordNames recordToAdd) {
		//adding the try block to create a connection using the ConnectionUtil class we created in the .utils packaage
		
		try (Connection conn = ConnectionUtil.getConnection()){
			
			//this SQL statement uses the INSERT and INTO to put data into the SQL database so
			//that we can add new information into the DBeaver Database.
			
			String sql = "insert into record_names (artist_name, album_name, genre_type1, genre_type2, genre_type3, record_speed)"
					+ "values (?, ?, ?, ?, ?, ?);";
			
			//this prepared statement is used to vill in the variables in the SQL string above.
			PreparedStatement ps = conn.prepareStatement(sql);
			
			
			ps.setString(1, recordToAdd.getArtist_name());
			ps.setString(2, recordToAdd.getAlbum_name());
			ps.setString(3, recordToAdd.getGenre_type1());
			ps.setString(4, recordToAdd.getGenre_type2());
			ps.setString(5, recordToAdd.getGenre_type3());
			ps.setString(6, recordToAdd.getRecord_speed());
			
			ps.executeUpdate();
			
			System.out.println("The artist " + recordToAdd.getArtist_name() + " was added." );
			System.out.println("Their album " + recordToAdd.getAlbum_name() + " was added.");
			System.out.println("This entry's genres are: " + recordToAdd.getGenre_type1()  + ", " + recordToAdd.getGenre_type2() + ", and " + recordToAdd.getGenre_type3() );
			System.out.println("The record's speed is " + recordToAdd.getRecord_speed());
			System.out.println("Enjoy your music.");
			
		} catch (SQLException e) {
			System.out.println("Something went awfully wrong");
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteMusic(int record_id) {
		// TODO Auto-generated method stub
		
try(Connection conn = ConnectionUtil.getConnection()){
			
			//after update is the NAME OF THE TABLE. SET is the columns all of this will occur in. So, we're updating all of the columns.
			//finally, the WHERE specifies where this is occurring so the entire table doesn't get updated. 
			String sql = "delete from record_names where record_id = ?;";
			
			//the prepared statement that will go to the database.
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, record_id);
			
			
			
			
			ps.executeUpdate();
			
			System.out.println("The DELETION was a success" );
			
			
			
		} catch (SQLException e) {
			System.out.println("We failed to DELETE the music entry. Please try again");
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

	@Override
	public void updateMusic(int record_id, String artist_name, String album_name, String genre_type1, String genre_type2, String genre_type3, String record_speed)  {
		
		
		
		//First a connection to the database must first occur
		try(Connection conn = ConnectionUtil.getConnection()){
			
			//after update is the NAME OF THE TABLE. SET is the columns all of this will occur in. So, we're updating all of the columns.
			//finally, the WHERE specifies where this is occurring so the entire table doesn't get updated. 
			String sql = "update record_names set artist_name = ?, album_name = ?, genre_type1 = ?, genre_type2 = ?, genre_type3 = ?, record_speed = ? where record_id = ?;";
			
			//the prepared statement that will go to the database.
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, artist_name);
			ps.setString(2, album_name);
			ps.setString(3, genre_type1);
			ps.setString(4, genre_type2);
			ps.setString(5, genre_type3);
			ps.setString(6, record_speed);
			ps.setInt(7, record_id);
			
			
			
			ps.executeUpdate();
			
			System.out.println("The update was a success :) " );
			
			
			
		} catch (SQLException e) {
			System.out.println("We failed to update the music entry. Please try again");
			e.printStackTrace();
		}
		
		
	}

	
		
	}

	

