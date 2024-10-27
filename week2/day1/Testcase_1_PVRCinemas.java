package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase_1_PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		
		// if the code is not running properly clear cookies in the chrome and rerun the code again

		/*
		 * 1) Launch the Browser 
		 * 2) Load the Url "https://www.pvrcinemas.com/" 
		 * 3) Choose Your location as "Chennai" (sometimes it will be located automatically)
		 */
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		/*
		 * 4) Click on Cinema under Quick Book 
		 * 5) Select Your Cinema
		 */
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']")).click();
		//driver.findElement(By.xpath("(//span[contains(text(),'Velachery')])[2]")).click();
		
		//6) Select Your Date as Tomorrow
		//driver.findElement(By.xpath("//span[text()='Select Date']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		
		//7) Select Your Movie
		driver.findElement(By.xpath("(//span[text()='DEEPAVALI BONUS'])[2]")).click();
		
		// 8) Select Your Show Time
		driver.findElement(By.xpath("//span[text()='10:00 PM']")).click();
		
		//9) Click on Book Button
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		
		//10) Click Accept on Term and Condition
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		
		//11) Click any one available seat
		driver.findElement(By.xpath("//span[@id='SL.SILVER|B:1']")).click();
		
		//12) Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		//13) Print the Seat info under book summary
		Thread.sleep(5000);
		String seat_no = driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println("Your seat no. "+ seat_no);
		
		//14) Print the grand total under book summary
		String total = driver.findElement(By.xpath("//h6[text()='Grand Total']/following-sibling::h6")).getText();
		System.out.println("Total Cost : "+total);
		
		//15) Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		//16) Close the popup
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		
		//17) Print Your Current Page title
		String title = driver.getTitle();
		System.out.println("Page Title: "+title);
		
		//18) Close Browser
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
