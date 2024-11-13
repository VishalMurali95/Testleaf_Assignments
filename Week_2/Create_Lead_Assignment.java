package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Lead_Assignment {

	public static void main(String[] args) {

		ChromeDriver chrome = new ChromeDriver();
		
		chrome.get("http://leaftaps.com/opentaps/");
		
		chrome.manage().window().maximize();
		
		chrome.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		chrome.findElement(By.id("password")).sendKeys("crmsfa");
		
		chrome.findElement(By.className("decorativeSubmit")).click();
		
		chrome.findElement(By.partialLinkText("SFA")).click();
		
		chrome.findElement(By.linkText("Leads")).click();
		
		chrome.findElement(By.linkText("Create Lead")).click();
		
		chrome.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		chrome.findElement(By.id("createLeadForm_firstName")).sendKeys("SAI");
		
		chrome.findElement(By.id("createLeadForm_lastName")).sendKeys("SHREE");
		
		chrome.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Student");
		
		chrome.findElement(By.className("smallSubmit")).click();
		
		String expectedTitle = "View Lead | opentaps CRM";
		
		String pageTitle = chrome.getTitle();
		System.out.println("Title of the page: "+pageTitle);
		
		if (expectedTitle.equals(pageTitle)) {
			System.out.println("Page Title is same, Verified.");
			
		} else {
			System.out.println("Page title is not same");

		}
		
		chrome.close();
		
		
	}

}
