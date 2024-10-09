package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginsteps {
	WebDriver driver;
	
	By userName = By.name("username");
	By passw = By.name("password");

	
	public void enterUserName()
	{
		driver.findElement(userName);
	}

	public void enterPassword()
	{
		driver.findElement(passw);
	}


	public loginsteps(WebDriver driver) {
		super();
		this.driver = driver;
	}
}
