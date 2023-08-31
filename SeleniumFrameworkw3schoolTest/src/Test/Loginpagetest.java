package Test;
import pages.loginpage;
import pages.profilepage;

public class Loginpagetest 
{
	public static void main(String[] args) throws InterruptedException {
		loginpage.lanchbrowser();
		loginpage.enterusername();
		loginpage.entrepassword();
		loginpage.clickloginbutton();
		profilepage.frameL();
		profilepage.clickprofile();
		profilepage.nickName();
		profilepage.nickNametext();
		profilepage.frameL1();
		profilepage.w3schl();
	}

}
