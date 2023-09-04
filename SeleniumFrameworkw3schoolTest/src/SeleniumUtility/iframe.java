package SeleniumUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.BaseClass;

public class iframe extends BaseClass
{
	static By framel=By.xpath("//iframe[@id='classic-menu']");
	
	
	
	public static WebElement frameL()
	{
		WebElement framew=driver.findElement(framel);
		driver.switchTo().frame(framew);
		return framew;
	}
	public static WebElement frameL1()
	{
		WebElement framew=driver.findElement(framel);
		driver.switchTo().frame(framew);
		return framew;
	}

}
