package practice1;

public class EdgeBrowser {
	
	String startbrowser (String browsername) {
		return browsername+ " Browser successfully launched";
	}
	
	void startUrl() {
		System.out.println("Url successfully loaded");
	}
	
	public static void main(String[] args) {
		
		EdgeBrowser e_browser = new EdgeBrowser();
		
		System.out.println(e_browser.startbrowser("Edge"));
		e_browser.startUrl();
		
		
		BrowserAssignment_Test c_browser = new BrowserAssignment_Test();
		
		System.out.println(c_browser.launchBrowser("Chrome"));
		c_browser.loadUrl();
	}

}
