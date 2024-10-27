package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Assignment {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		// Loading the URL
		driver.get("https://www.facebook.com/");
		
		// Get the Title
		String title = driver.getTitle();
		System.out.println("Title of the Page:" +title);
			
		// Maximize the window
		driver.manage().window().maximize();
		
		// Closing the Window
		driver.close();
	}

}
