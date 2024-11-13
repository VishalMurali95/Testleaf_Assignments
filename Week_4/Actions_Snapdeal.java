package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Actions_Snapdeal {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		//1. Launch (https://www.snapdeal.com/)
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2. Go to "Men's Fashion".
		WebElement mensFashion = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		
		Actions mouse = new Actions(driver);
		mouse.moveToElement(mensFashion).perform();
		
		//3. Go to "Sports Shoes".
		WebElement sportsShoes = driver.findElement(By.xpath("(//span[text()=\"Sports Shoes\"])[1]"));
		mouse.moveToElement(sportsShoes).click().perform();
		
		//4. Get the count of sports shoes.
		Thread.sleep(3000);
		WebElement sportsShoesCount = driver.findElement(By.xpath("//span[@class='category-name category-count']"));
		System.out.println("Total Sports shoes count : " +sportsShoesCount.getText());
		
		//5. Click on "Training Shoes".
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		
		//6. Sort the products by "Low to High".
		driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
		driver.findElement(By.xpath("//li[@data-sorttype='plth']")).click();
		
//		7. Check if the displayed items are sorted correctly. - not sure how to do this, so proceed with 8 step
//		8. Select any price range ex:(500-700).
//		9. Filter by any colour.
//		10. Verify all the applied filters. - not sure how to do this, so proceed with 11 step
//		11. Mouse hover on the first resulting "Training Shoes".
//		12. Click the "Quick View" button.
//		13. Print the cost and the discount percentage.
//		14. Take a snapshot of the shoes.
//		15. Close the current window.
//		16. Close the main window.
		
		
		
	}

}
