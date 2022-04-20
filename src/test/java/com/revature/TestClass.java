package com.revature;

import org.junit.Assert;
import org.junit.Test;

import com.revature.DAO.RecordsDAO;
import com.revature.DAO.UserLoginDAO;
import com.revature.models.LoginMenu;

public class TestClass {
	
	
	@Test
	public void testFailedLogin() {
		UserLoginDAO openLoginMenu = new UserLoginDAO();
	Assert.assertFalse(openLoginMenu.login("asdlkfj", "aasdf"));
		
		
		
	}
	
	
	@Test
	public void testPassingLogion() {
		UserLoginDAO openLoginMenu = new UserLoginDAO();
		
		
		Assert.assertTrue(openLoginMenu.login("tyler", "password"));
		
	}
	
	
	
	
	//This is a placeholder Test class
	
	
	//Write good tests! Most entry level dev positions will have you writing tests
	
}
