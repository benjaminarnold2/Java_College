/*
John O Race - CS219DLBF2A2016 Programming Fundamentals
Array Sort and Search Program
Version 1.4
20 OCT 2016
*/
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class RJUnit1Ch9{
	
	public static void main (String[] args) {
		
		//Builds arrays 		
		int [] unsortedArray = new int[10];
		int [] sortedArray = new int[10];
		int [] [] tableArray = new int[10] [2];
		String [] [] nameArray = new String [1] [2];

		//Declare variables
		int count = 0; //general use count int
		int nonum = 0;  //used to see if the search number isn't found
		int size = 0; //will be used to find the size of the sorted array

		//for loop which fills the array with 10 random numbers
		
		for(int i= 0; i<10; i++){
			// calls the random number 
			int randomnumber = getRandom(0,20);
			unsortedArray[i] = randomnumber;
			
		}
		
		//Copy unsortedArray to sortedArray
		System.arraycopy( unsortedArray, 0, sortedArray, 0, unsortedArray.length);
		
		//Sort the sortedArray		
		Arrays.sort(sortedArray);
		
		//Fills the name array for the titles of the table
		
		nameArray [0] [0] = "Unsorted Array";
		nameArray [0] [1] = "Sorted Array";
		

		//Fills in tableArray with unsortedArray
		for (int i = 0; i<10; i++){

			
			tableArray [i] [0] = unsortedArray[i];			
			
			
		}
		
		//Fills in tableArray with sortedArray
		for (int i = 0; i<10; i++){

			
			tableArray [i] [1] = sortedArray[i];			
			
			
		}

		//Prints out the table (there should be a better way to do this)
		for(int i = 0; i<1; i++)
		{
			for(int j = 0; j<2; j++)
			{
				System.out.print(nameArray[i][j]);
				System.out.print("\t");
				System.out.print("\t");
			}	
			System.out.println();
				
		}
		
		for(int i = 0; i<10; i++)
		{
			for(int j = 0; j<2; j++)
			{
				System.out.print(tableArray[i][j]);	
				System.out.print("\t");
				System.out.print("\t");
				System.out.print("\t");
			}	
			System.out.println();
				
		}
		size = sortedArray.length;
		Scanner in = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Please enter a number to search for: ");
		int searchnum = in.nextInt();
		count = 0;
		for(int u : unsortedArray){
			if(u == searchnum){
				System.out.print("Search Value: ");
				System.out.print( searchnum );
				System.out.print(" found at location: " );
				System.out.print(count);
				System.out.print(" in the unsorted array");
				System.out.println();
				
			}
			count ++;
		}
		count = 0;
		for(int u : sortedArray){
			if(u == searchnum){
				System.out.print("Search Value: ");
				System.out.print( searchnum );
				System.out.print(" found at location: " );
				System.out.print(count);
				System.out.print(" in the sorted array");
				System.out.println();
				
			}
			else{
				nonum ++;
			}
			count ++;	
			
		}
		if(size == nonum){
			System.out.println();
			System.out.print("Search Value: ");
			System.out.print(searchnum);
			System.out.print(" was not found");
			System.out.println();
			
		}	
	}
	
	
	// Random number method for random numbers between min and max
		public static int getRandom(int min, int max){
	
			Random rand = new Random();
	
			return rand.nextInt((max - min) + 1) + min;
		}
		
}

	

