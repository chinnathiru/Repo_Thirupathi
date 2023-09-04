package Test;
import SeleniumUtility.iframe;
import pages.profilepage;

public class profilepagetest
{
	public static void clickprofile() throws InterruptedException
	{
		Loginpagetest.entervalidcreditional();
		iframe.frameL();
		profilepage.clickprofil();
		profilepage.nickName();
		profilepage.nickNametext("thiru chinna");
		iframe.frameL1();
		profilepage.w3schl();
	}

}
