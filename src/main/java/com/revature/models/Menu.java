package com.revature.models;

import java.util.Scanner;

import com.revature.DAO.RecordsDAO;

public class Menu {

	
	public void displayMenu() {
		
		boolean displayMenu = true;
		Scanner scan = new Scanner(System.in);
		
		

		
		while (displayMenu) {
			
			
			System.out.println("==========================================================");
			System.out.println("===========Welcome to the NumPad Music Manager============");
			System.out.println("==========================================================");
			
			
			
			System.out.println("-------------------------");
			System.out.println("------Add New Music------");
			System.out.println("-------------------------");
			
			System.out.println("1: Add a Record");
			System.out.println("2: Update an Entry");

			
			System.out.println("-------------------------");
			System.out.println("----View Your Music------");
			System.out.println("-------------------------");
			
			System.out.println("3: View All Your Records");
			
			
			System.out.println("-------------------------");
			System.out.println("----Sell Your Music------");
			System.out.println("-------------------------");
			
			System.out.println("4: Sell Your Records");
			
			
			//if there is time do number 5
			
			System.out.println("-------------------------");
			System.out.println("-------Manage Money------");
			System.out.println("-------------------------");
			System.out.println("5: Balance Sheet");
			
			System.out.println("-------------------------");
			System.out.println("-------Exit Program------");
			System.out.println("-------------------------");
			System.out.println("9: Log Off");
;
			
			int input = scan.nextInt();
			scan.nextLine();
			
			switch(input) {
			case 1: {

				
				//initializing the Scanner scan object.
					System.out.println("Enter the Artist name");
					String ArtName = scan.nextLine();
					
					
					System.out.println("Enter the Album name");
					String AlbName = scan.nextLine();
					
					System.out.println("Enter the first genre");
					String Gen1Name = scan.nextLine();
					
					System.out.println("Enter the second genre");
					String Gen2Name = scan.nextLine();
					
					System.out.println("Enter the third genre");
					String Gen3Name = scan.nextLine();
					
					System.out.println("Enter the speed of the record");
					String SpeedName = scan.nextLine();
					
					
					
				
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
			case 9: {
				displayMenu = false;
				
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
