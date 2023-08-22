package windowhandlingPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String currentwind=driver.getWindowHandle();
		By listproL=By.xpath("//a[text()=' BUSES ']");
		WebElement listpro=driver.findElement(listproL);
		listpro.click();
		Thread.sleep(3000);
		
		Set<String>allwind=driver.getWindowHandles();
		for (String allwi : allwind) 
		{
			if(!currentwind.equals(allwi))
			{
				driver.switchTo().window(allwi);
				By hotels=By.xpath("//div[@class='Nav-icons IRCTCHotels']");
				
				Thread.sleep(2000);
				WebElement hotel=driver.findElement(hotels);
				hotel.click();
				
				Thread.sleep(3000);
				//driver.close();
				
			}
			
		}
		driver.switchTo().window(currentwind);   
		
		By hotels=By.xpath("//a[text()=' FLIGHTS ']");
		Thread.sleep(2000);
		WebElement hotel=driver.findElement(hotels);
		System.out.println(driver.getTitle());
		hotel.click();
		Thread.sleep(3000);
		
		By laterL=By.xpath("//button[text()='Later']");
		Set<String>w=driver.getWindowHandles();
		String[] str=w.toArray(new String[w.size()]);
		driver.switchTo().window(str[3]);
        Thread.sleep(8000);
		
		
		WebElement later=driver.findElement(laterL);
		later.click();
		
		Thread.sleep(4000);
		By login=By.xpath("//a[text()='Login']");
		Thread.sleep(4000);
		WebElement loginl=driver.findElement(login);
		loginl.click();
	
		
		
	}

}
