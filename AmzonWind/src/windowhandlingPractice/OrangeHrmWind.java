package windowhandlingPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmWind 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		By usernamel=By.xpath("//input[@name='username']");
		WebElement usernam=driver.findElement(usernamel);
		usernam.sendKeys("Admin");
		Thread.sleep(2000);
		
		By passwordl=By.xpath("//input[@type='password']");
		WebElement pass=driver.findElement(passwordl);
		pass.sendKeys("admin123");
		Thread.sleep(2000);
		
		By LoginL=By.xpath("//button[@type='submit']");
		WebElement Login=driver.findElement(LoginL);
		Login.click();
		String currentwindow=driver.getWindowHandle();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
	
		By clickonOrangehrm=By.xpath("//a[text()='OrangeHRM, Inc']");
		WebElement clickonOrange=driver.findElement(clickonOrangehrm);
		clickonOrange.click();
		
		Set<String> allwindows=driver.getWindowHandles();
		for (String ele : allwindows)
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
