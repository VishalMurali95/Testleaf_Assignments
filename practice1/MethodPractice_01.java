package practice1;

import org.openqa.selenium.devtools.v115.browser.Browser;

public class MethodPractice_01 {

	// method 1
	public float operations(int a, int b, float c) {
		return (a + b + c);
	}

	// method 1.1
	int multiply(int a, int b, int c) {
		return a * b * c;
	}

	// method 2
	String mood(String office, String school, String vacation) {
		return office + " " + school + " " + vacation;
	}

	// method 3
	int empty() {
		return 0;

	}

    // method 4
	String nothing() {
		return "Nothing is here";
	}

	//method 5 - Void
	
	// if void is there, no data type is needed - here int - is not declared
	void maths (int a, int b, int c) {
		System.out.println((a+b)-c);
	}
	
	public static void main(String[] args) {
		
		// Object creation
		MethodPractice_01 calc = new MethodPractice_01();
		
		// calling method 1
		System.out.println(calc.operations(2, 3, 4.5f));
		
		//calling method 1.1
		System.out.println(calc.multiply(2, 3, 6));

		//calling method 2
		System.out.println(calc.mood("Work Pressure", "Exam Tension", "Happy Days"));
		
		//calling method 3
		System.out.println(calc.empty());
		
		//calling method 4
		System.out.println(calc.nothing());
		
		//calling method 5
		calc.maths(2, 3, 2);
		
	}
}


