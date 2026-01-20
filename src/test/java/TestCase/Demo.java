package TestCase;

import Browser.browser;
import Pages.page1;
import Pages.page2;
import ScreenShot.capture;

class Demo {
	public static void main(String[] args) throws Exception {
		
		browser.openBrowser();
		browser.navigate("Rediff.com: News | Rediffmail | Stock Quotes | Rediff Gurus");	
		capture.screenShot("Home Page");
		if(page1.title().contains("Rediff.com"))
			 System.out.println("Title verification Pass"); 
		 else 
		     System.out.println("Title verification Fail");
		
		page1.click("Create Account");
		if(page2.url().endsWith("FormName=user_detail"))
			 System.out.println("URL verification Pass"); 
		 else 
		     System.out.println("URL verification Fail");
		
		page2.fullName("Venkatesh");
		page2.mailId("vivek7983");
		page2.checkAvailability();
		if(page2.message().equals("Yippie! The ID you've chosen is available."))
			 System.out.println("Id available Pass"); 
		 else 
		     System.out.println("Id available Fail");
		capture.screenShot("Message");
		browser.closeBrowser();
	}
}

