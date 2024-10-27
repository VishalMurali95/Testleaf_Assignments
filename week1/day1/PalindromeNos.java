package week1.day1;

import java.util.Scanner;

public class PalindromeNos {

	public static void main(String[] args) {

		//getting the input from the user
		Scanner userinput = new Scanner(System.in);
		
		int input = userinput.nextInt();
		
		// creating a new variable and assigning it to 0
		int output = 0;
			
		// using for loop, iterating each value
		for (int i=input; i>0; i=i/10) { // dividing by 10 getting each last digit
			int rem = (i%10); // diving by 10, getting the reminder value
			output = ((output*10)+rem); // adding 10 + reminder to get the value
		}
		
		// using if condition, checking whether both i/p & o/p are same
		if (input==output) {
			System.out.println(input+ ": It's a Palindrome number");
			
		} else {
			System.out.println(input+ ": It's not a Palindrome number");


		}
		
	}

}
