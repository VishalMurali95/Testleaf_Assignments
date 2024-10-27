package week2.day1;

public class Amazon extends CanaraBank {

	@Override
	public void cardPayments() {
		System.out.println("We are supporting VISA & RUPAY cards");
	}

	@Override
	public void internetBanking() {
		System.out.println("You can pay via Internet banking");
	}

	@Override
	public void recordPaymentDetails() {
		System.out.println("Your details are saved for future purchase");
	}
	
	public static void main(String[] args) {
		
		Amazon customer = new Amazon();
		customer.cashOnDelivery();
		customer.upiPayments();
		customer.cardPayments();
		customer.internetBanking();
		customer.recordPaymentDetails();
	}

}
