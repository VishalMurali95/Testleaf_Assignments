package week1.day1;

public class Library {

	// creating method for book added successfully
	String addbook (String bookTitle) {
		System.out.println("Book added successfully");
		return "Book Title: "+bookTitle;
	}
	
	// creating method for book issued successfully
	void issuebook() {
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		
		//creating objects to call the methods
		Library command = new Library();
		
		// calling the method
		System.out.println(command.addbook("Psychology of Money"));
		command.issuebook();
	}
}

	
	
