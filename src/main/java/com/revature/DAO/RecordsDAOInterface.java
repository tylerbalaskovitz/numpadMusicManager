package com.revature.DAO;

import java.util.ArrayList;

import com.revature.models.RecordNames;

public interface RecordsDAOInterface {

	//the following are database methods for adding/deleting records and record types 
	
	
	//add all attributes from the 
	void addMusic(RecordNames RecordsToAdd);
	
	
	void deleteMusic(int record_id);
	
	
	
	//this method will display the entire catalog of records that is in one's collection
	ArrayList<RecordNames> displayAllRecords();

	//this method will update the music based on the login_id key specified by the user.
	void updateMusic(int record_id, String artist_name, String album_name, String genre_type1, String genre_type2, String genre_type3,
			String record_speed);
	
	
	
	
	
	
}
