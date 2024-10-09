package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginsteps {
	WebDriver driver;
	
	By userName = By.name("username");
	By passw = By.name("password");
	By loginButton = By.xpath("//button[@type='submit']");

	
	public void enterUserName()
	{
		driver.findElement(userName).sendKeys("Admin");;
	}

	public void enterPassword()
	{
		driver.findElement(passw).sendKeys("admin123");;
	}

	public void clickLogin() {
		driver.findElement(loginButton).click();
	}

	public loginsteps(WebDriver driver) {
		super();
		this.driver = driver;
	}
}
