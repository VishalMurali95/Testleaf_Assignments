package practice1;

public class String_Practice {

	public static void main(String[] args) {

		String name = "Vishal";
		String yourName = "Vishal";
		String dadName = "Murali";
		String momName = "Ruckmani";
		String wifeName = "Pavani";
		String daughterName = "SaiShree";
		
		// Count the characters
		int string_length = name.length();
		System.out.println(string_length);
		
		//compare two strings
		boolean string_equals = name.equals(yourName);
		System.out.println(string_equals);
		
		//or
	
		if (name.equals(dadName)) {
			System.out.println("Both values are same");
			
		} else {
			System.out.println("Both values are different");

		}
		
		//compare two strings with == - to identify whether they has same memory allocation
		
		if (name==yourName) {
			System.out.println("Same memory allocation");
			
		} else {
			System.out.println("Different memory allocation");

		}
		
		// ignore case - ignores lower and upper case and check whether remaining characters are same
		
		boolean equalsIgnoreCase = name.equalsIgnoreCase(yourName);
		System.out.println(equalsIgnoreCase);
	
		
		// boolean contains = name.contains(dadName);
		boolean contains = name.contains("Vishal");
		System.out.println(contains);
		
		//convert string to array
		char[] nameArray = name.toCharArray();
		System.out.println(nameArray);
		//print the length of the array
		System.out.println(nameArray.length);
		System.out.println("Array index: "+nameArray[0]);

		
		//find the index value in the STRING (not in the converted array) - it won't work in the converted array.
		char charAt = yourName.charAt(1);
		System.out.println(charAt);
		
		//using for loop, print all the characters in the array
		for (int i=0; i<nameArray.length; i++) {
			System.out.println(nameArray[i]);
			
		//using for loop, print all the characters in the array - reverse order
		for (int j=nameArray.length-1; j>=0; j--) {
			System.out.println(nameArray[j]);

		}
		}
	}
}
