package week1.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagram_Assignment {

	public static void main(String[] args) {

		// declaring and storing the values in the variable
		String text_1 = "stops";
		String text_2 = "potss";

		// converting array to character
		char[] Array_1 = text_1.toCharArray();		
		char[] Array_2 = text_2.toCharArray();
		
		// sorting the values in the array
		Arrays.sort(Array_1);
		Arrays.sort(Array_2);

		// checking, if the length mismatch ignoring first itself
		if (text_1.length() == text_2.length()) { 
			if (Arrays.equals(Array_1, Array_2)) { // using array.equals condition, we can easily check whether its anagram or not
				System.out.println("It's an anagram");

			} else {
				System.out.println("It's not an anagram");

			}
		} else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram exit");

		}

	}

}
