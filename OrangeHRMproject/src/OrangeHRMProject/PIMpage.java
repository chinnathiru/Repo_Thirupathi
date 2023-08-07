package OrangeHRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PIMpage  extends Baseclass
{

	static By PIMl=By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='PIM']");
	static By clickAddemp=By.xpath("//a[text()='Add Employee']");
	static	By Employeefirstnl=By.xpath("//input[@name='firstName']");
	static  By MiddileNamel=By.xpath("//input[@name='middleName']");
	static	By LastNamel=By.xpath("//input[@name='lastName']");
	static	By empidl=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	static	By saveBtnl=By.xpath("//button[@type='submit']");
	static By otherIdl=By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
	static By DriveLicenceNL=By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
	static By savebtl=By.xpath("//button[text()=' Save ']");

	static	WebElement PIM=driver.findElement(PIMl);
	static	WebElement clickAdd=driver.findElement(clickAddemp);
	static  WebElement Employeefirstn=driver.findElement(Employeefirstnl);
	static  WebElement MiddileName=driver.findElement(MiddileNamel);
	static   WebElement LastName=driver.findElement(LastNamel);
	static   WebElement empid=driver.findElement(empidl);
	static   WebElement saveBtn=driver.findElement(saveBtnl);
	static    WebElement otherId=driver.findElement(otherIdl);
	static    WebElement DriveLicenceN=driver.findElement(DriveLicenceNL);
	static WebElement savebt=driver.findElement(savebtl);

	public static void PIMclick() throws InterruptedException
	{
		PIM.click();
		Thread.sleep(4000);
	}

	public static void clickaAddemplyButton() throws InterruptedException
	{
		clickAdd.click();
		//Thread.sleep(2000);
	}

	public static void firstname() throws InterruptedException
	{

		Employeefirstn.sendKeys("thiru");
		//Thread.sleep(2000);
	}


	public static void middile() throws InterruptedException
	{
		MiddileName.sendKeys("chinna");
		//Thread.sleep(2000);
	}	

	public static void lastname() throws InterruptedException
	{

		LastName.sendKeys("Gopu");
		//Thread.sleep(2000);
	}

	public static void employeeid() throws InterruptedException
	{
		empid.click();
		empid.clear();
		//Thread.sleep(3000);
		empid.sendKeys("0023");

	}
	public static void savebutton() throws InterruptedException
	{
		saveBtn.click();

		//Thread.sleep(4000);
	}
	public static void otherId() throws InterruptedException
	{
		otherId.click();

		otherId.sendKeys("236000");
		//Thread.sleep(2000);
	}

	public static void DriverLicencebox() throws InterruptedException
	{
		DriveLicenceN.sendKeys("DL021256");
		Thread.sleep(2000);
	}	
	public static void savebtn()
	{
		savebt.click();
	}


}
