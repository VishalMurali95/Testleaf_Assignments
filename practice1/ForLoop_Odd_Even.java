package practice1;

public class ForLoop_Odd_Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value=10;
		
		// Even numbers
		for (int i = 1; i<=value; i++) {
		//for (int i =10; i>=value; i--) {
			if (i%2==0) {
				System.out.println("Even number: "+i);
				
			}else {
				System.out.println("Odd number: "+i);
			
			}
			
		}

	}

}
