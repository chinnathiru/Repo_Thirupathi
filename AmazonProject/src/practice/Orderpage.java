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
	
	
	
public static	WebElement order()
{
	WebElement ordr=driver.findElement(orderl);
	return ordr;
}
public static 	WebElement signin()
{
	WebElement sign=driver.findElement(signinl);
	return sign;
}
public static 	WebElement continuee()
{
	WebElement conti=driver.findElement(continuel);
	return conti;
}
public static	WebElement clickneedhepl()
{
	WebElement clickneed=driver.findElement(clickNeedHelpl);
	return clickneed;
}
public static	WebElement clickonotherissue()
{
	WebElement clickissue=driver.findElement(clickonotherissuel);
	return clickissue;
}
public static	WebElement yours()
{
	WebElement your=driver.findElement(yoursL);
	return your;
}
	
	public static void clickorder() throws InterruptedException
	{
	order().click();
	Thread.sleep(2000);
	}
	
	public static void singintextbox() throws InterruptedException
	{
	signin().sendKeys("hfdjghfsdjh@gmail.com");
	Thread.sleep(2000);
	}
	public static void continueebt() throws InterruptedException
	{	
	continuee().click();
	Thread.sleep(2000);
	}
	public static void clickneedhelpbtn() throws InterruptedException
	{
	clickneedhepl().click();
	Thread.sleep(2000);
	}
	public static void clickontherisseues() throws InterruptedException
	{
	clickonotherissue().click();
	Thread.sleep(2000);
	}
	public static void yourslink()
	{
	yours().click();
	}
}
