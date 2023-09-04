package Main;

import Test.DashboardTest;
import Test.logintest;

public class Testclass {

	public static void main(String[] args) throws Exception {
		logintest.usernameAndpasswordblank();
		logintest.usernamenblankAndvalidpassword();
		logintest.usernameInvaildkAndvalidpassword();
		logintest.usernamevalidandpasswordblank();
		logintest.usernamevaildkAndInvalidpassword();
		//logintest.usernamevaildkAndvalidpasswordvalid();
		DashboardTest.ClickPim();

	}

}
