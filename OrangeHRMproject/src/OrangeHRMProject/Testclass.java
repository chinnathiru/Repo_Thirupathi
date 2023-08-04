package OrangeHRMProject;



public class Testclass {

	public static void main(String[] args) throws InterruptedException  
	{

		LoginPage.lauchBroswer();
		Thread.sleep(2000);
		LoginPage.enterusername();
		Thread.sleep(2000);
		LoginPage.enterpassword();
		Thread.sleep(2000);
		LoginPage.clickloginbnt();
		//Thread.sleep(6000);
		PIMpage.PIMclick();
		Thread.sleep(2000);
		PIMpage.clickaAddemplyButton();
		Thread.sleep(2000);
		PIMpage.firstname();
		Thread.sleep(2000);
		PIMpage.middile();
		Thread.sleep(2000);
		PIMpage.lastname();
		Thread.sleep(4000);
		PIMpage.employeeid();
		Thread.sleep(3000);
		PIMpage.savebutton();
		Thread.sleep(2000);
		PIMpage.otherId();
		Thread.sleep(2000);
		PIMpage.DriverLicencebox();
		Thread.sleep(2000);
		PIMpage.savebtn();
		
		
	}
}