package com.revature.models;

public class GenreTypes {

		//Multiple private Strings for music that doesn't specifically fit into one genre.
		//IE: experiment, electronic, avant-garde.
		//Decades are also include since music genres can differ throughout the decades.
	private String genre_type1;
	private String genre_type2;
	private String genre_type3;
	private int decade;
	
	public GenreTypes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GenreTypes(String genre_type1, String genre_type2, String genre_type3, int decade) {
		super();
		this.genre_type1 = genre_type1;
		this.genre_type2 = genre_type2;
		this.genre_type3 = genre_type3;
		this.decade = decade;
	}

	@Override
	public String toString() {
		return "GenreTypes [genre_type1=" + genre_type1 + ", genre_type2=" + genre_type2 + ", genre_type3="
				+ genre_type3 + ", decade=" + decade + "]";
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

	public int getDecade() {
		return decade;
	}

	public void setDecade(int decade) {
		this.decade = decade;
	}
	
	
	
	
	
	
}
