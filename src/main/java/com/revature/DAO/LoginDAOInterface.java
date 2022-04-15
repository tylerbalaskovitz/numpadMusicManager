package com.revature.DAO;

import com.revature.models.Login;

public interface LoginDAOInterface {

	//A method for adding a user name and a password to the database
	void addUsername(Login login);
	
	//this method will display all of the username and passwords in the database
	void displayUsername();
	
	//This method will allow you to delete a username and their password from the database.
	void removeUsername();
	
	
	
	
	
	
}
