package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzonSite {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		By searchbxtL=By.xpath("//input[@id='twotabsearchtextbox']");
		WebElement searchbx=driver.findElement(searchbxtL);
		searchbx.sendKeys("samsung s23 ultra 5g");
		
		By searbtnl=By.xpath("//input[@id='nav-search-submit-button']");
		
		WebElement searchbtn=driver.findElement(searbtnl);
		searchbtn.click();
		Thread.sleep(5000);
		By sumsangMobilL=By.xpath("(//span[text()='Samsung Galaxy S23 Ultra 5G (Green, 12GB, 256GB Storage)'])[1]");
		Thread.sleep(6000);
		WebElement sumsangMobil=driver.findElement(sumsangMobilL);
		Thread.sleep(4000);
		sumsangMobil.click();
		//sumsangMobil.click();
		
//		Thread.sleep(8000);
//		By addcartL=By.xpath("//input[@title='Add to Shopping Cart']");
//		Thread.sleep(8000);
//		WebElement addcart=driver.findElement(addcartL);
//		Thread.sleep(4000);
//		addcart.click();
		
	
		

	}

}
/*
 * samsung s23 ultra 5g
 //input[@type='text']
  //input[@id='nav-search-submit-button']
 //span[text()='Account & Lists']
  *
  (//span[text()='Samsung Galaxy S23 Ultra 5G (Green, 12GB, 256GB Storage)'])[1]
 */
