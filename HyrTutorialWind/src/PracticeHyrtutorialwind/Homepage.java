package PracticeHyrtutorialwind;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homepage extends Baseclass
{
	static By clicknewtabntn=By.xpath("//button[@id='newTabBtn']");
	
	
	public static WebElement clicknewtab()
	{
		WebElement click=driver.findElement(clicknewtabntn);
		return click;
	}

	
	
	public static  void clicknewT()
	{
		clicknewtab().click();
	
	}
	
}
