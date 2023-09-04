package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class profilepage extends BaseClass
{
	//static By framel=By.xpath("//iframe[@id='classic-menu']");
	static By Profilel=By.xpath("//a[@id='profile-link']");
	static By nicknamel=By.xpath("//div[text()='No Public @\"nickname\"']");
	static By nickNametextbox=By.xpath("(//input[@class='InputItem_item__Ebrl2'])[4]");
	static By w3scholL=By.xpath("//div[@id='dashboard-button']");

//
//	public static WebElement frameL()
//	{
//		WebElement framew=driver.findElement(framel);
//		driver.switchTo().frame(framew);
//		return framew;
//	}

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
	public static WebElement w3school()
	{
		WebElement w3scl=driver.findElement(w3scholL);
		return w3scl;
	}

	
	public static void clickprofil() throws InterruptedException
	{
		
	     profile().click();
	     //driver.switchTo().defaultContent();
	}	
	public static void nickName()
	{
		nickname().click();
		
	}
	public static void nickNametext(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		nicknameText().click();
		Thread.sleep(4000);
		nicknameText().sendKeys(name);
		Thread.sleep(2000);
		
	}
//	public static WebElement frameL1()
//	{
//		WebElement framew=driver.findElement(framel);
//		driver.switchTo().frame(framew);
//		return framew;
//	}
	public static void w3schl()
	{
		 w3school().click();
	}

}
