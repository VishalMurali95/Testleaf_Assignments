package week1.day1;

import java.util.Arrays;

public class FindingMissingElement {

	public static void main(String[] args) {

		//initializing the array
		int[] values = { 1, 4, 3, 2, 8, 6, 7 };

		//sorting the array
		Arrays.sort(values);

		// using for loop, comparing and validating which number is missing
		for (int i = 0; i <values.length; i++) {
			if ((i + 1)!=values[i]) { // why i+1 is - if we go with 0 everything would get mismatch, that's why +1
				System.out.println("Missing values :" + (i + 1)); // printing the mismatch value
				break; //breaks, once we find the missing element
			}
		}
	}

}
