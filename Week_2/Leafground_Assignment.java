package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground_Assignment {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		
		boolean enabled = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled();
		System.out.println("Status of the confirm button :" +enabled);
		
		System.out.println(driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation());
		
		System.out.println(driver.findElement(By.xpath("(//span[text()='Save'])[1]")).getCssValue("background-color"));
		
		System.out.println(driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize());
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.contains("Dashboard")) {
			System.out.println("Title Verified");
			
		} else {
			System.out.println("Title is not verified");

		}
		
		driver.close();
	}

}
