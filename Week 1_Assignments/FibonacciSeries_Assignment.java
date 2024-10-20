package week1.day1;

import java.util.Scanner;

public class FibonacciSeries_Assignment {

	public static void main(String[] args) {
		
		// Getting the input from the user
		Scanner userinput = new Scanner(System.in);
		
		int value = userinput.nextInt(); //storing the value in the variable
		
		// declaring the value as 0 for 1 variable
		int a = 0;
	
		// declaring the value as 0 for 2 variable
		int b =1;
		
		//printing the stored values - as fibonacci series starts from 0,1
		System.out.println(a);
		System.out.println(b);
		
		// using for loop, till the user value, trying to generate the fibonacci series
		for (int i=2; i<=value; i++) {
			int c = a+b; // every iteration it'll add the numbers
			System.out.println(c); // print the sum value here
			a = b; // reassigning the b value to a
			b = c; // reassigning the b value to c
			// again it'll proceed the iteration till the condition satisfies and breaks
		}

	}

}
