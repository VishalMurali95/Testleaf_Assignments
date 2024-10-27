package practice1;

public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// arithmetic operators
		
		// Declaring the variables with values
		int value_1 = 16;
		int value_2 = 3;
		
		//Arithmetic operations with variables assignment
		int addition = value_1+value_2;
		int subtraction = value_1-value_2;
		int multiplication = value_1*value_2;
		int division = value_1/value_2;
		int modulus = value_1%value_2;
		
		//printout statements - arithmetic operations
		System.out.println("Addition:"+addition);
		System.out.println("Subtraction:"+subtraction);
		System.out.println("Multiplication:"+multiplication);
		System.out.println("Division:"+division);
		System.out.println("Modulus:"+modulus);
		
		//printout statement - Assignment operations
		System.out.println(value_1+=1);
		System.out.println(value_1-=2);
		System.out.println(value_1*=2);
		System.out.println(value_1/=2);
		System.out.println(value_1%=2);

		//printout statement - Comparison operations
		System.out.println(value_1==value_2);
		System.out.println(value_1!=value_2);
		System.out.println(value_1>=value_2);
		System.out.println(value_1<=value_2);
		
		// unary operations
		int a =3;
		int b =5;
		System.out.println(++a);
		System.out.println(b++);
		System.out.println(b);
		
		System.out.println(--a);
		System.out.println(b--);
		System.out.println(b);
	}

}
