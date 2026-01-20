package TestCase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import Browser.browser;
import Pages.page1;
import Pages.page2;
import Excel.read;
import ScreenShot.capture;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.Reporter;

public class Test3{
	@BeforeMethod
	public void open() throws Exception {
		browser.openBrowser();
	}
	@DataProvider(name = "Test3")
	public Object[][] Data() throws Exception {
		Object[][] arrayObject = read.readExcel(2, 1, 5);
		return arrayObject;
	}
	@Test (dataProvider = "Test3")
	public void page2(String wait, String link, String fullName, String email, String verification) throws Exception {
		browser.navigate(wait);
		page1.click(link);
		page2.fullName(fullName);
		page2.mailId(email);
		page2.checkAvailability();
		capture.screenShot("Message");
		AssertJUnit.assertEquals(page2.message(), verification);
		Reporter.log("TestCase2 Text Assertion Pass");
	}

	@AfterMethod
	public void close() {
		browser.closeBrowser();
	}
}