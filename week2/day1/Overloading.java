package week2.day1;

public class Overloading {
	
	public void reportStep(String message, String status ) {
		System.out.println("Message: "+ message +" " + "Status: "+ status);
		
	}
	
	public void reportStep(String message, String status, boolean snap ) {
		System.out.println("Message: "+ message +" " + "Status: "+ status +" " + "Snap: " +snap);
		
	}
	
	public static void main(String[] args) {
		
		Overloading overload = new Overloading();
		overload.reportStep("Hi", "Good");
		overload.reportStep("Hello", "Fantastic", true);
	}
}
