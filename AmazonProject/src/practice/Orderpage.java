package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Orderpage  extends BaseClass
{
	
	static By orderl=By.xpath("//a[@id='nav-orders']");
	static By signinl=By.xpath("//input[@name='email']");
	static By continuel=By.xpath("//input[@id='continue']");
	static By clickNeedHelpl=By.xpath("//span[@class='a-expander-prompt']");
	static By clickonotherissuel=By.xpath("//a[@id='ap-other-signin-issues-link']");
	static By yoursL=By.xpath("(//p[@class='a-size-small a-color-base'])[3]");
	
	
	
static	WebElement order=driver.findElement(orderl);
static 	WebElement signin=driver.findElement(signinl);
static 	WebElement continuee=driver.findElement(continuel);
static	WebElement clickneedhepl=driver.findElement(clickNeedHelpl);
static	WebElement clickonotherissue=driver.findElement(clickonotherissuel);
static	WebElement yours=driver.findElement(yoursL);
	
	public static void clickorder() throws InterruptedException
	{
	order.click();
	Thread.sleep(2000);
	}
	
	public static void singintextbox() throws InterruptedException
	{
	signin.sendKeys("hfdjghfsdjh@gmail.com");
	Thread.sleep(2000);
	}
	public static void continueebt() throws InterruptedException
	{	
	continuee.click();
	Thread.sleep(2000);
	}
	public static void clickneedhelpbtn() throws InterruptedException
	{
	clickneedhepl.click();
	Thread.sleep(2000);
	}
	public static void clickontherisseues() throws InterruptedException
	{
	clickonotherissue.click();
	Thread.sleep(2000);
	}
	public static void yourslink()
	{
	yours.click();
	}
}
