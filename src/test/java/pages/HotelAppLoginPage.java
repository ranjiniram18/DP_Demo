package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HotelAppLoginPage {

	WebDriver driver;

	public HotelAppLoginPage(WebDriver driver) {
		this.driver = driver;

	}

//Locator for user name

	By usrnme = By.id("username");

//Locator for password
	By pswd = By.id("password");

//Locator for login button

	By login_buttn = By.id("login");

//Methods of entering user name
	public void enterUserName(String username) {
		driver.findElement(usrnme).sendKeys(username);

	}

//Methods of entering password
	public void enterPassword(String password) {
		driver.findElement(pswd).sendKeys(password);

	}

//Methods of clicking login button
	public void clickLoginButton() {
		driver.findElement(login_buttn).click();
	}
}