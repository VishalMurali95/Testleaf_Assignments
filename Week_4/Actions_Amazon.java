package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Actions_Amazon {

	private static String text;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//1. Load the URL (https://www.amazon.in/)
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2. Search for "oneplus 9 pro".
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
		
		//3. Get the price of the first product.
		String Product_1_price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		String Product_1 = Product_1_price.replaceAll("[^0-9]", "");
		System.out.println("Price of the product is : "+ Product_1);
		
		//4. Print the number of customer ratings for the first displayed product.
		String customerRatings = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println(customerRatings+" People Rated this product");
		
		//5. Click the first text link of the first image.
		driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		ArrayList<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		
		//6. Take a screenshot of the product displayed.
		Thread.sleep(5000);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		Files.copy(screenshotAs, new File("D:\\Testleaf\\Sessions\\LearnSelenium\\Screenshots\\Amazon_oneplus.png"));
		
		//7. Click the 'Add to Cart' button.
		//Thread.sleep(3000);
		driver.findElement(By.id("add-to-cart-button")).click();
		
		//8. Get the cart subtotal and verify if it is correct.
		
		WebElement cartTotal = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-price a-text-bold']"));
		
		WebDriverWait xpWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		xpWait.until(ExpectedConditions.visibilityOf(cartTotal));
		String total = cartTotal.getText();
		//System.out.println(total);
		
        //String cartTotal_replace = total.replace("₹", "");
        //String replace = cartTotal_replace.replace(".00", "");
		
		// we can use 2 replace at a time - learnt from chatGPT
        String replace = total.replaceAll(".00", "").replaceAll("[^0-9]", "");
		//System.out.println("value : "+ replace);
		
		if (replace.equals(Product_1)) {
			System.out.println("Verified!");
			
		} else {
			System.out.println("Prices are not same");

		}
		
		//9. Close the browser
		driver.close();
		driver.switchTo().window(windows.get(0));
		driver.close();
		
	}

}
