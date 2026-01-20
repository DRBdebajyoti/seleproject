package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Browser.browser;

public class Page2Objects extends browser {
	static By fullName = By.xpath("//input[@placeholder='Enter your full name']");
	static By mailId = By.xpath("//input[@placeholder='Enter Rediffmail ID']");
	static By checkAvailability = By.xpath("//input[@value='Check availability']");
	static By message = By.xpath("//input[@value='Check availability']/ancestor-or-self::*//span[@class='success']");
//input[@value='Check availability']/ancestor-or-self::*//div[@id='check_availability']
	
	
	public static WebElement fullNameTextbox() {
		WebElement element = driver.findElement(fullName);
		return element;
	}

	public static WebElement mailIdTextbox() {
		WebElement element = driver.findElement(mailId);
		return element;
	}

	public static WebElement checkAvailabilityButton() {
		WebElement element = driver.findElement(checkAvailability);
		return element;
	}

	public static WebElement checkAvailabilitymessage() {
		WebElement element = driver.findElement(message);
		return element;
	}
}