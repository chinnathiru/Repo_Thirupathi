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
	static	WebElement register=driver.findElement(registerl);
	static	WebElement name=driver.findElement(namel);
	static	WebElement loginname=driver.findElement(loginnamel);
	static	WebElement email=driver.findElement(emaill);
	static	WebElement website=driver.findElement(websitel);
	static	WebElement gender=driver.findElement(genderl);
	static	WebElement nextbtn=driver.findElement(nextbtnl);
	static	WebElement password=driver.findElement(passwordl);
	static	WebElement cpassword=driver.findElement(cpasswordl);

	//Actions
	public static void clickOnregister() throws InterruptedException
	{
		register.click();
		Thread.sleep(4000);
	}

	public static void name() throws InterruptedException
	{
		name.click();
		Thread.sleep(6000);
		name.sendKeys("chinna");
		Thread.sleep(2000);
	}

	public static void loginname() throws InterruptedException
	{
		Thread.sleep(2000);
		loginname.sendKeys("thiruchinna");
		Thread.sleep(2000);
	}
	public static void email() throws InterruptedException
	{

		email.sendKeys("chinna@gmail.com");
		Thread.sleep(2000);
	}

	public static void website() throws InterruptedException
	{
		website.sendKeys("www.chinna.com");
		Thread.sleep(2000);
	}

	public static void gender() throws InterruptedException
	{
		gender.click();
		Thread.sleep(2000);
	}
	public static void nextbtn() throws InterruptedException
	{

		Thread.sleep(2000);
		nextbtn.click();
		Thread.sleep(3000);
	}

	public static void password() throws InterruptedException
	{
		Thread.sleep(3000);
		password.click();
		password.sendKeys("thiru@1234");
		Thread.sleep(3000);
	}

	public static void conformPassword() throws InterruptedException
	{
		Thread.sleep(3000);
		cpassword.click();
		cpassword.sendKeys("thiru@1234");
		Thread.sleep(3000);
	}
}
