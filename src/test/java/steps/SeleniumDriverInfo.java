package steps;

import org.openqa.selenium.WebDriver;

public class SeleniumDriverInfo {

	
	WebDriver driver;

	public SeleniumDriverInfo() {
		super();
	}

	public SeleniumDriverInfo(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void openApp() {
//		System.setProperty("webdriver.chrome.driver","‪C:\\Users\\Dell\\Downloads\\chromedriver.exe");
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}
}
