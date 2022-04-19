package com.revature;

import org.junit.Assert;
import org.junit.Test;

import com.revature.DAO.RecordsDAO;
import com.revature.DAO.UserLoginDAO;
import com.revature.models.LoginMenu;

public class TestClass {
	/*
	@Test
	public void TestLoginMenu() {
		LoginMenu openLoginMenu = new LoginMenu();
		boolean menutest = true;
	openLoginMenu.displayLoginMenu() = menutest;
		Assert.
	}
*/
	
	@Test
	public void testFailedLogin() {
		UserLoginDAO openLoginMenu = new UserLoginDAO();
		
		
	Assert.assertThat(openLoginMenu.login("asdlkfj", "aasdf") == false);
		
		
		
	}
	
	@Test
	public void testPassingLogion() {
		UserLoginDAO openLoginMenu = new UserLoginDAO();
		
		
		Assert.assertThat(openLoginMenu.login("tyler", "password") == true);
		
	}
	
	@Test
	public void DeleteReocord() {
		RecordsDAO recordTestDeletion = new RecordsDAO();
		recordTestDeletion.deleteMusic(1);
		Assert.assertTrue(true);
	}
	
	
	
	//This is a placeholder Test class
	
	
	//Write good tests! Most entry level dev positions will have you writing tests
	
}
