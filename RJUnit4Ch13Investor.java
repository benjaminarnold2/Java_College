/*
John O Race - CS219DLBF2A2016 Programming Fundamentals
Multiple Classes
Version 1.1
07 Nov 2016
*/

import java.util.*;

public class RJUnit4Ch13Investor{
	
	private static double interestRate;
	private double balance;
	private int ACCOUNT_NUMBER;
	
	public static void main (String[] args){
			
	}
	
	public void setInterest(double rate){
		
		interestRate = rate;
		
	}
	
	public void acctInfo(int acct, double bal){
		
		balance = bal;
		ACCOUNT_NUMBER = acct;
		
	}
	
	public void addInterest(){
		
		balance = balance +(balance * interestRate / 12);
				
	}
	
	public double getBalance(){
	
		return balance;
		
	}
}