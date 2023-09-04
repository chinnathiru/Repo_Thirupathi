package SeleniumUtility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Baseclass;

public class windoh extends Baseclass
{
	
	public static void windohandl() throws InterruptedException
	{
		String currentwind=driver.getWindowHandle();
		System.out.println(driver.getTitle());
		Set<String>allwidow=driver.getWindowHandles();
		
		for (String ele : allwidow) 
		{
			if(!currentwind.equals(ele))
			{
				driver.switchTo().window(ele);
				System.out.println(driver.getTitle());
				Thread.sleep(4000);
				By clickmeL=By.xpath("//button[@id='alertBox']");
				WebElement click=driver.findElement(clickmeL);
				click.click();
				Alert alert=driver.switchTo().alert();
				alert.accept();
				
				//driver.close();
			}
			
		}
		driver.switchTo().window(currentwind);
		System.out.println(driver.getTitle());
		
	}
}
