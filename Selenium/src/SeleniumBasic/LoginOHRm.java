package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginOHRm {

	public static void main(String[] args) throws InterruptedException {
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
		
	}

}
