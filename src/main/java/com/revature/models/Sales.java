package com.revature.models;

public class Sales {

	//the data that is used within the first table record_names for doing full outer joins
	private int record_id;
	private String artist_name;
	private String album_name;
	private String genre_type1;
	private String genre_type2;
	private String genre_type3;
	private String record_speed;
	
	//all the columns used in the second table record_sales
	private int record_sales_id;
	private String purchase_location;
	private String purchase_price;
	private String sale_location;
	private String sale_price;
	private int record_sales_id_fk;
	
	
	public Sales(int record_id, String artist_name, String album_name, String genre_type1, String genre_type2,
			String genre_type3, String record_speed) {
		super();
		this.record_id = record_id;
		this.artist_name = artist_name;
		this.album_name = album_name;
		this.genre_type1 = genre_type1;
		this.genre_type2 = genre_type2;
		this.genre_type3 = genre_type3;
		this.record_speed = record_speed;
	}

	
	

	public int getRecord_id() {
		return record_id;
	}




	public void setRecord_id(int record_id) {
		this.record_id = record_id;
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




	public int getRecord_sales_id() {
		return record_sales_id;
	}




	public void setRecord_sales_id(int record_sales_id) {
		this.record_sales_id = record_sales_id;
	}




	public String getPurchase_location() {
		return purchase_location;
	}




	public void setPurchase_location(String purchase_location) {
		this.purchase_location = purchase_location;
	}




	public String getPurchase_price() {
		return purchase_price;
	}




	public void setPurchase_price(String purchase_price) {
		this.purchase_price = purchase_price;
	}




	public String getSale_location() {
		return sale_location;
	}




	public void setSale_location(String sale_location) {
		this.sale_location = sale_location;
	}




	public String getSale_price() {
		return sale_price;
	}




	public void setSale_price(String sale_price) {
		this.sale_price = sale_price;
	}




	public int getRecord_sales_id_fk() {
		return record_sales_id_fk;
	}




	public void setRecord_sales_id_fk(int record_sales_id_fk) {
		this.record_sales_id_fk = record_sales_id_fk;
	}




	@Override
	public String toString() {
		return "Sales [record_id=" + record_id + ", artist_name=" + artist_name + ", album_name=" + album_name
				+ ", genre_type1=" + genre_type1 + ", genre_type2=" + genre_type2 + ", genre_type3=" + genre_type3
				+ ", record_speed=" + record_speed + ", record_sales_id=" + record_sales_id + ", purchase_location="
				+ purchase_location + ", purchase_price=" + purchase_price + ", sale_location=" + sale_location
				+ ", sale_price=" + sale_price + ", record_sales_id_fk=" + record_sales_id_fk + "]";
	}




	public Sales(int record_sales_id, String purchase_location, String purchase_price, String sale_location,
			String sale_price, int record_sales_id_fk) {
		super();
		this.record_sales_id = record_sales_id;
		this.purchase_location = purchase_location;
		this.purchase_price = purchase_price;
		this.sale_location = sale_location;
		this.sale_price = sale_price;
		this.record_sales_id_fk = record_sales_id_fk;
	}


	


	public Sales(int record_id, String artist_name, String album_name, String genre_type1, String genre_type2,
			String genre_type3, String record_speed, int record_sales_id, String purchase_location,
			String purchase_price, String sale_location, String sale_price, int record_sales_id_fk) {
		super();
		this.record_id = record_id;
		this.artist_name = artist_name;
		this.album_name = album_name;
		this.genre_type1 = genre_type1;
		this.genre_type2 = genre_type2;
		this.genre_type3 = genre_type3;
		this.record_speed = record_speed;
		this.record_sales_id = record_sales_id;
		this.purchase_location = purchase_location;
		this.purchase_price = purchase_price;
		this.sale_location = sale_location;
		this.sale_price = sale_price;
		this.record_sales_id_fk = record_sales_id_fk;
	}




	public Sales() {
		super();
		// TODO Auto-generated constructor stub
		
		
		
		
		
	}
	
}
