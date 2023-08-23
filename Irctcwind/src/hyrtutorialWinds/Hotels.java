package hyrtutorialWinds;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Hotels extends Buses
{
	static By hotels=By.xpath("//div[@class='Nav-icons IRCTCHotels']");
	
	public static WebElement hotel()
	{
		WebElement ho=driver.findElement(hotels);
		return ho;
	}
	
	public static void hotlesL()
	{
	hotel().click();
	}
}
