package week3.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List_Collection_Amazon {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles", Keys.ENTER);
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		// finding the prices 
		List<WebElement> mobilePrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		//creating new list
		//List<String> mobilePriceList = new ArrayList<String>();
		List<Integer> mobilePriceList = new ArrayList<Integer>();
		
		// actually we use to get the price as text (i.e, string), since we are creating the list type as integer, we need to convert string to integer
		//using for each loop to iterate the list
		for (WebElement phoneprice : mobilePrice) {
			String phonepricedata = phoneprice.getText(); //Retrieving the text value
			String replaceAll = phonepricedata.replaceAll(",", ""); //since there is a comma (,), first we need to remove the comma then only we can convert to integer
			int phoneprice_int = Integer.parseInt(replaceAll); //since we created the list in integer, we need to convert to integer
			mobilePriceList.add(phoneprice_int);
			Collections.sort(mobilePriceList); //sort the list
			
		}

		System.out.println("size of the list: "+mobilePriceList.size());
		System.out.println("Amazon phone price output : "+ mobilePriceList);
		System.out.println(mobilePriceList.get(1));
		
		driver.close();
	}

}
