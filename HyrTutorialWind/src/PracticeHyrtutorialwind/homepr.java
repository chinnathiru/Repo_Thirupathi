package PracticeHyrtutorialwind;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class homepr extends Baseclass
{
	static By textbox=By.xpath("//input[@id='name']");
	
	public static WebElement textboxe()
	{
		WebElement text=driver.findElement(textbox);
		return text;
	}
	public static void entertextbox()
	{
		textboxe().sendKeys("chinna");
	}

}
