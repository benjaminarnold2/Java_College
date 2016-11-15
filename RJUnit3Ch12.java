/*
John O Race - CS219DLBF2A2016 Programming Fundamentals
Input type conversion
Version 1.1
31 OCT 2016
*/

import java.util.*;

public class RJUnit3Ch12{

	public static void main (String[] args){

		Scanner in = new Scanner(System.in); //Initate Scanner

		System.out.print("Please enter a string of any length: ");
		String input = in.nextLine();
		int inputLength = input.length();
		int switchInt = 0;
		int j = 1; //int used to check and print substring 
		String [] inputArray = new String [inputLength]; //array for input string
		String [] [] nameArray = new String [1][4]; //array for table names
		
		//Fill the table names array
		nameArray[0][0] = "Initial";
		nameArray[0][1] = "ASCII(char)";
		nameArray[0][2] = "ASCII(int)";
		nameArray[0][3] = "Hex";

		//Print out the table names
		for(int i=0;i<nameArray[0].length;i++){
			
			System.out.print(nameArray[0][i]);
			System.out.print("\t");

		}

		System.out.println();

		//For loop to itterate down the inputArray
		for(int i=0;i<inputLength;i++){

			
				
			j = (j<inputLength) ? j:inputLength; //ternary operator

			String inputDigit = input.substring(i,j);
			char inputChar = inputDigit.charAt(0);
			System.out.print(inputChar);

			//Print out Ascii if string
			if(Character.isDigit(inputChar) == false){
				
				switchInt = 0;
			
			}
			
			if(Character.isDigit(inputChar) == false){
				
				switchInt = 1;
				
			}
			
			switch(switchInt){
				
				case 0:
				
					System.out.print("\t");
					int inputAscii = (int) inputChar;
					System.out.print(inputAscii);
					System.out.print("\t");
					System.out.print("\t");
					System.out.print("\t");
					
				case 1:
				
					System.out.print("\t");
					System.out.print("\t");
					System.out.print("\t");
					int inputInt = (int) inputChar;
					System.out.print(inputInt);
					System.out.print("\t");
					
			}
			/*
			if(Character.isDigit(inputChar) == false){
				
				System.out.print("\t");
				int inputAscii = (int) inputChar;
				System.out.print(inputAscii);
				System.out.print("\t");
				System.out.print("\t");
				System.out.print("\t");
			
			}
			
			//Print out Ascii if int
			if(Character.isDigit(inputChar) == true){

				System.out.print("\t");
				System.out.print("\t");
				System.out.print("\t");
				int inputInt = (int) inputChar;
				System.out.print(inputInt);
				System.out.print("\t");
									
			}*/
				
			//Print out Hex in caps
			System.out.print("\t");
			String inputHex = Integer.toHexString(inputChar).toUpperCase();
			System.out.println(inputHex);

			j++;

		}
		
		System.out.println();
		System.out.println("Thank you for playing!");

	}

}





