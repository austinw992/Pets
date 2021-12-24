/*
 * File: Hungry.java
 * Author: Austin Wang
 * Date Created: 13 November 2020
 * Purpose: Subclass Attribute to connecto th the parent class
 */

import java.util.*;
import java.util.Scanner;

public class Hungry implements Attributes {
	
	protected int Starved = 0;
	protected int Full = 100;
	
	//increase the value when hungry
	public void Increase_Value_Attributes (int Starved) {
		
		this.Starved += Starved;
	
	}//end of hungry method
	
	//decrease the value when full
	public void Decrease_Value_Attributes (int Full){
	
		this.Full -= Full;
	
	}//end of full method


	//obtain the hunger level of the attribute and return for decision	
	public void get_Values(int Full) {
	
		this.Starved = Starved;
	
	} //end of getting hungry

}//end of Hungry Class
