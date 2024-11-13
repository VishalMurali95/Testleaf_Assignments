package week3.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3school_Frame_Assignment {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("SaiShree");
		alert.accept();
		
		Thread.sleep(3000);
		String successMsg = driver.findElement(By.id("demo")).getText();
		//System.out.println(successMsg);
		
		String message = "Hello SaiShree! How are you today?";

		
		if (successMsg.equals(message)) {
			System.out.println("Good Job, Done!");
		} else {
			System.out.println("Something happened.");

		}
		
		driver.close();
		
	}

}
