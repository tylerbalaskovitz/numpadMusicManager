package com.revature.DAO;

import java.util.ArrayList;
import java.util.Scanner;

import com.revature.models.RecordNames;

public class RecordsDAO implements RecordsDAOInterface {

	ArrayList<RecordNames> recordsList =  new ArrayList<>();
	
	//Add a scanner to the inRecords method so when interacting with the menu
	//people can add records
	//Also, have a switch statement so people can choose to add a record or stop
	//Clear the console so things appear neat and orderly.
	public ArrayList<RecordNames> inputRecords(){
		//Clearing the console's code:
		System.out.print("\033[H\033[2J");
		System.out.flush();
		
		//initializing the Scanner scan object.
		Scanner scan = new Scanner(System.in);
		
		
		//Takes the user's input to be used in the switch for adding a record
		int input = scan.nextInt();
		scan.nextLine();
		//Helps the application move to the next line
		System.out.println("===============================");
		System.out.println("Would you like to add a record?");
		System.out.println("1. Yes, add a record.");
		System.out.println("2. No, back to the main menu");
		System.out.println("===============================");
		
		switch(input) {
		
		case 1: {
		
		
		recordsList.add(new RecordNames());
		break;
		}
		case 2: {
			
			
			
		}
		
		
		}
		return recordsList;
	}
	
}
