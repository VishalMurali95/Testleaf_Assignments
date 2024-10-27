package week1.day1;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {

		// assigning the values to the variable
		int[] value_1 = { 3, 2, 11, 4, 6, 7 };
		int[] value_2 = { 1, 2, 8, 4, 9, 7 };

		// sorting the arrays
		Arrays.sort(value_1);
		Arrays.sort(value_2);

		// running nested for loop
		for (int i = 0; i <= value_1.length - 1; i++) {
			for (int j = 0; j <= value_2.length - 1; j++) {
				if (value_1[i] == value_2[j]) { // checking common values
					System.out.println(value_1[i]);
				}
			}
		}
	}
}
