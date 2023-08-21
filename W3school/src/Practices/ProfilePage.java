package Practices;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class ProfilePage extends Baseclass
{
	//static By framel=By.xpath("/html/body/div[1]/div/iframe");
	
static By framel=By.xpath("//iframe[@id='classic-menu']");
static By Profilel=By.xpath("//a[text()='Profile']");
static By nicknamel=By.xpath("//div[text()='No Public @\"nickname\"']");
static By nickNametextbox=By.xpath("(//input[@class='InputItem_item__Ebrl2'])[4]");


public static WebElement frameL()
{
	WebElement framew=driver.findElement(framel);
	driver.switchTo().frame(framew);
	return framew;
}

public static WebElement profile() 
{
	
	WebElement pro=driver.findElement(Profilel);
	return pro;
}
public static WebElement nickname()
{
	WebElement nic=driver.findElement(nicknamel);
	return nic;
}
public static WebElement nicknameText()
{
	WebElement ni=driver.findElement(nickNametextbox);
	return ni;
}

public static void clickprofile() throws InterruptedException
{
	
     profile().click();
     driver.switchTo().defaultContent();
}	
public static void nickName()
{
	nickname().click();
	
}
public static void nickNametext()
{
	nicknameText().sendKeys("https://www.w3profile.com/");
	
}
	
	
}
