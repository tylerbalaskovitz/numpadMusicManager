package com.revature.models;

public class RecordNames {

	
	//Private variables for the Record Name Class.
	//Getters, Setters, toString and Constructor boilerplate code is below
	private String artist_name;
	private String album_name;
	private String genre_type1;
	private String genre_type2;
	private String genre_type3;
	private String record_speed;
	
	
	
	@Override
	public String toString() {
		return "RecordNames [artist_name=" + artist_name + ", album_name=" + album_name + ", genre_type1=" + genre_type1
				+ ", genre_type2=" + genre_type2 + ", genre_type3=" + genre_type3 + ", record_speed=" + record_speed
				+ "]";
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
	
	public String getGenre_type1() {
		return genre_type1;
	}
	
	public void setGenre_type1(String genre_type1) {
		this.genre_type1 = genre_type1;
	}
	
	public String getGenre_type2() {
		return genre_type2;
	}
	
	public void setGenre_type2(String genre_type2) {
		this.genre_type2 = genre_type2;
	}
	
	public String getGenre_type3() {
		return genre_type3;
	}
	
	public void setGenre_type3(String genre_type3) {
		this.genre_type3 = genre_type3;
	}
	
	public String getRecord_speed() {
		return record_speed;
	}
	
	public void setRecord_speed(String record_speed) {
		this.record_speed = record_speed;
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
