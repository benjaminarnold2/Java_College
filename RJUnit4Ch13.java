/*
John O Race - CS219DLBF2A2016 Programming Fundamentals
Multiple Classes
Version 1.0
07 Nov 2016
*/

import java.util.*;

public class RJUnit4Ch13{
	
	public static void main(String[] arg){
		
		Scanner in = new Scanner(System.in); //Initate Scanner
		double rate = 0.0;//initial interest rate
		double endbal = 0.00; //end balance
		String [] [] nameArray = new String [1][5]; //array for table names
		String [] [] dashArray = new String [1][5]; //array for table names
		
		int invest1acct = 1001; //account for investor1
		int invest2acct = 2001; //account for investor2
		double invest1bal = 2000.00; //inital balance for investor1
		double invest2bal = 4000.00; //inital balance for investor2
		
		/* This may be a cheap way to do this, but by setting these, I can easily call
		them to print out. Also, if I want to change them I can do it right here, and not 
		later in the code... and I don't have to write a method that returns them from my 
		other class. So this is the best kind of lazy, justifiable lazy!*/
		
		
		//Fill the table names array
		nameArray[0][0] = "Month";
		nameArray[0][1] = "Account #";
		nameArray[0][2] = "Balance";
		nameArray[0][3] = "Account #";
		nameArray[0][4] = "Balance";
		
		dashArray[0][0] = "-----";
		dashArray[0][1] = "---------";
		dashArray[0][2] = "-------";
		dashArray[0][3] = "---------";
		dashArray[0][4] = "-------";
		
		RJUnit4Ch13Investor investor1 = new RJUnit4Ch13Investor();
		RJUnit4Ch13Investor investor2 = new RJUnit4Ch13Investor();
		
		System.out.print("Please enter the APR in the form of .05 for 5%: ");
		rate = in.nextDouble();
		System.out.print("Monthly balances for one year with ");
		System.out.print(rate);
		System.out.print(" annual interest:");
		System.out.println();
		System.out.println();
		
				
		for(int i=0;i<nameArray[0].length;i++){ //Print out the table names
			
			System.out.print(nameArray[0][i]);
			System.out.print("\t");

		}
		
		System.out.println();
			
		for(int i=0;i<nameArray[0].length;i++){ //Print out the table dashes
			
			System.out.print(dashArray[0][i]);
			System.out.print("\t");

		}
		
		System.out.println();
		
		investor1.setInterest(rate);
		//investor2.setInterest(.08);
		
		/* This I don't understand. I know I can set this as a static... and I do
		by first creating the investor1 instance. I don't know how to do this without
		first creating investor1. I'm going to keep working on this. */
		
		investor1.acctInfo(invest1acct,invest1bal);
		investor2.acctInfo(invest2acct,invest2bal);
		
		for(int i = 0; i < 15; i++){
		
			System.out.print(i + 1);
			System.out.print("\t");
			System.out.print(invest1acct);
			System.out.print("\t");
			System.out.print("\t");
			investor1.addInterest();
			endbal = investor1.getBalance();
			System.out.print(String.format( "%.2f",endbal));
			System.out.print("\t");
			System.out.print(invest2acct);
			System.out.print("\t");
			System.out.print("\t");
			investor2.addInterest();
			endbal = investor2.getBalance();
			System.out.println(String.format( "%.2f",endbal));
			
		}
		
		System.out.println();
		System.out.print("Investor 1 earned : ");
		endbal = investor1.getBalance();
		System.out.print(String.format("%.2f",(endbal - invest1bal)));
		System.out.print(" interest in 15 months at ");
		System.out.println((rate*100) + "%");
		
		System.out.print("Investor 2 earned : ");
		endbal = investor2.getBalance();
		System.out.print(String.format("%.2f",(endbal - invest2bal)));
		System.out.print(" interest in 15 months at ");
		System.out.println((rate*100) + "%");
	}
}