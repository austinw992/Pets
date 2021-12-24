/*
 * File: Happy.java
 * Author: Austin Wang
 * Date Created 13 November 2020
 * Purpose: Create another attribute for the superclass attributes
 */

import java.util.*;
import java.util.Scanner;

public class Happy implements Attributes {
	
	protected int Happiness = 0;
	protected int Sadness = 100;
	
	//increase the value for happy
	public void Increase_Value_Attributes (int Happiness) {
		
		this.Happiness += Happiness;
	
	}//end of increasing happiness
	
	//decreaseing the value for happy
	public void Decrease_Value_Attributes (int Sadness) {
		
		this.Sadness -= Sadness;
		
	}//end of decreasing happiness

	//return the value of happiness to determine whether to increment or decrement	
	public void get_Values(int Sadness) {
	
		this.Sadness = Sadness;
	
	}//end of get happy

}//end of happy class
