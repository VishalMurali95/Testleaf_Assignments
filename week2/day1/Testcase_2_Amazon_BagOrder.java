package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_2_Amazon_BagOrder {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		/*
		 * 01) Launch Chrome 
		 * 02) Load https://www.amazon.in/
		 */		
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		// add  implicitlyWait - driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//03) Type "Bags for boys" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//04) Choose the 	 item in the result (bags for boys)
		//driver.findElement(By.xpath("//img[@alt='American Tourister Valex 28 Ltrs Large Laptop Backpack']")).click();
		
		/*
		 * 05) Print the total number of results (like 50000) example like this----->
		 * 1-48 of over 50,000 results for "bags for boys"
		 */
		
		String results = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println("Results : " +results);
		
		/*
		 * 06) Select the first 2 brands in the left menu (like American Tourister,Generic)
		 */
		// for checkbox use div tag elements for clickable - don't use input tag, it won't work
		driver.findElement(By.xpath("(//div[contains(@class,'aok-float-left')])[4]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'aok-float-left')])[8]")).click();
		
		//07) Choose New Arrivals (Sort)
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		//08) Print the first resulting bag info (name, discounted price)
		String bagname = driver.findElement(By.xpath("(//h2[contains(@class,'s-line-clamp-2')])[1]")).getText();
		System.out.println("Product information : "+bagname);
		
		//09) Get the page title and close the browser(driver.close())
		String title = driver.getTitle();
		System.out.println("Page Title : "+title);
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
