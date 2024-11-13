package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Interactions {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"])[1]")).click();
		driver.findElement(By.xpath("(//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"])[2]")).click();
		driver.findElement(By.xpath("(//div[@class=\"ui-chkbox-box ui-widget ui-corner-all ui-state-default\"])[3]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		boolean selected = driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isSelected();
		
		if (selected == false) {
			System.out.println("Checkbox disabled");
			
		} else {
			System.out.println("Checkbox is enabled");

		}
		
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]/preceding-sibling::div")).click();
		driver.findElement(By.xpath("(//label[text()='Rome'])[2]/preceding-sibling::div")).click();
		driver.findElement(By.xpath("(//label[text()='Amsterdam'])[2]/preceding-sibling::div")).click();
		
		Thread.sleep(5000);
		driver.close();
	}

}
