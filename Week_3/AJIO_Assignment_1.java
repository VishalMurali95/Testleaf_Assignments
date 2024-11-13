package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AJIO_Assignment_1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags", Keys.ENTER);
		
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		WebElement totalItemCount = driver.findElement(By.xpath("//div[@class='length']/strong"));
		Thread.sleep(3000);
		System.out.println(totalItemCount.getText());
		
		// finding and printing out the brand names
		List<WebElement> brands = driver.findElements(By.xpath("//div[@class='brand']/strong"));
		
		List<String> brands_list = new ArrayList<String>();
		
		for (WebElement eachbrand : brands) {
			brands_list.add(eachbrand.getText());
		}
		
		System.out.println("AJIO Bag Brands :"+brands_list);
		
		//finding and printing the bag names
		
		List<WebElement> bags = driver.findElements(By.xpath("//div[@class='nameCls']"));
				
		List<String> bagnames_list = new ArrayList<String>();
		
		for (WebElement bagnames : bags) {
			bagnames_list.add(bagnames.getText());
		}
		System.out.println("AJIO Bag names :"+bagnames_list);
		
		driver.close();
		
	}

}
