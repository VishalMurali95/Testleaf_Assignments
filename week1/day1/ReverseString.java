package week1.day1;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "Vishal";
		
		char[] charArray = name.toCharArray();
		System.out.println(charArray);
		
		for (int i=charArray.length-1; i>=0; i--) {
			System.out.println(charArray[i]);
		}
		

	}

}
