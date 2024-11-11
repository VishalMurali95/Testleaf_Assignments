package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

import io.github.sukgu.Shadow;

import org.openqa.selenium.chrome.ChromeDriver;

public class Servicenow_Marathon_2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//1. Launch ServiceNow application
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://dev186929.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//2. Login with valid credentials username as admin and password 
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.id("sysverb_login")).click();
		
		//3. Click----->All in the SERVICE NOW Page  &  click the  Service catalog in filter navigator.
		Shadow shadow = new Shadow(driver);
		shadow.findElementByXPath("//div[text()='All']").click();
		
		Thread.sleep(3000);
		shadow.findElementByXPath("//a[@id='e660172ac611227b00fa88fb47ae3fad']").click();

		//4. Click on  mobiles
		WebElement mainFrame = shadow.findElementByXPath("//iframe[@id='gsft_main']"); //frame is hidden in the shadow
		
		driver.switchTo().frame(mainFrame);
		
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		
		//5. Select Apple iphone13pro
		Thread.sleep(3000);
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		
		//6. Choose yes option in lost or broken iPhone, enter the mobile number
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		
		//7. Select Unlimited from the dropdown in Monthly data allowance
		driver.findElement(By.xpath("//input[@id='IO:4afecf4e9747011021983d1e6253af34']")).sendKeys("6374572084");
		
		WebElement monthlyDataAllowance = driver.findElement(By.xpath("//select[@id='IO:ff1f478e9747011021983d1e6253af68']"));
		
		Select dropdown = new Select(monthlyDataAllowance);
		dropdown.selectByVisibleText("Unlimited [add £3.09]");
		
		//8. Update color field to SierraBlue and storage field to 512GB
		driver.findElement(By.xpath("//input[@value='sierra_blue']/following::label[1]")).click();
		
		driver.findElement(By.xpath("//input[@value='512']/following::label[1]")).click();
	
		driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
		
		//10. Verify order is placed and copy the request number
		String requestNo = driver.findElement(By.id("requesturl")).getText();
		
		//11.Take a Snapshot of order placed page
		if ((driver.getTitle()).contains("Order Status")) {
			System.out.println("Your order is placed");
			System.out.println("Please find your request number : "+ requestNo);
			
		} else {
			System.out.println("Order is not placed.");

		}
		
		Thread.sleep(5000);
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		Files.copy(screenshotAs, new File("E:\\Testleaf\\Sessions\\LearnSelenium\\Screenshots\\orderstatus.png"));
		
		driver.close();
		
	}

}
