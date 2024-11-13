package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete_Lead_Assignment {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver chrome = new ChromeDriver();
		
		chrome.get("http://leaftaps.com/opentaps/");
		
		chrome.manage().window().maximize();
		
		chrome.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		chrome.findElement(By.id("password")).sendKeys("crmsfa");
		
		chrome.findElement(By.className("decorativeSubmit")).click();
		
		chrome.findElement(By.xpath("//div[@for='crmsfa']")).click();
		
		chrome.findElement(By.xpath("//a[text()='Leads']")).click();
		
		chrome.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		chrome.findElement(By.xpath("//span[text()='Phone']")).click();
		Thread.sleep(3000);
		
		chrome.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("9876543210");
		
		chrome.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(3000);
		String userid = chrome.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]")).getText();
		System.out.println("Before deletion, User ID: " + userid);
		
		chrome.findElement(By.xpath("//div[contains(@class,'x-grid3-col-partyId')]/a")).click();
		
		chrome.findElement(By.xpath("//a[text()='Delete']")).click();
		
		chrome.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		chrome.findElement(By.xpath("//span[text()='Phone']")).click();
		Thread.sleep(3000);
		
		chrome.findElement(By.xpath("//input[@id='ext-gen270']")).sendKeys("9876543210");
		
		chrome.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String noRecord = "No records to display";	
		
		Thread.sleep(3000);
		String noRecordText = chrome.findElement(By.xpath("//div[text()='No records to display']")).getText();
		//System.out.println(noRecordText);
		
		if (noRecordText.equals(noRecord)) {
			System.out.println("Record Successfully Deleted");
			
		} else {
			System.out.println("Record not deleted");

		}
		
		chrome.close();
	}

}
