package hyrtutorialWinds;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class wind extends Buses
{
	
		public static void windS() throws InterruptedException
		{
	String currentwind=driver.getWindowHandle();

	
	Set<String>allwind=driver.getWindowHandles();
	for (String allwi : allwind) 
	{
		if(!currentwind.equals(allwi))
		{
			driver.switchTo().window(allwi);
			By hotels=By.xpath("//div[@class='Nav-icons IRCTCHotels']");
			WebElement hos=driver.findElement(hotels);
			hos.click();
            Thread.sleep(3000);
		
			//driver.close();

		}

	}

	driver.switchTo().window(currentwind); 
	Thread.sleep(3000);
	
  

}

}