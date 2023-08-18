package Practices;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class ProfilePage extends Baseclass
{
	
static By Profilel=By.xpath("//a[text()='Profile']");

public static WebElement profile()
{
	
	WebElement pro=driver.findElement(Profilel);
	return pro;
}

public static void clickprofile() throws InterruptedException
{
	driver.switchTo().frame("classic-menu");
	
     profile().click();
}	
	
	
}
