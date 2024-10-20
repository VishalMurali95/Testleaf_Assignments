package week1.day1;

import java.util.Scanner;

public class CheckNumberIsPositive {

	public static void main(String[] args) {
		
		// Getting the input from the user
		Scanner userinput = new Scanner(System.in);
		
		int value = userinput.nextInt(); //storing the value in the variable
		
		//using if statement to identify whether the give value is positive or negative
		if (value>0) { //if the value is greater than 0 - positive
			System.out.println(value+ " : It's a positive number");
			
		} else { // less than 0, it's negative
			System.out.println(value+ " : It's a negative number");


		}

	}

}
