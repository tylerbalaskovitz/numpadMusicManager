package com.revature.DAO;

import java.util.ArrayList;

import com.revature.models.RecordNames;

public interface RecordsDAOInterface {

	//the following are database methods for adding/deleting records and record types 
	
	
	//artist_name
	void addArtist();
	
	//album_name
	void addAlbumName();
	
	//genre_type1
	void addGenre1();
	
	//genre_type2
	void addGenre2();
	
	//genre_type3
	void addGenre3();
	
	//record_speed
	void addRecordSpeed();
	
	//this method will display the entire catalog of records that is in one's collection
	ArrayList<RecordNames> displayAllRecords();
	
	
	
	
	
	
}
