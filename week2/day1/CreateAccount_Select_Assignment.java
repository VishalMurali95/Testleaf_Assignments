package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount_Select_Assignment {

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
		
		WebElement industry_element = chrome.findElement(By.name("industryEnumId"));
		Select industry = new Select(industry_element);
		industry.selectByIndex(3);
		
		
		WebElement ownership_element = chrome.findElement(By.name("ownershipEnumId"));
		
		Select ownership = new Select(ownership_element);
		ownership.selectByVisibleText("S-Corporation");
		
		
		WebElement source_element = chrome.findElement(By.id("dataSourceId"));
		
		Select source = new Select(source_element);
		source.selectByValue("LEAD_EMPLOYEE");
		
		WebElement marketing_element = chrome.findElement(By.id("marketingCampaignId"));
		
		Select marketing = new Select(marketing_element);
		marketing.selectByIndex(6);
		
		WebElement state_element = chrome.findElement(By.id("generalStateProvinceGeoId"));
		
		Select state = new Select(state_element);
		state.selectByValue("TX");
		
		String expTitle = "Create Account | opentaps CRM";
		
		chrome.findElement(By.className("smallSubmit")).click();
		
		System.out.println("Title of the page: " + (chrome.getTitle()));
		
		if (expTitle.equals(chrome.getTitle())) {
			System.out.println("Page Title is same, Verified.");

		} else {
			System.out.println("Page title is not same");

		}
		
		chrome.close();
	}

}
