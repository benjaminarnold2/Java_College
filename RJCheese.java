/*
John O Race - CS219DLBF2A2016 Programming Fundamentals
Cheese Pizza Constructor
Version 1.0
14 Nov 2016
*/

import java.util.*;

public class RJCheese extends RJUnit5Ch14{
	
	private String type;
	private String crust;
	private double cost;
	
	public RJCheese(){ // default constructor to make a cheese pizza
		
		this.type = type;
		this.crust = crust;
		this.cost = cost;
		cost = 5.00;
	}
	
	public void setType(String pizzaType){ //setter for Type (not really needed)
		
		type = pizzaType;		
		
	}
	
	public String getType(){ //getter for type
		
		return type;
	} 
	
	public void setCrust(){ //setter for crust (could have just done this in the default constructor)
		
		crust = "Thin";		
		
	}
	
	public String getCrust(){  //getter for crust
		
		return crust;
	} 
	
	public double getCost(){ //Don't need to set cost, since it doesn't change
		
		return cost;
	}
}