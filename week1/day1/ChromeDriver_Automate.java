package week1.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChromeDriver_Automate {

	public static void main(String[] args) {

		// Open the chrome browser
		//ChromeDriver ch_driver = new ChromeDriver();
		
		//Edge browser
		EdgeDriver ch_driver = new EdgeDriver();
		
		// Load the URL
		ch_driver.get("https://www.youtube.com/");
		
		String title = ch_driver.getTitle();
		System.out.println("Title of the page: "+title);
		
		// Maximize the window
		ch_driver.manage().window().maximize();
		
		//close the browser
		ch_driver.close();
	}

}
