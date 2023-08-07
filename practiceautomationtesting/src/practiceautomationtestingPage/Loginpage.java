package practiceautomationtestingPage;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


public class Loginpage extends BaseClass
{
	
	// negative scenarios username invalid
		static By usernameL=By.xpath("//input[@name='username']");
		static By passwordL=By.xpath("//input[@id='password']");
		static By submitL=By.xpath("//button[@class='btn']");
		
	//	negative scenarios password invalid
		static By usernamel=By.xpath("//input[@name='username']");
		static By passwordl=By.xpath("//input[@id='password']");
		static By submil=By.xpath("//button[@class='btn']");
		
		// positive scenario 
	static	By usernameTxtl=By.xpath("//input[@name='username']");
	static  By passwordtxtl=By.xpath("//input[@id='password']");
	static  By submitl=By.xpath("//button[@class='btn']");
	static  By practl=By.xpath("//a[text()='Practice']");
	static  By testExecutionL=By.xpath("//a[text()='Test Exceptions']");
	
	//webElements 
	
		static WebElement username=driver.findElement(usernameL);
		static WebElement password=driver.findElement(passwordL);
		static WebElement submit=driver.findElement(submitL);
	
		static WebElement usernam=driver.findElement(usernamel);
		static WebElement pass=driver.findElement(passwordl);
		static WebElement submit1=driver.findElement(submil);
		
		static WebElement usrenameText=driver.findElement(usernamel);
		static WebElement pasdd=driver.findElement(passwordl);
		static  WebElement submitbtnL=driver.findElement(submitl);
		//static  WebElement practce=driver.findElement(practl);
		//static  WebElement testE=driver.findElement(testExecutionL);
		 
	public static void username() throws InterruptedException
	{
		Thread.sleep(2000);
	username.sendKeys("fjgdfffd");
	Thread.sleep(2000);
	}

	public static void password() throws InterruptedException
	{
	password.sendKeys("Password123 ");
	Thread.sleep(2000);
	}
	
	public static void Submitbutton()
	{
	submit.click();
	}
	//
	public static void Usernametextbox() throws InterruptedException
	{	
	usernam.sendKeys("student");
	Thread.sleep(2000);
	}
	
	public static void passwordtextbox() throws InterruptedException
	{
	pass.sendKeys("Password");
	Thread.sleep(2000);
	}
	
	public static void submitbtn()
	{
	submit1.click();
	}
	
	public static void enterusernametxtbos() throws InterruptedException
	{
	Thread.sleep(2000);
	usrenameText.sendKeys("student");
    Thread.sleep(2000);
	}
	public static void enterpasswordetxtbos() throws InterruptedException
	{
	
    pasdd.sendKeys("Password123");
    Thread.sleep(2000);
	}
   public static void submitBt() throws InterruptedException
   {
    submitbtnL.click();
    Thread.sleep(2000);
   }
   
//   public static void clickonpracticeelement() throws InterruptedException
//   {
//    practce.click();
//    
//    Thread.sleep(2000);
//   }
//    public static void clickontestexecution()
//    {
//   
//    testE.click();
//	
//    }
    
	

}
