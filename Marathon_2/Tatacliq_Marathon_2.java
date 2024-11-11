package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Tatacliq_Marathon_2 {

	public static void main(String[] args) throws InterruptedException, IOException {

		// 1. Load the url as https://www.tatacliq.com/
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// click Ask me later on the notifications -- if I add disable notifications,
		// then the website load suddenly stops becoming white
		driver.findElement(By.xpath("//button[text()='Ask Me Later']")).click();

		// 2. MouseHover on 'Brands'
		WebElement brands_button = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(brands_button).click().perform();

		// 3. MouseHover on 'Watches & Accessories'
		WebElement Watches_accessories = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		mouse.moveToElement(Watches_accessories).click().perform();

		// 4. Choose the first option from the 'Featured brands'.
		WebElement featureBrands = driver.findElement(By.xpath("//div[contains(@class,'featureBrands')]//div[2]"));
		mouse.moveToElement(featureBrands).click().perform();

		// 5. Select sort by to New Arrivals
		WebElement sortBy = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select dropDown = new Select(sortBy);
		dropDown.selectByVisibleText("New Arrivals");

		// 6. choose men from categories filter.
		driver.findElement(By.xpath("(//div[text()='Men'])[1]")).click();
		Thread.sleep(3000); //getting thread.sleep otherwise getting element not found exception

		//String price = driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder']/h3")).getText();
		//System.out.println(price);

		// 7. print all price of watches
		List<WebElement> watchPrice = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		
		String product_1_price = watchPrice.get(0).getText(); //get the 1st product price value, will be used to validate at the final end
		//System.out.println(product_1_price);
		
		ArrayList<String> price_list = new ArrayList<String>();
		
		for (WebElement eachPrice : watchPrice) {
			price_list.add(eachPrice.getText());
		}
		
		System.out.println("Watch Prices :" +price_list); //printing the watches price list
		
		//8. click on the first resulting watch
		driver.findElement(By.xpath("//div[@class='ProductModule__base'][1]")).click();
		
		
		//9. click Add to Bag   and  get count from the Bag cart icon.
		Set<String> windowHandles = driver.getWindowHandles();
		
		ArrayList<String> windows = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		String cartCount = driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']/span")).getText();
		System.out.println("Bag cart count: "+ cartCount);
		
		
		//10. compare two price are similar
		String productPrice = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();
		
		String[] price = productPrice.split(" ");
		//System.out.println(price[1]);
		
		if (price[1].equals(product_1_price)) {
			System.out.println("Two prices are similar");
			
		} else {
			System.out.println("Prices are not similar");

		}
		
		//11. Click on the Bag cart icon
		driver.findElement(By.xpath("//div[contains(@class,'myBagShow')]")).click();
		
		//12. Take a snap of the resulting page. 
		Thread.sleep(5000);
		File Screenshot = driver.getScreenshotAs(OutputType.FILE);
		Files.copy(Screenshot, new File("E:\\Testleaf\\Sessions\\LearnSelenium\\Screenshots\\tatacliqcart.png"));
		
		//13. Close All the opened windows one by one.
		driver.close();
		
		Thread.sleep(3000);
		driver.switchTo().window(windows.get(0)); //getting this value, which we already stored
		driver.close();

	}

}
