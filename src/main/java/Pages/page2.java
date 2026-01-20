package Pages;

import Locators.Page2Objects;
import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import Browser.browser;

public class page2 extends browser {

	public static String url() {
		wait.until(ExpectedConditions.visibilityOf(Page2Objects.fullNameTextbox()));
		return driver.getCurrentUrl();
	}

	public static void fullName(String data) {
		try {
			wait.until(ExpectedConditions.visibilityOf(Page2Objects.fullNameTextbox()));
			Page2Objects.fullNameTextbox().sendKeys(data);
		} catch (Exception e) {
			System.out.println("Page2 - Full Name" + e);
		}
	}

	public static void mailId(String data) {
		try {
			wait.until(ExpectedConditions.visibilityOf(Page2Objects.mailIdTextbox()));
			Page2Objects.mailIdTextbox().sendKeys(data);
		} catch (Exception e) {
			System.out.println("Page2 - Mail Id" + e);
		}
	}

	public static void checkAvailability() {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(Page2Objects.checkAvailabilityButton()));
			Page2Objects.checkAvailabilityButton().click();
		} catch (Exception e) {
			System.out.println("Page2 - CheckAvailability" + e);
		}
	}

	public static String message() {
		String msg = null;
		try {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(30))
					.pollingEvery(Duration.ofSeconds(3))
					.ignoring(NoSuchElementException.class);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("success")));
			msg = Page2Objects.checkAvailabilitymessage().getText();
			System.out.println(msg);
			} catch (Exception e) {
			System.out.println("Page2 - Mail Id" + e);
		}
		return msg;
	}
}