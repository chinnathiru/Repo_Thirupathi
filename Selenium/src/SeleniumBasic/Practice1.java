package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// negative scenarios username invalid
 		By usernameL=By.xpath("//input[@name='username']");
		WebElement username=driver.findElement(usernameL);
		username.sendKeys("fjgdfffd");
		Thread.sleep(2000);
		
		By passwordL=By.xpath("//input[@id='password']");
		WebElement password=driver.findElement(passwordL);
		password.sendKeys("Password123 ");
		Thread.sleep(2000);
		
		By submitL=By.xpath("//button[@class='btn']");
		WebElement submit=driver.findElement(submitL);
		submit.click();
		
		//negative scenarios password invalid
		
		By usernamel=By.xpath("//input[@name='username']");
		WebElement usernam=driver.findElement(usernamel);
		usernam.sendKeys("student");
		Thread.sleep(2000);
		
		By passwordl=By.xpath("//input[@id='password']");
		WebElement pass=driver.findElement(passwordl);
		pass.sendKeys("Password");
		Thread.sleep(2000);
		
		By submil=By.xpath("//button[@class='btn']");
		WebElement submit1=driver.findElement(submil);
		submit1.click();
		

	}

}
