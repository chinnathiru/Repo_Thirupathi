package Main;

import Test.Loginpagetest;
import Test.profilepagetest;
import pages.loginpage;

public class Testclass
{
	public static void main(String[] args) throws InterruptedException {
		Loginpagetest.usernameAndpasswordblank();
		Loginpagetest.validuserAndInvalidpassword();
    	Loginpagetest.InvaliduserAndvalidpassword();
    	Loginpagetest.invalidvalidcreditional();
		
		//Loginpagetest.entervalidcreditional();
	
		  profilepagetest.clickprofile();
	}

}
