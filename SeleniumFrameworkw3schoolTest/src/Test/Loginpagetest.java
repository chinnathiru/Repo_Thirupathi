package Test;

import org.openqa.selenium.WebDriver;

import pages.BaseClass;
import pages.Validation;
import pages.loginpage;


public class Loginpagetest 

{
	public static void usernameAndpasswordblank() throws InterruptedException
	{
		loginpage.lanchbrowser();
		loginpage.enterusername("");
		Thread.sleep(3000);
		loginpage.entrepassword("");
		Thread.sleep(2000);
		loginpage.clickloginbutton();
		Thread.sleep(2000);
		String url=BaseClass.Getcurrenturl();
		Validation.UrlsEqualOrNot(url, "https://profile");
		Validation.errormsgDisplay();
		loginpage.closebrowser();
	}
	
	public static void invalidvalidcreditional() throws InterruptedException
	{
		loginpage.lanchbrowser();
		loginpage.enterusername("Admin");
		Thread.sleep(3000);
		loginpage.entrepassword("admin");
		Thread.sleep(2000);
		loginpage.clickloginbutton();
		Thread.sleep(2000);
	}
	public static void validuserAndInvalidpassword() throws InterruptedException
	{
		loginpage.lanchbrowser();
		loginpage.enterusername("gopu.thirupathi@143.com");
		Thread.sleep(3000);
		loginpage.entrepassword("admin");
		Thread.sleep(2000);
		loginpage.clickloginbutton();
		Thread.sleep(2000);
	}
	public static void InvaliduserAndvalidpassword() throws InterruptedException
	{
		loginpage.lanchbrowser();
		loginpage.enterusername("gopu.thirupathi");
		Thread.sleep(3000);
		loginpage.entrepassword("Thiruramya@143");
		Thread.sleep(2000);
		loginpage.clickloginbutton();
		Thread.sleep(2000);
	}
	
	public static void validuserAndvalidpassword() throws InterruptedException
	{
		loginpage.lanchbrowser();
		loginpage.enterusername("gopu.thirupathi");
		Thread.sleep(3000);
		loginpage.entrepassword("Thiruramya@143");
		Thread.sleep(2000);
		loginpage.clickloginbutton();
		Thread.sleep(2000);
	}
	
	
	
	public static void entervalidcreditional() throws InterruptedException
	{
		loginpage.lanchbrowser();
		loginpage.enterusername("gopu.thirupathi143@gmail.com");
		loginpage.entrepassword("Thiruramya@143");
		loginpage.clickloginbutton();
	}
	
	

	
	
	
}

