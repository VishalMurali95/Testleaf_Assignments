package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Actions_BigBasket {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//1. Navigate to https://www.bigbasket.com/.
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2. Click on "Shop by Category".
		driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bab6:']")).click();
		
		//3. Mouse over "Foodgrains, Oil & Masala".
		WebElement food = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));		
		Thread.sleep(3000);
		Actions mouse = new Actions(driver);
		mouse.moveToElement(food).perform();
		
		//4. Mouse over "Rice & Rice Products".
		WebElement rice = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		mouse.moveToElement(rice).perform();
		
		//5. Click on "Boiled & Steam Rice".
		WebElement boiledRice = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		mouse.moveToElement(boiledRice).click().perform();
		
		//6. Filter the results by selecting the brand "bb Royal".
		Thread.sleep(3000);
		WebElement riceBrand = driver.findElement(By.xpath("//label[text()='BB Royal']"));
		
		driver.executeScript("arguments[0].click()", riceBrand);
		
		//7. Click on "Tamil Ponni Boiled Rice".
		Thread.sleep(3000);
		WebElement tamilPonniRice = driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']"));
		mouse.moveToElement(tamilPonniRice).click().perform();
		
		//8. Select the 5 Kg bag.
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		
		Thread.sleep(3000);
		WebElement riceQty = driver.findElement(By.xpath("//span[text()='5 kg']"));
		mouse.moveToElement(riceQty).click().perform();
		
		//9. Check and note the price of the rice.
		WebElement price_5kg = driver.findElement(By.xpath("//span[text()='5 kg']/following::span[2]/span[1]"));
		System.out.println("5kg Price : "+price_5kg.getText());
		
		//10. Click "Add" to add the bag to your cart.
		WebElement addToBasket = driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]"));
		mouse.moveToElement(addToBasket).click().perform();
		
		//11. Verify the success message that confirms the item was added to your cart.
		WebElement successNotification = driver.findElement(By.xpath("//p[@class='mx-4 flex-1']"));
		
		WebDriverWait xpWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		xpWait.until(ExpectedConditions.visibilityOf(successNotification));
		String Notification = successNotification.getText();
		System.out.println("Notification Message : "+Notification );
		
		String successMessage = "An item has been added to your basket successfully";
		
		if (Notification.equals(successMessage)) {
			System.out.println("Order Placed Successfully");
			
		} else {
			System.out.println("Order not placed");

		}
		
		//12. Take a snapshot of the current page
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		Files.copy(screenshotAs, new File("E:\\Testleaf\\Sessions\\LearnSelenium\\Screenshots\\bigbasket.png"));
		
		//13. Close the current window.
		//14. Close the main window.
		driver.close();
		driver.switchTo().window(windows.get(0));
		driver.close();
		
	}

}
