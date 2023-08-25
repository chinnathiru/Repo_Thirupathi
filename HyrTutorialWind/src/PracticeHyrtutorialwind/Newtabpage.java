package PracticeHyrtutorialwind;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Newtabpage extends Baseclass

{
	
	public static void clickcontact() throws InterruptedException
	{
		String currentwind=driver.getWindowHandle();
		 System.out.println(driver.getTitle());
			Set<String>allwind=driver.getWindowHandles();
		
			for (String winel : allwind) 
			{
				if(!currentwind.equals(winel))
				{
				driver.switchTo().window(winel);
				System.out.println(driver.getTitle());
				 By clickcontact=By.xpath("(//a[text()='Contact'])[2]");
				 WebElement clickc=driver.findElement(clickcontact);
				 clickc.click();	
				 Thread.sleep(2000);
				}	
			}
			driver.switchTo().window(currentwind);
			System.out.println(driver.getTitle());
			
		
	}
}