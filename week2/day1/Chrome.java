package week2.day1;

public class Chrome extends Browser {

	public void openIncognito() {

		System.out.println("Opening Icognito--->chrome");
	}
	
	public void clearCache() {

		System.out.println("clearing Cache---->chrome");
	}
	
	public static void main(String[] args) {
		
		Chrome c_browser = new Chrome();
		c_browser.openURL();
		c_browser.closeBrowser();
		c_browser.navigateBack();
		c_browser.openIncognito();
		c_browser.clearCache();
		
		System.out.println("Browser Name: "+ (c_browser.browserName = "Chrome"));
		System.out.println("Browser Version: "+ (c_browser.browserVersion = 97.1f));
		
		
		
	}
}
