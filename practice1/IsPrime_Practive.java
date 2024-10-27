package practice1;

import java.util.Scanner;

public class IsPrime_Practive {

	public static void main(String[] args) {

		// getting the input from the user - in the constructor (System.in);
		Scanner input = new Scanner(System.in);
		
		// for int - nextint, string - nextstring
		int value = input.nextInt();


		boolean isPrime = true; // initalizing the boolean statement as true

		for (int i = 2; i < value; i++) { //keeping i=2, because if keep 1, all numbers are divisble by 1. it'll declare all nos as prime
			if (value % i == 0) { // value should not be divisible by anyother values
				isPrime = false; // if it's divisible, then set false
				break; //once find the value, we break the loop
			}
		}

		//using if condition checking, whether isprime is false
		if (isPrime) { // as previously set, if it is true will execute the condition otherwise
			System.out.println(value + ": It's a prime number");

		} else {
			System.out.println(value + ": It's not a prime number");

		}

	}

}
