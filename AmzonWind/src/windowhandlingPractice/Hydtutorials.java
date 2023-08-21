package windowhandlingPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hydtutorials
{
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	String currentwindow=driver.getWindowHandle();
	By clickopenNewWind=By.xpath("//button[@id='newWindowBtn']");
	WebElement clicknewW=driver.findElement(clickopenNewWind);
	clicknewW.click();
	Thread.sleep(2000);
	
	Set<String>hs=driver.getWindowHandles();
	for (String ele : hs) 
	{
		if(!currentwindow.equals(ele))
		{
			driver.switchTo().window(ele);
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			By firstNamel=By.xpath("//input[@id='firstName']");
			WebElement firstname=driver.findElement(firstNamel);
			firstname.sendKeys("nani");
			Thread.sleep(2000);
			By lastNamel=By.xpath("//input[@id='lastName']");
			WebElement lastname=driver.findElement(lastNamel);
			lastname.sendKeys("chinna");
			Thread.sleep(2000);
			By radiobtnl=By.xpath("//input[@id='malerb']");
			WebElement radiobtn=driver.findElement(radiobtnl);
			radiobtn.click();
			Thread.sleep(2000);
			By checkboxl=By.xpath("//input[@id='malerb']");
			WebElement checkbox=driver.findElement(checkboxl);
			checkbox.click();
			Thread.sleep(2000);
			By radiobtnL=By.xpath("//input[@id='malerb']");
			WebElement radiobt=driver.findElement(radiobtnl);
			radiobt.click();
			Thread.sleep(2000);
			
			By clickhomebtnl=By.xpath("//a[text()='Click here to navigate to the home page']");
			WebElement clickhomebtn=driver.findElement(clickhomebtnl);
			clickhomebtn.click();
			Thread.sleep(2000);
			driver.close();
		}
	}
	driver.switchTo().window(currentwindow);
	System.out.println(driver.getTitle());
	
	

}
}
/*
 * //input[@id='firstName']
 * //input[@id='lastName']
 * //input[@id='malerb']
 * //input[@id='englishchbx']
 * //button[@id='registerbtn']
 * //a[text()='Click here to navigate to the home page']
 
*/