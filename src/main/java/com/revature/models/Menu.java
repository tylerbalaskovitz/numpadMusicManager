package com.revature.models;

import java.util.ArrayList;
import java.util.Scanner;

import com.revature.DAO.RecordsDAO;

public class Menu {

		//Instantiating the RecordsDAO with the recDAO object so we can add records.
		RecordsDAO recDAO = new RecordsDAO();
	
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
			System.out.println(" ");

			
			System.out.println("-------------------------");
			System.out.println("----Manage Your Music----");
			System.out.println("-------------------------");
			
			System.out.println("3: View All Your Records");
			System.out.println(" ");
			
			System.out.println("-------------------------");
			System.out.println("----Sell Your Music------");
			System.out.println("-------------------------");
			
			System.out.println("4: Sell Your Records");
			System.out.println(" ");
			
			//if there is time do number 5
			
			System.out.println("-------------------------");
			System.out.println("-------Manage Money------");
			System.out.println("-------------------------");
			System.out.println("5: Balance Sheet");
			System.out.println(" ");
			
			System.out.println("-------------------------");
			System.out.println("-------Exit Program------");
			System.out.println("-------------------------");
			System.out.println("9: Log Off");

			
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
					
					
					RecordNames recName = new RecordNames(ArtName, AlbName, Gen1Name, Gen2Name, Gen3Name, SpeedName);
					
					recDAO.addMusic(recName);
				
			}
			
			case 2: {
				//an array to show all the records that exist within a database
				ArrayList<RecordNames> recordNamesDisplay = recDAO.displayAllRecords();
				
				//the naming for the lambda is arbitrary but it still needs to be unique 
				recordNamesDisplay.forEach(recordNames -> {
					System.out.println("====================================");
					System.out.println("ID Number: " + recordNames.getRecord_id());
					System.out.println("Artist: " + recordNames.getArtist_name());
					System.out.println("Album: " + recordNames.getAlbum_name());
					System.out.println("Genres: " + recordNames.getGenre_type1() + ", " + recordNames.getGenre_type2() + ", and " + recordNames.getGenre_type3());
					System.out.println("Record Speed: " + recordNames.getRecord_speed());
					
				});
				//Aftewards is the method that allows you to update the entry based upon
				//the record ID
				System.out.println("Which entry would you like to update?");
				int recordID = scan.nextInt();
				scan.nextLine();//this moves to the next line otherwise if this isn't done
				//the next scan.nextLine() is used meaning that ArtName will just be a String
				//that moves things to the next line.
				
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
				
				
				recDAO.updateMusic(recordID, ArtName, AlbName, Gen1Name, Gen2Name, Gen3Name, SpeedName);
				
				
				
				break;
			}
			case 3: {
				ArrayList<RecordNames> recordNamesDisplay = recDAO.displayAllRecords();
				
				//the naming for the lambda is arbitrary but it still needs to be unique 
				recordNamesDisplay.forEach(recordNames -> {
					System.out.println("====================================");
					System.out.println("ID Number: " + recordNames.getRecord_id());
					System.out.println("Artist: " + recordNames.getArtist_name());
					System.out.println("Album: " + recordNames.getAlbum_name());
					System.out.println("Genres: " + recordNames.getGenre_type1() + ", " + recordNames.getGenre_type2() + ", and " + recordNames.getGenre_type3());
					System.out.println("Record Speed: " + recordNames.getRecord_speed());
					
				});
				
				
				
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
