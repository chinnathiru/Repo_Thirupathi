package cyclospage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Registerpage extends BaseClass
{
//xpaths
	static By registerl=By.xpath("//div[text()=' Register ']");
	static By namel=By.xpath("//div[@class='flex-grow-1']//div//input[@id='id_1']");
	static By loginnamel=By.xpath("(//input[@class='form-control w-100 ng-untouched ng-pristine ng-invalid'])[1]");
	static By emaill=By.xpath("//div[@class='label-value-container']//div//input[@id='id_3']");
	static By websitel=By.xpath("//input[@name='website']");
	static By genderl=By.xpath("//label[text()=' Male ']");
	static By nextbtnl=By.xpath("//span[text()='Next']");
	static By passwordl=By.xpath("//div[@class='label-value-container']//div//input[@id='id_7']");
	static By cpasswordl=By.xpath("//div[@class='label-value-container']//div//input[@id='id_8']");


//webElements
	public static	WebElement register()
	{
	WebElement regi=driver.findElement(registerl);
	return regi;
	}
	public static	WebElement namel()
	{
		WebElement nam=driver.findElement(namel);
		return nam;
	}
	public static	WebElement loginnamel()
	{
		WebElement logi=driver.findElement(loginnamel);
		return logi;
	}
	public static	WebElement emailL()
	{
		WebElement ema=driver.findElement(emaill);
		return ema;
	}
	public static	WebElement websiteL()
	{
		WebElement web=driver.findElement(websitel);
		return web;
	}
	public static	WebElement genderL()
	{
		WebElement gne=driver.findElement(genderl);
		return gne;
	}
	public static	WebElement nextbtnL()
	{
		WebElement next=driver.findElement(nextbtnl);
		return next;
	}
	public static	WebElement passwordL()
	{
		WebElement pass=driver.findElement(passwordl);
		return pass;
	}
	public static	WebElement cpasswordL()
	{
		WebElement cpass=driver.findElement(cpasswordl);
		return cpass;
	
	}

	//Actions
	public static void clickOnregister() throws InterruptedException
	{
		register().click();
		Thread.sleep(4000);
	}

	public static void name() throws InterruptedException
	{
		namel().click();
		Thread.sleep(6000);
		namel().sendKeys("chinna");
		Thread.sleep(2000);
	}

	public static void loginname() throws InterruptedException
	{
		Thread.sleep(2000);
		loginnamel().sendKeys("thiruchinna");
		Thread.sleep(2000);
	}
	public static void email() throws InterruptedException
	{

		emailL().sendKeys("chinna@gmail.com");
		Thread.sleep(2000);
	}

	public static void website() throws InterruptedException
	{
		websiteL().sendKeys("www.chinna.com");
		Thread.sleep(2000);
	}

	public static void gender() throws InterruptedException
	{
		genderL().click();
		Thread.sleep(2000);
	}
	public static void nextbtn() throws InterruptedException
	{

		Thread.sleep(2000);
		nextbtnL().click();
		Thread.sleep(3000);
	}

	public static void password() throws InterruptedException
	{
		Thread.sleep(3000);
		passwordL().click();
		passwordL().sendKeys("thiru@1234");
		Thread.sleep(3000);
	}

	public static void conformPassword() throws InterruptedException
	{
		Thread.sleep(3000);
		cpasswordL().click();
		cpasswordL().sendKeys("thiru@1234");
		Thread.sleep(3000);
	}
}
