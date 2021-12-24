/*
 * File: Pet.java
 * Author: Austin Wang
 * Date Created: 13 November 2020
 * Purpose: Pet class to create a pet
 */

import java.util.*;
import java.util.Scanner;
import java.io.*;


public class Pet {

	public static void main(String[] args){
		
		//Pet z = new Pet();
		
		action_menu();
		String action_chosen = action_menu();
	
		//save the pet
		if (action_chosen.equals("1")) {
		
			//action_save();
		}

		//load a pet
		else if (action_chosen.equals("2")) {
		
			//action_load();
		}

		//check the happiness of a pet
		else if (action_chosen.equals("3")) {
			
			Pet z = new Pet();	
			Happy.Increase_Value_Attributes(int Happiness);
			Happy.Decrease_Value_Attributes(int Sadness);	
		
		}

		//feed a pet
		else if (action_chosen.equals("4")) {
			
			Pet z = new Pet();
			Hungry.Increase_Value_Attributes(int Starved);
			Hungry.Decrease_Value_Attributes(int Full);
		
		}

		//give water to a pet
		else if (action_chosen.equals("5")) {
			
			Pet z = new Pet();
			Thirsty.Increase_Value_Attributes(int Dehydrated);
			Thirsty.Decrease_Value_Attributes(int Satisfied);
		
		}

		//play with your pet
		else if (action_chosen.equals("6")) {
			
			Pet z = new Pet();
			Play.Increase_Value_Attributes(int Fun);
			Play.Decrease_Value_Attributes(int Boring);
		
		}

		//if user types something else
		else {
			System.out.println("Please choose an option provided");
		}//end of if statements

	} // end of main function

	public void Pet() {

		String[] Attributes_Array;

		String Attributes_Array = new String[""];
	
	}// end of pet array

	public void action_menu() {
		
		Scanner action = new Scanner(System.in);
		
		System.out.println("These are the options you're allowed to perform:");
		System.out.println("1. Save a Pet");
		System.out.println("2. Load a Pet");
		System.out.println("3. Check the Happiness of your pet");
		System.out.println("4. Feed a pet");
		System.out.println("5. Give water to a pet");
		System.out.println("6. Play with a pet");
		System.out.println("What would you like to perform today?");
		
		String action_chosen = action.nextLine();
		
	} //end of action menu
	
	//data serialization to save object into a byte
	public void action_save() {
		
		Pet object = new Pet();

		String Petsfile = "pets.txt";
		
		try {
			
			FileOutputStream PetsFiles = new FileOutputStream(Petsfile);
			ObjectOutputStream PetFiles = new ObjectOutputStream(PetsFiles);
			out.writeObject(object);
			
			PetFiles.close();
			PetsFiles.close();
	
		} //end of try

		catch (Exception e) {
	
			System.out.println("errors were found");

		}//end of catch		
					
	}//end of saving an object
	
	//data deserialization to load object from a byte
	public void action_load() {
	
		Pet object = new Pet();

		String Petsfile = "pets.txt";
	
		try {

			FileInputStream PetsFiles = new FileInputStream(Petsfile);
			ObjectInputStream PetFiles = new ObjectOutputStream(PetsFiles);
			object = (Pet)in.readObject();
		
			PetFiles.close();
			PetsFiles.close();

		}//end of try

		catch (Exception e) {

			System.out.println("errors were found");

		}//end of catch

	}//end of loading object

}//end of pet class

