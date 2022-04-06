package com.revature.models;

import java.util.Scanner;

public class Menu {

	
	public void displayMenu() {
		
		boolean displayMenu = true;
		Scanner scan = new Scanner(System.in);
		
		

		
		while (displayMenu) {
			System.out.println("==========================================================");
			System.out.println("===========Welcome the NumPad Music Manager===============");
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
			
			System.out.println("4: View Records by Alphabetized");
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
				//addRecord();
				inputRecords();
				
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
