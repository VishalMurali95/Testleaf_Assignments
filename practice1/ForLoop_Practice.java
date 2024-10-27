package practice1;

public class ForLoop_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//fibonacci series
		
		int value_1 = 0;
		int value_2 = 1;
		System.out.println(value_1);
		System.out.println(value_2);
		
		for (int i = 1; i<=10; i++) {
			int value_3=value_1+value_2;
			System.out.println(value_3);
			value_1 = value_2;
			value_2 = value_3;
			
		}
	}

}
