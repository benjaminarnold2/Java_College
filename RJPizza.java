/*
John O Race - CS219DLBF2A2016 Programming Fundamentals
Pizza Constructor
Version 1.0
14 Nov 2016
*/

import java.util.*;

public class RJPizza extends RJUnit5Ch14{
	
	private String type;
	private String crust;
	private String ingredient;
	private double cost;
	
	public RJPizza(){ //default constructor sets default pizza info
		
		this.type = type;
		this.crust = crust;
		this.ingredient = ingredient;
		this.cost = cost;
		type = "Meat";
		cost = 5.00;
	}
	
	public void setType(String pizzaType){ //setter for Type (not really needed)
		
		type = pizzaType;		
		
	}
	
	public String getType(){ // getter for type
		
		return type;
	}
	
	public void setCrust(){  //setter for crust
		
		Scanner in = new Scanner(System.in);
		System.out.print("Thin or Thick Crust: ");		
		crust = in.nextLine();
		//System.out.println();
	}
	
	public String getCrust(){ //getter for crust
		
		return crust;
	} 
			
	public void setIngredient(){ // setter for ingredient
		
		Scanner in = new Scanner(System.in);
		System.out.print("What ingredient, sorry, only 1: ");		
		ingredient = in.nextLine();
		//System.out.println();
	}
	
	public String getIngredient(){  //getter for ingredient
		
		return ingredient;
	} 
	
	public void setCost(){  //cost plus 2 bucks for topping. I guess you always get a topping. Weird. 
		
		cost = cost + 2.00;
	}
	
	public double getCost(){ // getter for the cost
		
		return cost;
	} 
}