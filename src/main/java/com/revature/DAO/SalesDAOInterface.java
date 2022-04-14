package com.revature.DAO;

import java.util.ArrayList;

import com.revature.models.Sales;

public interface SalesDAOInterface {

	//method for the what platform the records are being sold with
	void locationSale();
	
	//method for the the price of sale of the record.
	void salePrice (); 
	
	//method for adding the name of the buyer
	void buyerName ();
	
	//method for adding the buyer's address 
	void buyerAddress();

	//this method will display the entire catalog of records that is in one's collection
		ArrayList<Sales> displayAllSales();
		
	
	
}
