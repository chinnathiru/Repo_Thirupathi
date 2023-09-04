package Test;



import pages.Baseclass;
import pages.dashboard;
import pages.loginpage;
import pages.validation;

public class logintest 
{
	public static void usernameAndpasswordblank() throws Exception
	{
		loginpage.lanchbrowser();
		loginpage.enterusername("");
		loginpage.enterpassword("");
		loginpage.clickloginbtn();
		String url=Baseclass.currentPageUrl();
		validation.urlequalornot(url, "abc");
		String title=Baseclass.currentTitle();
		validation.Titleequalornot(title, "jkdhfsdhgxj");
		validation.errormsgDisplayed();
		loginpage.closebroswer();
	}
	public static void usernamevalidandpasswordblank()
	{
		loginpage.lanchbrowser();
		loginpage.enterusername("Admin");
		loginpage.enterpassword("");
		loginpage.clickloginbtn();
		//loginpage.closebroswer();
	}
	public static void usernamenblankAndvalidpassword()
	{
		loginpage.lanchbrowser();
		loginpage.enterusername("");
		loginpage.enterpassword("admin123");
		loginpage.clickloginbtn();
		//loginpage.closebroswer();
	}
	public static void usernameInvaildkAndvalidpassword()
	{
		loginpage.lanchbrowser();
		loginpage.enterusername("gopu.thiru");
		loginpage.enterpassword("");
		loginpage.clickloginbtn();
		//loginpage.closebroswer();
	}
	public static void usernamevaildkAndInvalidpassword()
	{
		loginpage.lanchbrowser();
		loginpage.enterusername("Admin");
		loginpage.enterpassword("Adminnnn");
		loginpage.clickloginbtn();
		Baseclass.closebroswer();
		
	}
	public static void usernamevaildkAndvalidpasswordvalid()
	{
		loginpage.lanchbrowser();
		loginpage.enterusername("Admin");
		loginpage.enterpassword("admin123");
		loginpage.clickloginbtn();
		//loginpage.closebroswer();
		
		
	}
	
}
