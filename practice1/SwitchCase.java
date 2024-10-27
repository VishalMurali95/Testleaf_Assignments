package practice1;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String course = "Week_4";
		
		switch (course) {
		case "Week_1":
			System.out.println("Core Java basics");
			break;
		case "Week_2":
			System.out.println("Selenium basics");
			break;
		case "Week_3":
			System.out.println("Cucumber");

		default:
			System.out.println("No Batches");
			break;
		}
	}

}
