package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_Account_Assignment {

	public static void main(String[] args) {

		ChromeDriver chrome = new ChromeDriver();

		chrome.get("http://leaftaps.com/opentaps/");

		chrome.manage().window().maximize();

		chrome.findElement(By.id("username")).sendKeys("demosalesmanager");

		chrome.findElement(By.id("password")).sendKeys("crmsfa");

		chrome.findElement(By.className("decorativeSubmit")).click();

		chrome.findElement(By.partialLinkText("SFA")).click();

		chrome.findElement(By.linkText("Accounts")).click();

		chrome.findElement(By.linkText("Create Account")).click();

		chrome.findElement(By.id("accountName")).sendKeys("Vishal");

		chrome.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		chrome.findElement(By.id("numberEmployees")).sendKeys("10");

		chrome.findElement(By.id("officeSiteName")).sendKeys("Leaftaps");

		chrome.findElement(By.className("smallSubmit")).click();

		String expTitle = "Create Account | opentaps CRM";

		
		System.out.println(chrome.getTitle());

		if (expTitle.equals(chrome.getTitle())) {
			System.out.println("Page Title is same, Verified.");

		} else {
			System.out.println("Page title is not same");

		}

		chrome.close();

	}

}
