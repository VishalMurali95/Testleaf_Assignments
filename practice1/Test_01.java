package practice1;

import java.util.Scanner;

public class Test_01 {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);

		/*
		 * int marks = userInput.nextInt();
		 * 
		 * if (marks>=90) { System.out.println("Very Good, Grade A");
		 * 
		 * } else if (marks>=75) { System.out.println("Good marks, Grade B"); }
		 * 
		 * else if (marks>=50) {
		 * System.out.println("Spend time on your studies, Grade C");
		 * 
		 * }
		 * 
		 * else { System.out.println("Meet me in the staffroom");
		 * 
		 * }
		 */

		int value = userInput.nextInt();

		for (int i = 1; i <= value; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " : Odd number");
			}
		}
	}

}
