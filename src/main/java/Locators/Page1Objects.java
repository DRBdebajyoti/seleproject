package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Browser.browser;
public class Page1Objects extends browser {
	
 	static By logo = By.xpath("//div[@class='logo']");
	static By createAccount = By.tagName("a");
	
	public static WebElement logo()
	{
		WebElement element = driver.findElement(logo);
		return element;
	}
	
	/*
	 * Method to get element of create account Link and store it
	 */
	public static List<WebElement> link() {
		List <WebElement> element = driver.findElements(createAccount);
		return element;
	}
}