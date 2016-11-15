/*
John O Race - CS219DLBF2A2016 Programming Fundamentals
Inheritance and Polymorphism
Version 1.0
14 Nov 2016
*/

import java.util.*;

public class RJUnit5Ch14{
	
	private static String pizzaType;
	
	public static void main(String[] args){
		
		//Object pizza;
		/* - I don't know how to make this work.
		When I use this I can't call pizza = new RJPizza(); like in the book.
		I'll keep working on it. */
		
		Scanner in = new Scanner(System.in);
		System.out.print("What type of pizza woudl you like (Cheese or Meat): ");
		pizzaType = in.nextLine(); // find out what type of pizza
		
		
		if(pizzaType.equals("Meat")){ // Meat pizza
			
			RJPizza pizza = new RJPizza();
			pizza.setType("Meat");
			pizza.setCrust();
			pizza.setIngredient();
			pizza.setCost();		
			
			/* If I could figure out how to call the object, I could call all of 
			these print statements outside of the if statement. Since the if 
			statement instantiates the RJPizza class... I have to do it in here */
			
			System.out.println();
			System.out.println("You ordered:");
			System.out.println(pizza.getType() + " pizza");
			System.out.println(pizza.getIngredient() + " (+$2.00)");
			System.out.println(pizza.getCrust() + " crust");
			System.out.println("Total cost of $" + (String.format( "%.2f",pizza.getCost())));
			
		}
		
		if(pizzaType.equals("Cheese")){
			
			RJCheese pizza = new RJCheese();
			pizza.setType("Cheese");
			pizza.setCrust();
			
			/* Same as above. This works and kind of hits all the requests for the 
			homework, except I don't make a single pizza to be used for the program. 
			Still needs work*/
			
			System.out.println();
			System.out.println("You ordered:");
			System.out.println(pizza.getType() + " pizza");
			System.out.println(pizza.getCrust() + " crust");
			System.out.println("Total cost of $" + (String.format( "%.2f",pizza.getCost())));
			
		}
		
		
	}
}