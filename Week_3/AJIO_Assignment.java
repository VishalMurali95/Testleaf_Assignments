package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AJIO_Assignment {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		
		Thread.sleep(3000);
		String totalItems = driver.findElement(By.xpath("//div[@class='length']/strong")).getText();
		System.out.println("Total Items : "+totalItems);
		
		List<WebElement> brandNames = driver.findElements(By.xpath("//div[@class='brand']"));
		
		List<String> brands_List = new ArrayList<String>();
		List<String> bags_list = new ArrayList<String>();
		
		for (WebElement brands : brandNames) {
			String brandNames_list = brands.getText();
			brands_List.add(brandNames_list);
		}
		
		System.out.println("AJIO Bags Brand Names: "+brands_List);
		
		List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
		
		for (WebElement bags : bagNames) {
			String bagnames_list = bags.getText();
			bags_list.add(bagnames_list);
			
		}
		
		System.out.println("AJIO Bag Names: "+bags_list);
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
