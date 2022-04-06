package com.revature.models;

public class RecordNames {

	
	//Private variables for the Record Name Class.
	//Getters, Setters, toString and Constructor boilerplate code is below
	private String artist_name;
	private String album_name;
	private String record_genre;
	private int record_speed;
	
	public RecordNames() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RecordNames(String artist_name, String album_name, String record_genre, int record_speed) {
		super();
		this.artist_name = artist_name;
		this.album_name = album_name;
		this.record_genre = record_genre;
		this.record_speed = record_speed;
	}

	@Override
	public String toString() {
		return "RecordNames [artist_name=" + artist_name + ", album_name=" + album_name + ", record_genre="
				+ record_genre + ", record_speed=" + record_speed + "]";
	}

	public String getArtist_name() {
		return artist_name;
	}

	public void setArtist_name(String artist_name) {
		this.artist_name = artist_name;
	}

	public String getAlbum_name() {
		return album_name;
	}

	public void setAlbum_name(String album_name) {
		this.album_name = album_name;
	}

	public String getRecord_genre() {
		return record_genre;
	}

	public void setRecord_genre(String record_genre) {
		this.record_genre = record_genre;
	}

	public int getRecord_speed() {
		return record_speed;
	}

	public void setRecord_speed(int record_speed) {
		this.record_speed = record_speed;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
