package com.revature.DAO;

import java.util.ArrayList;

import com.revature.models.Sales;

public interface SalesDAOInterface {

	//method for the what platform the records are being sold with
	void update_sale_price();
	
	void purhcase_location();
	
	//method for the the price of sale of the record.
	void purchase_price(); 
	
	//method for adding the name of the buyer
	void sale_location();
	
	//method for adding the buyer's address 
	void sale_price();

	//this method will display the entire catalog of records that is in one's collection
		ArrayList<Sales> displayAllSales();

		void update_sale_price(String purchase_location, String purchase_price, String sale_location, String sale_price,
				int record_id);
		
	
	
}
