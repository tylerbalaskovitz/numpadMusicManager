package com.revature.DAO;

import java.util.ArrayList;

import com.revature.models.RecordNames;

public interface RecordsDAOInterface {

	//the following are database methods for adding/deleting records and record types 
	
	
	//add all attributes from the 
	void addMusic(RecordNames RecordsToAdd);
	
	void deleteMusic();
	
	//this method will display the entire catalog of records that is in one's collection
	ArrayList<RecordNames> displayAllRecords();
	
	
	
	
	
	
}
