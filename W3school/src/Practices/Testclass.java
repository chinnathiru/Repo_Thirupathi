package Practices;

public class Testclass {

	public static void main(String[] args) throws InterruptedException 
	{
		Loginpage.lanchbrwoser();
		Loginpage.enterusername();
		Loginpage.entrepassword();
		Loginpage.clickloginbutton();
		Thread.sleep(3000);
	    ProfilePage.frameL();
		ProfilePage.clickprofile();
		Thread.sleep(3000);
		ProfilePage.nickName();
		ProfilePage.nickNametext();
		Thread.sleep(3000);
		ProfilePage.frameL1();
		ProfilePage.w3schl();

	}

}
