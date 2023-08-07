package Practices;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class ProfilePage extends Baseclass
{
	
static By Profilel=By.xpath("//a[text()='Profile']");

static WebElement profile=driver.findElement(Profilel);

public static void clickprofile()
{
profile.click();
}	
	
	
}
