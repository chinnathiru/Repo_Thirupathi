package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		By usernamel=By.xpath("//input[@name='username']");
		WebElement usrename=driver.findElement(usernamel);
		usrename.sendKeys("student");
	    Thread.sleep(2000);
	    By passwordl=By.xpath("//input[@id='password']");
	    WebElement pasdd=driver.findElement(passwordl);
	    pasdd.sendKeys("Password123");
	    Thread.sleep(2000);
	    By submitl=By.xpath("//button[@class='btn']");
	    WebElement submit=driver.findElement(submitl);
	    submit.click();
	    Thread.sleep(2000);
	    
	    By practl=By.xpath("//a[text()='Practice']");
	    WebElement practce=driver.findElement(practl);
	    practce.click();
	    
	    Thread.sleep(2000);
	    By testExecutionL=By.xpath("//a[text()='Test Exceptions']");
	    WebElement testE=driver.findElement(testExecutionL);
	    testE.click();
	    
	    
	    
		
		
	}

}
