package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_Assignment {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//label[text()='Chrome'])[1]/preceding-sibling::div")).click();
		driver.findElement(By.xpath("(//label[text()='Chennai'])[1]/preceding-sibling::div")).click();
		
		driver.findElement(By.xpath("(//label[text()='Chennai'])[1]/preceding-sibling::div")).click();
		boolean unselect = driver.findElement(By.xpath("(//label[text()='Chennai'])[1]/preceding-sibling::div")).isSelected();
		
		if (!unselect) {
			System.out.println("Radio button got unselected");
		} else {
			System.out.println("Radio button got selected");

		}
		
		// sometimes, we can't use isselected() method to see whether it's selected or not
		// instead we can use below css method to figure it out whether it's selected or not
		
		//WebElement age_radio = driver.findElement(By.xpath("(//div[contains(@class,'ui-state-active')])[5]"));
		
		//testing with other not selected age
		WebElement age_radio = driver.findElement(By.xpath("(//div[@class='ui-g-12 ui-md-4'])[4]//div[2]"));
		
		boolean select_ageRadio = age_radio.getAttribute("class").contains("ui-state-active");
		System.out.println("status of the radio button :"+ select_ageRadio);
		
		
		if (!select_ageRadio) {
			System.out.println("Previous status of the button :" + select_ageRadio);
			age_radio.click();
			boolean select_ageRadio_1 = age_radio.getAttribute("class").contains("ui-state-active");
			System.out.println("Current status of the button :" + select_ageRadio_1);
			
		} else {
			System.out.println("Status of the button :" + select_ageRadio);

		}
		
		driver.close();
		
	}
	

}
