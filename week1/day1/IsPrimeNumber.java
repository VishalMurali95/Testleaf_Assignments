package week1.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 13;
		boolean isPrime = true;

		// make sure iteration starts from 2, i=2; because i=1, then it's divisble it is
		// not a prime number
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			} 
		}
		
		// make sure this if statement is created once the for loop ends
			if (isPrime) {
				System.out.println(num+ ": It's a Prime Number");
				
			} else {
				System.out.println(num+ ": It's not a Prime Number");


		}

	}

}
