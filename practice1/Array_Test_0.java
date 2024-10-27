package practice1;

import java.util.Arrays;

public class Array_Test_0 {

	public static void main(String[] args) {

		int[] years = { 2000, 1999, 1879, 1657, 2022, 1998 };

		char[] intials = { 's', 'p', 'm', 'r', 'v' };

		System.out.println("length of the years array :" + years.length);
		
		System.out.println(years[0]);
		
		Arrays.sort(years);
		
		System.out.println(years[0]);

		System.out.println(years[years.length-1]);
		
//		for(int i=0; i<=years.length-1; i++) {
		for(int i=years.length-1; i>=0; i--) {
			System.out.println(years[i]);
		}


	}

}
