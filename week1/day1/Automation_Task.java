package week1.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Task {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys(" testleaf.2023@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys(" Tuna@321");
		
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Find your account and log in.")).click();
		
		String driverTitle = driver.getTitle();
		
		System.out.println(driverTitle);
		
		String title = "Forgotten Password | Can't Log In | Facebook";
		
		if (title.equals(driverTitle)) {
			System.out.println("Title is same");
			
		} else {
			System.out.println("title is not same");

		}
		}
	}
