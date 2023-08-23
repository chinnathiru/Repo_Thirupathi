package hyrtutorialWinds;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class Buses extends baseclass
{
	static By listproL=By.xpath("//a[text()=' BUSES ']");
	//static By hotels=By.xpath("//div[@class='Nav-icons IRCTCHotels']");
	
	
	public static WebElement listpro()
	{
		WebElement list=driver.findElement(listproL);
		return list;
	}
//	public static WebElement hotel()
//	{
//		WebElement li=driver.findElement(hotels);
//		return li;
//	}
	
//	public static Hotels clickHotlebtn()
//	{
//		WebElement clk=driver.findElement(listproL);
//		return new Hotels();
//		
//		
//	}
	public static void buses()
	{
		listpro().click();
	}
//	public static void hotelsM() throws InterruptedException
//	{
//		wind.windS();
//		
//	}
	
	

}
