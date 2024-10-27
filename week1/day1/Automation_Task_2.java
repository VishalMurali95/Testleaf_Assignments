package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Task_2 {

	public static void main(String[] args) {

		ChromeDriver chrome = new ChromeDriver();
		
		chrome.get("http://leaftaps.com/opentaps/");
		
		chrome.manage().window().maximize();
		
		chrome.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		chrome.findElement(By.id("password")).sendKeys("crmsfa");
		
		chrome.findElement(By.className("decorativeSubmit")).click();
		
		chrome.findElement(By.partialLinkText("CRM/SFA")).click();
		
		chrome.findElement(By.linkText("Leads")).click();
		
		chrome.findElement(By.linkText("Create Lead")).click();
		
		chrome.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		
		chrome.findElement(By.id("createLeadForm_firstName")).sendKeys("Vishal");
		
		chrome.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		
		WebElement source_element = chrome.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select source = new Select(source_element);
		source.selectByIndex(4);
		
		WebElement marketing_element = chrome.findElement(By.id("createLeadForm_marketingCampaignId"));
		
		Select marketing = new Select(marketing_element);
		marketing.selectByVisibleText("Automobile");
		
		WebElement owner_element = chrome.findElement(By.id("createLeadForm_ownershipEnumId"));
		
		Select owner = new Select(owner_element);
		owner.selectByValue("OWN_SCORP");
		
		chrome.findElement(By.className("smallSubmit")).click();
	
		
		String pageTitle = chrome.getTitle();
		System.out.println(pageTitle);
		
		String title = "View Lead | opentaps CRM";
		
		if (title.equals(pageTitle)) {
			System.out.println("Title is same");
			
		} else {
			System.out.println("Title is not same");

		}
		
		chrome.close();
		
	}

}
