package com.revature.models;

import java.util.Scanner;

public class Menu {

	
	public void displayMenu() {
		
		boolean displayMenu = true;
		Scanner scan = new Scanner(System.in);
		
		

		
		while (displayMenu) {
			System.out.print("\033[H\033[2J");
			System.out.flush();
			
			System.out.println("==========================================================");
			System.out.println("===========Welcome to the NumPad Music Manager============");
			System.out.println("==========================================================");
			
			
			
			System.out.println("-------------------------");
			System.out.println("------Add New Music------");
			System.out.println("-------------------------");
			
			System.out.println("1: Add a Record");
			System.out.println("2: Add a Genre ");
			System.out.println("3: Update an Entry");

			
			System.out.println("-------------------------");
			System.out.println("----View Your Music------");
			System.out.println("-------------------------");
			
			System.out.println("4: View Records by Name");
			System.out.println("5: View Records by Genre");
			System.out.println("6: View Records by Type");
			
			System.out.println("-------------------------");
			System.out.println("----Sell Your Music------");
			System.out.println("-------------------------");
			
			System.out.println("7: Sell Records by Name");
			System.out.println("8: Sell Records by Genre");
			System.out.println("9: Sell Records by Type");
			
			int input = scan.nextInt();
			scan.nextLine();
			
			switch(input) {
			case 1: {

				
				//initializing the Scanner scan object.
				Scanner scan = new Scanner(System.in);
				
				
				//Takes the user's input to be used in the switch for adding a record
				int input1 = scan.nextInt();
				scan.nextLine();
				//Helps the application move to the next line
				System.out.println("===============================");
				System.out.println("Would you like to add a record?");
				System.out.println("1. Yes, add a record.");
				System.out.println("2. No, back to the main menu");
				System.out.println("===============================");
				
				switch(input1) {
				
				case 1: {
				
				
				
				break;
				}
				case 2: {
					
					
				break;
				}
				default: {
					
					
				}
				
				
				
			}
				
				break;
			}
			
			case 2: {
				
				
				break;
			}
			case 3: {
				
				
				break;
			}
			
			case 4: {
				
				
				break;
			}
			case 5: {
				
				
				break;
			}
			
			case 6: {
				
				
				break;
			}
			case 7: {
				
				
				break;
			}
			
			case 8: {
				
				
				break;
			}
			case 9: {
				
				
				break;
			}
			default: {
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");			
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				System.out.println("Sorry, you'll have to type in a valid response");
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
				System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
			}
			
			
			
			}
			
		}
		
	}
	
	
	
	
}
