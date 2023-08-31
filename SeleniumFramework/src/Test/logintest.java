package Test;

import pages.dashboard;
import pages.loginpage;

public class logintest 
{
	public static void main(String[] args) {
		loginpage.lanchbrowser();
		loginpage.enterusername();
//		loginpage.Explicitywait();
		loginpage.enterpassword();
		loginpage.clickloginbtn();
		dashboard.PiM();
		dashboard.addemploye();

	}
}
