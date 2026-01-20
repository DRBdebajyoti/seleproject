package Pages;

import Browser.browser;
import Locators.Page1Objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class page1 extends browser {

	public static String title() {
		return driver.getTitle();
	}

	/*
	 * Invoking method to get element of create account link
	 */
	public static void click(String text) {
		try {
			wait.until(ExpectedConditions.visibilityOf(Page1Objects.logo()));
			List<WebElement> element = Page1Objects.link();
			for (int i = 0; i <= element.size(); i++) {
				if (element.get(i).getText().equalsIgnoreCase(text)) {
					element.get(i).click();
					break;
				}
			}
		} catch (Exception e) {
			System.out.println("Page1 - Create Account Link");
		}
	}
}