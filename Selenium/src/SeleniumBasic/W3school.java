package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3school {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://profile.w3schools.com/log-in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
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
		Thread.sleep(6000);
//		driver.switchTo().frame("classic-menu");
//		Thread.sleep(2000);
//		By profileL=By.xpath("//a[@id='domains-link']");
//		WebElement profile=driver.findElement(profileL);
//		profile.click();
		
		
		

	}

}
