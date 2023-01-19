package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HotelAppLoginPage;
import pages.SearchHotelPage;

public class Login_HotelApp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Driver\\Selenium_New\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();

		// Login in the hotel app adactin page
		HotelAppLoginPage halp = new HotelAppLoginPage(driver);
		halp.enterUserName("RanjiniRam");
		halp.enterPassword("anup@123");
		halp.clickLoginButton();

		SearchHotelPage sap = new SearchHotelPage(driver);
		sap.enterValues("Sydney", "Hotel Creek", "Standard", 1, "12/01/2023", "13/01/2023", 1, 2);
		sap.searchSubmitButton();
	}

}
