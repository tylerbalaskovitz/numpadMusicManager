package com.revature;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import java.util.InputMismatchException;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.revature.DAO.LoginDAO;
import com.revature.DAO.RecordsDAO;
import com.revature.DAO.SalesDAO;
import com.revature.DAO.UserLoginDAO;
import com.revature.models.LoginMenu;
import com.revature.models.Menu;


public class TestClass extends Throwable {
	
	Menu m = new Menu();
	RecordsDAO rd = new RecordsDAO();
	LoginDAO ld = new LoginDAO();
	SalesDAO sd = new SalesDAO();
	UserLoginDAO uld = new UserLoginDAO();
	LoginMenu lm = new LoginMenu();
	
	//the point of these tests is to just make sure that things are functioning on a fundamental level
	//such as the values aren't identical to each other proving that they are unique,
	//that all of the tables work in each of the DAO's and that the user is able to 
	//successfully log into the program.
	//the toString() is useful because it allows you to know that there are no duplicate objects
	//within your program.
	
	@Test
	public void testDataIsReturnedInRecordsDAO() {
		
		assertNotNull(rd.displayAllRecords());
		
	}
	
	
	@Test
	public void testDataIsReturnedInSalesDAO() {
		
		assertNotNull(sd.displayAllSales());
		
	}
	
	@Test
	public void testDataIsReturnedInLoginDAO() {
		
		assertNotNull(ld.displayUsername());
		
	}
	
	
	@Test
	public void SalesDAOUserLoginDAOStringComparison() {
		assertNotSame(sd.toString(),uld.toString());
		
	 }
	
	
	@Test
	public void SalesDAORecordDAOStringComparison() {
		assertNotSame(sd.toString(),rd.toString());
		
	 }
	
	
	@Test
	public void SalesDAOLoginDAOStringComparison() {
		assertNotSame(sd.toString(),ld.toString());
		
	 }
	
	@Test
	public void testPassingLogion() {
		UserLoginDAO openLoginMenu = new UserLoginDAO();
		
		//tests the login 
		Assert.assertTrue(openLoginMenu.login("tyler", "password"));
		
	}
	
	
	@Test
	public void testRecordUniqueness1() {
		//proves the two tables are not the same table.
		assertNotSame(rd.displayAllRecords(), sd.displayAllSales());
		
	}
	
	@Test
	public void testUserNameandRecordLists() {
		assertNotSame(ld.displayUsername(), rd.displayAllRecords());
	
	 }
	
	@Test
	public void testUserNameandSalesLists() {
		assertNotSame(ld.displayUsername(), sd.displayAllSales());
	
	 }
	
	
	
}
	
	//This is a placeholder Test class
	
	
	//Write good tests! Most entry level dev positions will have you writing tests
	

