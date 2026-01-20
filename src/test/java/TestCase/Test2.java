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

public class Test2 {
	@BeforeMethod
	public void open() throws Exception {
		browser.openBrowser();
	}
	@DataProvider(name = "Test2")
	public Object[][] Data() throws Exception {
		Object[][] arrayObject = read.readExcel(1, 1, 3);
		return arrayObject;
	}
	@Test (dataProvider = "Test2")
	public void page1(String wait, String link, String verification) throws Exception {
		browser.navigate(wait);
		page1.click(link);
		capture.screenShot("Link Selection");
		boolean result = page2.url().endsWith(verification);
		AssertJUnit.assertTrue(result);
		Reporter.log("TestCase2 URL Assertion Pass");
	}

	@AfterMethod
	public void close() {
		browser.closeBrowser();
	}
}