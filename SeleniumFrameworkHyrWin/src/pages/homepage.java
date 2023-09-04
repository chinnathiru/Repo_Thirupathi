package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class homepage extends Baseclass
{
	
	static By newtabl=By.xpath("//button[@id='newTabBtn']");
	static By textboxl=By.xpath("//input[@id='name']");
	
    public static WebElement clicknewtabE()
    {
    	WebElement clickntb=driver.findElement(newtabl);
    	return clickntb;
    }
    public static WebElement textboxE()
    {
    	WebElement textbl=driver.findElement(textboxl);
    	return textbl;
    }
    public static void clicknewTab()
    {
    	clicknewtabE().click();
    }
    public static void textbox(String name)
    {
    	textboxE().click();
    	textboxE().sendKeys(name);
    }
    
	

}
