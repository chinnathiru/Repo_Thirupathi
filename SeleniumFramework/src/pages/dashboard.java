package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import SeleniumUtility.Baseclass;

public class dashboard extends Baseclass
{
static By PIMl=By.xpath("//span[text()='PIM']");
	
	static By clickAddemp=By.xpath("//a[text()='Add Employee']");
	
	
	
	//webelements..
	public static WebElement PimE()
	{
		WebElement pim=driver.findElement(PIMl);
		return pim;
	}
	public static WebElement clickaddempE()
	{
		WebElement add=driver.findElement(clickAddemp);
		return add;
	}
	public static void PiM()
	{
		PimE().click();
	}
	public static void addemploye()
	{
		clickaddempE().click();
	}

}
