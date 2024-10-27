package practice1;

public class BrowserAssignment_Test {
	
	String launchBrowser(String browsername) {
		return browsername+" browser launched successfully";

	}

	void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
	
	public static void main(String[] args) {
		
		BrowserAssignment_Test driver = new BrowserAssignment_Test();
		
		System.out.println(driver.launchBrowser("Chrome"));
		driver.loadUrl();
		
		
	}
}
