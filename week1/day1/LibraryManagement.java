package week1.day1;

public class LibraryManagement {

	public static void main(String[] args) {

		Library bookeeper = new Library();
		
		System.out.println(bookeeper.addbook("Think grow & rich"));
		bookeeper.issuebook();
	}

}
