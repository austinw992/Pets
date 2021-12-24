/*
 * File: Panda.java
 * Author: Austin Wang
 * Date Created: 13 November 2020
 * Purpose: Create a unique Pet example
 *
 */

import java.util.*;
import java.util.Scanner;

public class Panda extends Pet implements Attributes {

	protected int eat = 50;
	protected int drink = 50;
	protected int happy = 70;
	protected int play = 50;
		
	public static void main(String[] args){
	
		Panda p = new Panda();
		
		interactiveMenu();
		

	}//end of main
	
	public Panda() {
		
		new Panda();
	
	}//end of constructor

	//menu that allows the user to interact with the pet Panda	
	public void interactiveMenu() {
		
		System.out.println("Actions allowed");
		System.out.println("1. feed");
		System.out.println("2. give water");
		System.out.println("3. play");
		System.out.println("4. happiness");
			
		//obtain the user choice
		Scanner actionOption = new Scanner(System.in);
		String chosenOption = actionOption.nextLine();
	
	} //end of menu for interaction

}//end of Panda Class
