package week2.day1;

public abstract class CanaraBank implements Payments {

	public void cashOnDelivery() {
		System.out.println("Cashon Delivery is applicable for you");
	}
	
	public void upiPayments() {
		System.out.println("You can pay via UPI payments");
	}
	
	public abstract void recordPaymentDetails();
}
