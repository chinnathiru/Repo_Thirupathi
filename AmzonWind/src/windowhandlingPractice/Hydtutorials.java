package windowhandlingPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hydtutorials
{
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	String currentwindow=driver.getWindowHandle();
	By clickopenNewWind=By.xpath("//button[@id='newWindowBtn']");
	WebElement clicknewW=driver.findElement(clickopenNewWind);
	clicknewW.click();
	Thread.sleep(2000);
	
	Set<String>hs=driver.getWindowHandles();
	for (String ele : hs) 
	{
		if(!currentwindow.equals(ele))
		{
			driver.switchTo().window(ele);
			System.out.println(driver.getTitle());
			driver.close();
		}
	}
	driver.switchTo().window(currentwindow);
	System.out.println(driver.getTitle());

}
}