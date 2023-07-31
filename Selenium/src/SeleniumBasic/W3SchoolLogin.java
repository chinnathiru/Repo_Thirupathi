package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SchoolLogin {

	public static void main(String[] args) throws InterruptedException
	{
		// negative scenario....
		WebDriver driver=new ChromeDriver();
		driver.get("https://profile.w3schools.com/log-in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		By usernamel=By.xpath("//input[@name='email']");
		WebElement username=driver.findElement(usernamel);
		username.sendKeys("hjfghfdsjghfd");
		Thread.sleep(2000);
		By passwordL=By.xpath(" //input[@name='current-password']");
		WebElement password=driver.findElement(passwordL);
		password.sendKeys("ksghkshgi");
		Thread.sleep(2000);
		By loginL=By.xpath("//span[text()='Log in']");
		WebElement login=driver.findElement(loginL);
		login.click();
		Thread.sleep(2000);
		
		// positive scenario...
		
		
		By usernamel1=By.xpath("//input[@name='email']");
		WebElement usernam=driver.findElement(usernamel1);
		usernam.clear();
		Thread.sleep(2000);
		usernam.sendKeys("gopu.thirupathi143@gmail.com");
		Thread.sleep(2000);
		By passwordL1=By.xpath(" //input[@name='current-password']");
		WebElement passwor=driver.findElement(passwordL1);
		passwor.clear();
		Thread.sleep(2000);
		passwor.sendKeys("Thiruramya@143");
		Thread.sleep(2000);
		By loginL1=By.xpath("//span[text()='Log in']");
		WebElement logi=driver.findElement(loginL1);
		logi.click();
		

	}

}
/*
 //input[@name='email']
  //input[@name='current-password']
   //span[text()='Log in']
 */
