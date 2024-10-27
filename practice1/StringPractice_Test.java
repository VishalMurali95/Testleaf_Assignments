package practice1;

import java.util.Iterator;

public class StringPractice_Test {

	public static void main(String[] args) {

		String student_1 = "Vishal";
		String student_2 = "Vishal";
		String student_21 = "VishalM";
		String student_3 = "Pavani";
		String student_4 = "Murali";
		String student_5 = "Ruckmani";
		String student_6 = "Saishree";

		// count the no. of characters in the string
		int student1_length = student_1.length();
		System.out.println("Length of the string: " + student1_length);

		// Compare two strings
		// Method 1:

		boolean equals = student_1.equals(student_2);
		System.out.println("Equal result :" + equals);

		// Method 2
		if (student_1.equals(student_3)) {
			System.out.println("Values are same");

		} else {
			System.out.println("Values are not same");

			// to check the memory location
			if (student_1 == student_2) {
				System.out.println("Same memory allocation");

			} else {
				System.out.println("Different memory allocation");

			}
		}

		// ignore equal case
		boolean student_equalsIgnoreCase = student_1.equalsIgnoreCase(student_21);
		System.out.println(student_equalsIgnoreCase);

		// contains
		// boolean contains = student_1.contains(student_2);
		boolean contains = student_1.contains("Murali");
		System.out.println(contains);

		// convert string to array
		char[] studentArray = student_1.toCharArray();
		System.out.println(studentArray);
		System.out.println(studentArray.length);
		System.out.println(studentArray[0]);

		// finding the character in the string
		System.out.println(student_1.charAt(0));

		// for loop to print the characters in the array

		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(studentArray[i]);
		}

		// reverse
		for (int a = studentArray.length-1; a>=0; a--) {
			System.out.println(studentArray[a]);

		}
	}
}