package week3.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Alerts {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame("iframeResult");
		
		//driver.switchTo().defaultContent();
		
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String message = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		
		String success_msg = "You pressed OK!";
		
		if (message.contains(success_msg)) {
			System.out.println("You pressed OK!");
			
		} else {
			System.out.println("You pressed Cancel!");

		}
		
		driver.close();
		
	}

}
