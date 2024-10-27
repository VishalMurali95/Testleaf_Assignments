package week1.day1;

public class Array_FindIntersection_Assignment {

	public static void main(String[] args) {

		//storing the values in the array
		int[] set1 = {3,2,11,4,6,7};
		int[] set2 = {1,2,8,4,9,7};
		
		//iterating each values in both the arrays & comparing printing the matched items
		for (int i=0; i<set1.length; i++) { // iterating the loop for array set_1
			for (int j=0; j<set2.length; j++) { //iterating the loop for array set_2
				if (set1[i]==set2[j]) { // comparing both the values
					System.out.println(set1[i]); //printing the matched values
					
				}
			}
		}
	}

}
