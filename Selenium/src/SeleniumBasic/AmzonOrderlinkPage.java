package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzonOrderlinkPage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		By orderl=By.xpath("//a[@id='nav-orders']");
		WebElement order=driver.findElement(orderl);
		order.click();
		Thread.sleep(2000);
		By signinl=By.xpath("//input[@name='email']");
		WebElement signin=driver.findElement(signinl);
		signin.sendKeys("hfdjghfsdjh@gmail.com");
		Thread.sleep(2000);
		By continuel=By.xpath("//input[@id='continue']");
		WebElement continuee=driver.findElement(continuel);
		continuee.click();
	
//		String expectedmsg="There was a problem";
//		By errormsgl=By.xpath("//h4[text()='There was a problem']");
//		String Actuslerrormsg=driver.findElement(errormsgl).getText();
//		if(expectedmsg.equals(Actuslerrormsg))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
//
//	}

	}
}
/*
//a[@id='nav-orders']
 //input[@name='email']
  //h4[text()='There was a problem']
 */
