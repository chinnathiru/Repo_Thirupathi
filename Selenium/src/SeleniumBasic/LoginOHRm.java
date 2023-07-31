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
		
		Thread.sleep(4000);
		//after logining click admin element
//		By applyLeave=By.xpath("//span[text()='Admin']");
//		WebElement applyL=driver.findElement(applyLeave);
//		applyL.click();
//		Thread.sleep(2000);
		 
		By PIMl=By.xpath("//span[text()='PIM']");
		WebElement PIM=driver.findElement(PIMl);
		PIM.click();
		Thread.sleep(2000);
		
		By clickAddemp=By.xpath("//a[text()='Add Employee']");
		WebElement clickAdd=driver.findElement(clickAddemp);
		clickAdd.click();
		Thread.sleep(2000);
		
		By Employeefirstnl=By.xpath("//input[@name='firstName']");
		WebElement Employeefirstn=driver.findElement(Employeefirstnl);
		Employeefirstn.sendKeys("thiru");
		Thread.sleep(2000);
		

		By MiddileNamel=By.xpath("//input[@name='middleName']");
		WebElement MiddileName=driver.findElement(MiddileNamel);
		MiddileName.sendKeys("chinna");
		Thread.sleep(2000);
		
		By LastNamel=By.xpath("//input[@name='lastName']");
		WebElement LastName=driver.findElement(LastNamel);
		LastName.sendKeys("Gopu");
		Thread.sleep(2000);
		
		By empidl=By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
		//By empidl=By.xpath("//label[text()='Employee Id']//ancestor::div[@class='oxd-input-group oxd-input-field-bottom-space']/child::div[2]/input");
		WebElement empid=driver.findElement(empidl);
		empid.click();
     	//empid.click();
		Thread.sleep(3000);	
		//var c=empid.isSelected();
		empid.clear();
		Thread.sleep(3000);
		empid.sendKeys("0023");
	   Thread.sleep(2000);
		By saveBtnl=By.xpath("//button[@type='submit']");
		WebElement saveBtn=driver.findElement(saveBtnl);
		saveBtn.click();
		
		Thread.sleep(4000);
		
		By otherIdl=By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]");
		WebElement otherId=driver.findElement(otherIdl);
		otherId.click();
		Thread.sleep(2000);
		otherId.sendKeys("236000");
		Thread.sleep(2000);
		//By DriveLicenceNL=By.xpath("//label[text()='Driver License Number']");
		By DriveLicenceNL=By.xpath("(//input[@class='oxd-input oxd-input--active'])[5]");
		WebElement DriveLicenceN=driver.findElement(DriveLicenceNL);
		DriveLicenceN.sendKeys("DL021256");
		Thread.sleep(2000);
		
		
		

		
		
		
		/*
		 //a[text()='Add Employee']
		 //input[@name='firstName']
		 //input[@name='middleName']
		 
		 //input[@name='lastName']
		  (//input[@class='oxd-input oxd-input--active'])[2]
		  //button[@type='submit']
		   //button[text()=' Cancel ']
		   
		    
		    //div[@class='orangehrm-horizontal-padding orangehrm-vertical-padding']//button[text()=' Save ']
		 */
		
		
	}

}
