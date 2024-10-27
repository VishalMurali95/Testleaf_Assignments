package practice1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_Test0 {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		driver.close();
		
	}

}
