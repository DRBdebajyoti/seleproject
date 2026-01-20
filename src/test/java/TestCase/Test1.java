package TestCase;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import Browser.browser;
import Excel.read;
import Pages.page1;
import ScreenShot.capture;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Test1{
	@BeforeMethod
	public void open() throws Exception
	{
		browser.openBrowser();
	}
	@DataProvider(name = "Test1")
	public Object[][] Data() throws Exception {
		Object[][] arrayObject = read.readExcel(0, 1, 2);
		return arrayObject;
	}
	@Test(dataProvider = "Test1")
	public void verification(String wait, String verification) throws Exception
	{
		browser.navigate(wait);
		capture.screenShot("Home Page");
		boolean result = page1.title().contains(verification);
		AssertJUnit.assertTrue(result);
		Reporter.log("TestCase1 Title Assertion Pass");
	}
	@AfterMethod
	public void close()
	{
		browser.closeBrowser();
	}
}