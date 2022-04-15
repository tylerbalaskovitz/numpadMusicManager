package com.revature.models;

import java.util.ArrayList;
import java.util.Scanner;

import com.revature.DAO.LoginDAO;

public class LoginMenu {

	LoginDAO lDAO = new LoginDAO();
	
	//creating a method to control the login menu
	public void displayLoginMenu() {
	boolean LoginMenu = true;
	Scanner scan = new Scanner(System.in);
	
	while (LoginMenu) {
		System.out.println("=======================================================");
		System.out.println("====Welcome to the NumPad Music Manager Log in Menu====");
		System.out.println("=======================================================");
		
		//all the user's options for the Login Menu
		System.out.println("1. Log in to the Program");
		System.out.println("2. Create a new account");
		System.out.println("3. Forgot your username/password?");
		int input = scan.nextInt(); //creating the option for people to navigate the login menu
		scan.nextLine();
		
		switch (input) {
		case 1: {
		//displaying the contents of the menu.
		System.out.println("Username:");
		String username = scan.nextLine();
		
		System.out.println("Password:");
		String password = scan.nextLine();
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
					
					System.out.println(loginList);
					
					break;
				}
				case 2:{
					System.out.println("I appreciate your honesty. That makes you a good person.");
					
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
	}
	}
	
}
