package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

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
		
		Thread.sleep(4000);
	
		 
		By PIMl=By.xpath("//span[text()='PIM']");
		WebElement PIM=driver.findElement(PIMl);
		PIM.click();
		Thread.sleep(2000);
		
//		By nextbtnl=By.xpath("//button[@class='oxd-pagination-page-item oxd-pagination-page-item--previous-next']");
//		Thread.sleep(4000);
//		
//		WebElement nextbn=driver.findElement(nextbtnl);
//		nextbn.click();
//		Thread.sleep(2000);
//		
//		//By selectcheckboxl=By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[1]");
//		By selectcheckboxl=By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[85]");
//		
//		Thread.sleep(5000);
//		WebElement checkbox=driver.findElement(selectcheckboxl);
//		Thread.sleep(4000);
//		checkbox.click();
		
		By selectcheckboxl=By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[45]");
		
		Thread.sleep(5000);
		WebElement checkbox=driver.findElement(selectcheckboxl);
		Thread.sleep(4000);
		checkbox.click();
		
		Thread.sleep(2000);
		By deletebtnl=By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']");
		Thread.sleep(2000);
		WebElement deletebtn=driver.findElement(deletebtnl);
		deletebtn.click();
		Thread.sleep(3000);
		By reportbntl=By.xpath("//a[text()='Reports']");
		WebElement report=driver.findElement(reportbntl);
		report.click();
		Thread.sleep(2000);
		By Empreporterl=By.xpath("//input[@placeholder='Type for hints...']");
		WebElement empreporter=driver.findElement(Empreporterl);
		empreporter.sendKeys("Employee Job Details");
		Thread.sleep(2000);
//		empreporter.sendKeys(Keys.ENTER);
		
		
		
		
	}

}
