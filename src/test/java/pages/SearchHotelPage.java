package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelPage {

	WebDriver driver;

	public SearchHotelPage(WebDriver driver) {
		this.driver = driver;

	}
	// Locator for Location

	By loctn = By.id("location");

	// Locator for hotel
	By htl = By.id("hotels");

	// Locator for Room type

	By rm_type = By.id("room_type");

	// Locator for number of rooms

	By nor = By.id("room_nos");

	// Locator for checkin date
	By chkIn = By.id("datepick_in");

	// Locator for checkout date

	By chkOut = By.id("datepick_out");

	// Locator for Adults per room
	By adltPerRoom = By.id("adult_room");

	// Locator for child per room

	By childPerRoom = By.id("child_room");

	// Locator for Submit button

	By submitButton = By.id("Submit");

	// Locator for reset button

	By resetButton = By.id("Reset");

	// Methods of entering parameters
	public void enterValues(String location, String hotelName, String roomType, int numOfRoom, String dateIn,
			String dateOut, int adltPRoom, int chldPRoom) {

		// Drop down to select the location
		new Select(driver.findElement(loctn)).selectByValue(location);
		// Drop down to select the Hotel name
		new Select(driver.findElement(htl)).selectByValue(hotelName);
		// Drop down to select the room type
		new Select(driver.findElement(rm_type)).selectByValue(roomType);
		// Drop down to select the number of rooms
		new Select(driver.findElement(nor)).selectByIndex(numOfRoom);

		// clear and to select the date of check in
		driver.findElement(chkIn).clear();
		driver.findElement(chkIn).sendKeys(dateIn);
		// clear and to select the date of check out
		driver.findElement(chkOut).clear();
		driver.findElement(chkOut).sendKeys(dateOut);

		// Drop down to select number of adults in the room
		new Select(driver.findElement(adltPerRoom)).selectByIndex(adltPRoom);

		// Drop down to select number of children in the room
		new Select(driver.findElement(childPerRoom)).selectByIndex(chldPRoom);

		// driver.findElement(resetButton).click();
	}

	public void searchSubmitButton() {
		// Click on the submit button
		driver.findElement(submitButton).click();
	}

}
