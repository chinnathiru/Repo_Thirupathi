package OrangeHRMProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PIMpage  extends Baseclass
{

	//static By PIMl=By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name' and text()='PIM']");
	static By PIMl=By.xpath("//span[text()='PIM']");
	
	static By clickAddemp=By.xpath("//a[text()='Add Employee']");
	static	By Employeefirstnl=By.xpath("//input[@name='firstName']");
	static  By MiddileNamel=By.xpath("//input[@name='middleName']");
	static	By LastNamel=By.xpath("//input[@name='lastName']");
	static	By empidl=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	static	By saveBtnl=By.xpath("//button[@type='submit']");
	static By otherIdl=By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
	static By DriveLicenceNL=By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
	static By savebtl=By.xpath("//button[text()=' Save ']");

public static WebElement pimpage()
{
	WebElement PIM =  driver.findElement(PIMl);
	return PIM;
}
public static WebElement clickaddemp()
{
		WebElement clickAdd=driver.findElement(clickAddemp);
		return clickAdd;
}
public static WebElement emplfirstname()
{
	  WebElement Employeefirstn=driver.findElement(Employeefirstnl);
	return Employeefirstn;
}
public static WebElement middilename()
{
	WebElement MiddileName=driver.findElement(MiddileNamel);
	return MiddileName;
}
public static WebElement lastnmae()	
{
	WebElement LastName=driver.findElement(LastNamel);
	return LastName;
}
public static WebElement emplId()
{
	WebElement empid=driver.findElement(empidl);
	return empid;
}
public static WebElement Savebtn()
{
	WebElement saveBtn=driver.findElement(saveBtnl);
	return saveBtn;
}
public static WebElement otherI()
{
	WebElement otherId=driver.findElement(otherIdl);
	return otherId;
}
public static WebElement driverlicence()
{
	WebElement DriveLicenceN=driver.findElement(DriveLicenceNL);
	return DriveLicenceN;
}
public static WebElement savebtnme()
{
	WebElement savebt=driver.findElement(savebtl);
	return savebt;
}

	public static void PIMclick() throws InterruptedException
	{
		
		//Thread.sleep(9000);
		pimpage().click();
		//Thread.sleep(4000);
	}

	public static void clickaAddemplyButton() throws InterruptedException
	{
		clickaddemp().click();
		//Thread.sleep(2000);
	}

	public static void firstname() throws InterruptedException
	{

		emplfirstname().sendKeys("thiru");
		//Thread.sleep(2000);
	}


	public static void middile() throws InterruptedException
	{
		middilename().sendKeys("chinna");
		//Thread.sleep(2000);
	}	

	public static void lastname() throws InterruptedException
	{

		lastnmae().sendKeys("Gopu");
		//Thread.sleep(2000);
	}

	public static void employeeid() throws InterruptedException
	{
		//emplId().click();
		emplId().clear();
		//Thread.sleep(3000);
		emplId().sendKeys("0023");

	}
	public static void savebutton() throws InterruptedException
	{
		Savebtn().click();

		//Thread.sleep(4000);
	}
	public static void otherId() throws InterruptedException
	{
		otherI().click();

		otherI().sendKeys("236000");
		//Thread.sleep(2000);
	}

	public static void DriverLicencebox() throws InterruptedException
	{
		driverlicence().sendKeys("DL021256");
		Thread.sleep(2000);
	}	
	public static void savebtn()
	{
		savebtnme().click();
	}


}
