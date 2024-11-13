package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook_Assignment {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get(" https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("vishal");
		
		driver.findElement(By.name("lastname")).sendKeys("Murali");
		
		driver.findElement(By.name("reg_email__")).sendKeys("9444260061");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Test@123");
		
		WebElement day_element = driver.findElement(By.id("day"));
		Select day = new Select(day_element);
		day.selectByIndex(0);
		
		WebElement month_element = driver.findElement(By.id("month"));
		Select month = new Select(month_element);
		month.selectByIndex(6);
		
		WebElement year_element = driver.findElement(By.id("year"));
		Select year = new Select(year_element);
		year.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("(//input[@id='sex'])[2]")).click();
		
	}

}
