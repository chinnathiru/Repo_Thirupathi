package windowhandlingPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWin {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		By searchboxl=By.xpath("//input[@id='twotabsearchtextbox']");
	    WebElement searchb=driver.findElement(searchboxl);
	    searchb.sendKeys("samsung s23 ultra 5g");
	    Thread.sleep(3000);
	    String parentwindow=driver.getWindowHandle();
	    By searchbx=By.xpath("//input[@id='nav-search-submit-button']");
	    WebElement serch=driver.findElement(searchbx);
	    serch.click();
	    
	    By samsunmbl=By.xpath("(//span[text()='Samsung Galaxy S23 Ultra 5G (Green, 12GB, 512GB Storage)'])[2]");
	    Thread.sleep(2000);
	    WebElement samsungb=driver.findElement(samsunmbl);
	    samsungb.click();
	    Set<String> hs=driver.getWindowHandles();
	    for (String opt : hs) 
	    {
	    	if(!parentwindow.equals(opt))
	    	{
	    		driver.switchTo().window(opt);
	    		 System.out.println(driver.getTitle());
	    		 driver.close();
	    		
	    	}
		}
	    driver.switchTo().window(parentwindow);
	    System.out.println(driver.getTitle());
	     

	}

}
