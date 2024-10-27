package week1.day1;

public class Browser {
	
	String launchBrowser(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
	}
	
	void loadUrl() {
		System.out.println("Application url loaded successfully");
	}

	public static void main(String[] args) {
		
		Browser run=new Browser();
		System.out.println(run.launchBrowser("chrome"));
		run.loadUrl();
	}

}

