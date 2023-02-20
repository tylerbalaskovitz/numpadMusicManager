package com.revature.models;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.revature.DAO.LoginDAO;
import com.revature.DAO.UserLoginDAO;

public class LoginMenu {
	boolean LoginMenu;
	UserLoginDAO ulDAO = new UserLoginDAO();
	
	LoginDAO lDAO = new LoginDAO();
	
	//creating a method to control the login menu
	public void displayLoginMenu() {
	LoginMenu = true;
	Scanner scan = new Scanner(System.in);
	
	while (LoginMenu) {
		
		System.out.println("=======================================================");
		System.out.println("====Welcome to the NumPad Music Manager Log in Menu====");
		System.out.println("=======================================================");
		
		//all the user's options for the Login Menu
		System.out.println("1. Log in to the Program");
		System.out.println("2. Create a new account");
		System.out.println("3. Forgot your username/password?");
		
		try {int input = scan.nextInt(); //creating the option for people to navigate the login menu
		scan.nextLine(); 
		
		switch (input) {
		
		case 1: {
		//displaying the contents of the menu.
		System.out.println("Username:");
		String username = scan.nextLine();
		
		System.out.println("Password:");
		String password = scan.nextLine();
		
		
		//making a call to the database to get values to check against what the user
		//put into the scanner. Afterwards, values will be compared.
		
		boolean loginList = ulDAO.login(username, password);
		
		if (loginList == true) {
			LoginMenu = false;
		} else {
			continue;
		};
		
		
		
		
		
		
		
		
		
		
		break;
		
		
		}
		case 2: {
			
			//The second case is used for adding a new employee to the table
			
			System.out.println("Create a new Username");
			String newUsername = scan.nextLine();
			
			System.out.println("Create a new Password");
			String newPassword = scan.nextLine();
			
			
		
			
			Login log = new Login(newUsername, newPassword);
			
			lDAO.addUsername(log);
			
			
		break;	
		}
		case 3: {
			System.out.println("================================================================");
			System.out.println("Welcome to the NRS (Naive Recovery System) of the NumPad Music==");
			System.out.println("Manager. We are innovative in our security policies. ");
			System.out.println("=================================================================");
			System.out.println("Are you a good person?");
			System.out.println("1. Yes, of course :)");
			System.out.println("2. No, but I'm working on it :).");
				int trustCheck = scan.nextInt();
				scan.nextLine();
				switch(trustCheck) {
				case 1:{
					System.out.println("I like that positive attitude. I hope this helps you");
				
					ArrayList<Login> loginList = lDAO.displayUsername();
					
					//the lambda needs to just be a new variable for it to work.
					loginList.forEach(login -> {
						System.out.println("================================");
						System.out.println("Username: " + login.getUsername());
						System.out.println("Password: " + login.getPword());
						
						
					});
					
					break;
				}
				case 2:{
					System.out.println("I appreciate your honesty. That makes you a good person.");
					System.out.println("I hope this helps you out :)");
					
					ArrayList<Login> loginList = lDAO.displayUsername();
					
					loginList.forEach(login -> {
						System.out.println("================================");
						System.out.println("Username: " + login.getUsername());
						System.out.println("Password: " + login.getPword());
						
						
						
					});
					
					break;
				}
				default: {
					System.out.println("It's okay, take your time, friend.");
					break;
				}
				}
		
			break;
		}
		
		
		
		
		
		
		default: {
			//the default response if a user doesn't input an option
			System.out.println("Please type in a valid response");
			
		}
		
	}
		
		} catch (InputMismatchException e) {
		System.out.println("Please type in the proper value.");
			LoginMenu = false;
			displayLoginMenu();
			} finally {System.out.println("Thank you");}
		
	}
		
		
	}
	
}
