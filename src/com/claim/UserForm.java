package com.claim;

import java.util.ArrayList;
import java.util.Scanner;

public class UserForm {
	private int selection = 0;
	private String menuLang = "Please select from the following:";
	private String record = "1 - Add New Record";
	private String delete = "2 - Delete a Record";
	private String searchTele = "3 - Locate Record by Telephone Number";
	private String searchFirstName = "4 - Locate Record by First Name";
	private String searchLastName = "5 - Locate Record by Last Name";
	private String update = "6 - Update a Record";
	private String exit = "7 - Exit Phonebook Application";
	private String menu = menuLang + record + delete + searchTele + searchFirstName + searchLastName + update + exit;
	ArrayList<String> newRecord = new ArrayList<String>();

	public UserForm(){
	}
	

	//prompt user for entry: 
	public void userForm(){
		System.out.print(menu);
		Scanner input = new Scanner(System.in);
		selection = input.nextInt();
		menuActions(selection);
		}
	
	//use this switch case to handle the user input, call a method
	public static void menuActions(int selection){
		selection = 1;
		switch (selection){
			case 1:  //prompt user to input a new record, save response.
				//call method addNew here
			break; 
			case 2:   //prompt user to search using first, last, or telephone
			//call method to search
			//display results
			//if multiple, select which to delete
			//call method for arraylist to delete 
			break;
			case 3:  //prompt user to search by telephone
			//call method to search by #
			//display results
			break;
			case 4:   //prompt user to search by first name
			//call method to search by firstName
			//display results
			break;
			case 5:   //prompt user to search by last name
			//call method to search by LastName
			//display results
			break;
			case 6:   //prompt user to search by methods 1,2, or 3
			//call method to search
			//display results
			//verify selection with user
			//prompt user to replace input
			break;
			case 7:   //terminate program;
			System.exit(0);
			break;
			default:  
			System.out.print("Please enter a valid selection (1-7)");
			//call userForm to prompt a new menu box;
			break;
		}
		
	}
	public void addNew(){
		System.out.println("Enter new record: firstName lastName telephone streetAddr city state zip");
		Scanner input = new Scanner(System.in);
		newRecord.add(input.next());
		//create a new person object 
		//divide string to substrings
		//write it into file (used as a database)
		//display message to user new record added (or error message)
	}
	
	public static void deleteRecord(String[] test){
	}
	

}	
