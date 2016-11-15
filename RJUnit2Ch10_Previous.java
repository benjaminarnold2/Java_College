/*
John O Race - CS219DLBF2A2016 Programming Fundamentals
Array Buildm Sort and Search Program
Version 1.0
27 OCT 2016
*/
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class RJUnit2Ch10{
	
	public static void main (String[] args) {
		
		// Declare variables	
		ArrayList<Integer> unsortedArray = new ArrayList<Integer>();
		ArrayList<Integer> sortedArray = new ArrayList<Integer>();
		int count = 0; //general count int
		int size = 0; //will be used to find the size of the sorted array
		int total = 0; //total of sorted array
		
		//Builds an array with a size determined by the user
		Scanner in = new Scanner(System.in);
		System.out.print("How man random numbers between 1 and 100: ");
		int numAmount = in.nextInt();
		
		
		//while loop which fills the ArrayList with random numbers
		
		for(count < numAmount){
			// calls the random number 
			int randomnumber = getRandom(0,100);
			unsortedArray.add(randomnumber);
			count++;
			
		}
		
		//Sorting the ArrayList 
		ArrayList<Integer> sortedArray = (ArrayList<Integer>) unsortedArray.clone(); //copy the arraylist
		Collections.sort(sortedArray);
		
		/*Arrays.sort(sortedArray);
		String [] [] nameArray = new String [1] [2];
		nameArray [0] [0] = "Unsorted Array";
		nameArray [0] [1] = "Sorted Array";
		int [] [] tableArray = new int[numAmount] [2];
		count = 0;
		while (count < numAmount){
			//Fills in tableArray with numberArray
			tableArray [count] [0] = numberArray [count];			
			count++;
			
		}
		count = 0;
		while (count < numAmount){
			//Fills in tableArray with sortedArray
			tableArray [count] [1] = sortedArray [count];			
			count++;
		}
			
		size = sortedArray.length;
		
		System.out.print("Which random number are you searching for?: ");
		int searchnum = in.nextInt();
		count = 0;
		System.out.println(" ");
		System.out.println("Unsorted List");
		for(int u : numberArray){
			if(u == searchnum){
				System.out.print( searchnum );
				System.out.print(" found at location: " );
				System.out.print(count);
				System.out.println(" ");
				
			}
			count ++;
		}
		count = 0;
		System.out.println(" ");
		System.out.println("Sorted List");
		for(int u : sortedArray){
			if(u == searchnum){
				System.out.print( searchnum );
				System.out.print(" found at location: " );
				System.out.print(count);
				System.out.println(" ");
				
			}
			count ++;	
			
		}
		count = 0; //Reset count and add up the sorted array
		for(int u : sortedArray){
			total = sortedArray[count] + total;	
			count ++;
			}
		System.out.println(" ");
		System.out.print("Total of all numbers: ");
		System.out.print(total);*/
	}
	
	
	// Random number method for random numbers between min and max
		public static int getRandom(int min, int max){
	
			Random rand = new Random();
	
			return rand.nextInt((max - min) + 1) + min;
		}
		
}

	

