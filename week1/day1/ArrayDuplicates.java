package week1.day1;

import java.util.Arrays;

public class ArrayDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] age = {29, 28, 28, 60, 55, 33, 33};

		Arrays.sort(age);
		System.out.println(age[0]);

		int length = age.length;
		System.out.println(length);

		for (int i=0; i<length-1; i++) {
			if (age[i]==age[i+1]) {
				System.out.println(age[i]);
		}
	}

}
	
}
