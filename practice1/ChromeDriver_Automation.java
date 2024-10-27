package practice1;

// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ChromeDriver_Automation {

	public static void main(String[] args) {

		// ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.testleaf.com/");
		
		String driverTitle = driver.getTitle();
		System.out.println(driverTitle);
		
		driver.manage().window().maximize();
		
		driver.close();
	}

}
