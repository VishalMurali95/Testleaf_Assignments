package practice1;

public class If_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks = 95;
		
		if (marks>=90) {
			System.out.println("Congratulations! S Grade.");
			
		}else if (marks >=75) {
			System.out.println("Congratulations! A Grade.");

		}else if (marks >=60) {
			System.out.println("Good Work! B Grade.");

		}else if (marks>=45) {
			System.out.println("Good work, need to improve - C Grade.");

		}else
			System.out.println("Fail, Meet me in the staffroom");

	}

}
