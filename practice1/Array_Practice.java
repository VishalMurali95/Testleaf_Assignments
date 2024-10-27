package practice1;

import java.util.Arrays;

public class Array_Practice {

	public static void main(String[] args) {

		// Array's
		int[] age = {55, 1, 150, 320, 25, 30, 315, 4, 245, 5};
		// '' - for character, "" - for string
		char[] startingLetters = {'V', 'M', 'R', 'P', 'S'};
		
		
		//length of the array
		int age_length = age.length;
		System.out.println(age_length);
		
		int sl_length = startingLetters.length;
		System.out.println(sl_length);
		
		//retrives single element in the array
		System.out.println("5th element in the age: "+age[4]);
		System.out.println("3rd element in the Startingletters: "+startingLetters[2]);
		
		
		//sort the array
		Arrays.sort(age);
		Arrays.sort(startingLetters);
		
		System.out.println(age[age.length-1]);
		System.out.println(startingLetters);
		
		//print all the values in the array
		for(int i=0; i<=age.length-1; i++) {
			System.out.println(age[i]);
		}
		
		for(int i=0; i<=startingLetters.length-1; i++) {
			System.out.println(startingLetters[i]);
		}
	
		
		char[] duplicates = {'V', 'M', 'R', 'P', 'S', 'V', 'M', 'S'};
		
		for (int i=0; i<=duplicates.length-1; i++) {
			if (duplicates[i]==duplicates[i+1]) {
				System.out.println("Please find the duplicate values: "+ duplicates[i]);	
			}
				
			}
		

	}
	

}
