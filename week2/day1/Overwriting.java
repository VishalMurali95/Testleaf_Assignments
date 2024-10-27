package week2.day1;

public class Overwriting extends Overloading {

	public void reportStep(String message, String status ) {
		System.out.println("your Message: "+ message +" , " + "your Status: "+ status);
		
	}
	
	public static void main(String[] args) {
		Overwriting overwrite = new Overwriting();
		overwrite.reportStep("Overwrite", "Successfull");
	}
}
