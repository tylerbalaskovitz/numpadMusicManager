package com.revature.models;

import java.util.Scanner;

public class LoginMenu {

	
	//creating a method to control the login menu
	public void loginMenu() {
	boolean loginMenu = true;
	Scanner scan = new Scanner(System.in);
	
	while (loginMenu) {
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
			System.out.println("Create a new Username");
			String newUsername = scan.nextLine();
			
			System.out.println("Create a new Password");
			String newPassword = scan.nextLine();
			
			
		break;	
		}
		case 3: {
			System.out.println("Are you a good person?");
			System.out.println("1. Yes, of course :)");
			System.err.println("2. No, but I'm working on it.");
			
		
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
