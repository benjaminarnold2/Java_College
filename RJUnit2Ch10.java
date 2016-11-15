/*
John O Race - CS219DLBF2A2016 Programming Fundamentals
Array Buildm Sort and Search Program
Version 1.0
27 OCT 2016
*/
import java.util.*;


public class RJUnit2Ch10{
	
	public static void main (String[] args) {
		
		// Declare variables
		ArrayList<Integer> unsortedArray = new ArrayList<>();		
		int [] numberArray;
		int total = 0; //total of sorted array
		
		//Builds an array with a size determined by the user
		Scanner in = new Scanner(System.in);
		System.out.print("How man random numbers between 1 and 100: ");
		int numAmount = in.nextInt();
		
		//for loop which fills the array with random numbers
		
		for (int u = 0; u<numAmount; u++){
			// calls the random number 
			int randomnumber = getRandom(0,100);
			unsortedArray.add(randomnumber);
				
		}
		
		//Sorting the ArrayList 
		ArrayList<Integer> sortedArray = new ArrayList<>(unsortedArray);	; //copy the arraylist
		Collections.sort(sortedArray);
		
		//Collect searh int from user
		System.out.print("Which random number are you searching for?: ");
		int searchnum = in.nextInt();
				
		//Unsorted ArrayList search
		//This code will only run the search if a match if found...
		
		for(int i=0; i < unsortedArray.size(); i++){
			int value = unsortedArray.get(i);
			if(value == searchnum){
				total++;
			}
			
		}
		if(total != 0){
						
			System.out.println(" ");
			System.out.println("Unsorted List");
			for(int i=0; i < unsortedArray.size(); i++){
				int value = unsortedArray.get(i);
				if(value == searchnum){
					System.out.print(searchnum);
					System.out.print(" found at location: ");
					System.out.println(i);
				}
			}
		
		
			System.out.println(" "); //Sorted ArrayList search
			System.out.println("Sorted List");
			for(int i=0; i < sortedArray.size(); i++){
				int value = sortedArray.get(i);
				if(value == searchnum){
					System.out.print(searchnum);
					System.out.print(" found at location: ");
					System.out.println(i);
				}
			}
		}		
				
			
		// Add the values in the Sorted ArrayList		
		System.out.println(" "); //Sorted ArrayList search
		total = 0; //zero out the value for total
		for(int i=0; i < sortedArray.size(); i++){
			int value = sortedArray.get(i);
			total = value + total;	
		}
		System.out.print("Total of all numbers: ");
		System.out.println(total);
	}
	
	// Random number method for random numbers between min and max
		public static int getRandom(int min, int max){
	
			Random rand = new Random();
	
			return rand.nextInt((max - min) + 1) + min;

		}

		
}

	

