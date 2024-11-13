package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable_Assignment {

	public static void main(String[] args) {
		
		//1.Load the url and click on “Crypto” tab
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://finance.yahoo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='More']")).click();
		
		WebElement crypto = driver.findElement(By.xpath("(//a[text()='Crypto '])[3]"));
		Actions mouse = new Actions(driver);
		mouse.moveToElement(crypto).click().perform();
		
		//2.- Identify the table in the dom using <table> tag (//table)
		WebElement table = driver.findElement(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody"));
		
		/*
		 * - To access the row values, identify the row using <tr> to travel through the
		 * table - To access the column values of the table, identify the column using
		 * <th>/<td>
		 */
		
		List<WebElement> cryptos = driver.findElements(By.xpath("//table[@class='markets-table freeze-col yf-paf8n5 fixedLayout']/tbody/tr/td[2]"));
		
		ArrayList<String> crypto_list = new ArrayList<String>();
		
		//- Act on the elements in the table using WebElement function by iterating through the rows and columns
		for (WebElement cryptoz : cryptos) {
			crypto_list.add(cryptoz.getText());
			
		}
		
		//- Print the cryptocurrency names from table.
		System.out.println("Cryptocurrency names : " + crypto_list);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
