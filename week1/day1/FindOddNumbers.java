package week1.day1;

import java.util.Scanner;

public class FindOddNumbers {

	public static void main(String[] args) {
		
		// getting the input from the user
		Scanner userinput = new Scanner(System.in);
		
		int value = userinput.nextInt(); //storing the userinput into the variable

		//using for loop, iterating each numbers checking whether it is odd number or not
		for (int i = 1; i<=value; i++) {
			if (i%2==1) { // checking whether reminder is 1
				System.out.println(i); //it'll print the odd numbers
				
			}
			
		}
	}

}
