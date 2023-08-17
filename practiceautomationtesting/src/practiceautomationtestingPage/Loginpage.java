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
	
		public static WebElement usernameL()
		{
			WebElement us=driver.findElement(usernameL);
			return us;
		}
		public static WebElement passwordL()
		{
			WebElement pass=driver.findElement(passwordL);
			return pass;
		}
		public static WebElement submitL()
		{
			WebElement sub=driver.findElement(submitL);
			return sub;
		}
	
		public static WebElement usernamL()
		{
			WebElement user=driver.findElement(usernamel);
			return user;
		}
		public static WebElement passL()
		{
			WebElement pas=driver.findElement(passwordl);
			return pas;
		}
		public static WebElement submit1()
		{
			WebElement subm=driver.findElement(submil);
			return subm;
		}
		
		public static WebElement usrenameText()
		{
			WebElement usert=driver.findElement(usernamel);
			return usert;
		}
		public static WebElement pasdd()
		{
			WebElement pasd=driver.findElement(passwordl);
			return pasd;
		}
		public static  WebElement submitbtnL()
		{
			WebElement sum=driver.findElement(submitl);
			return sum;
		}
		public static  WebElement practce()
		{
			WebElement pra=driver.findElement(practl);
			return pra;
		}
		public static  WebElement testE()
		{
			WebElement test=driver.findElement(testExecutionL);
			return test;
		}
		 
	public static void username() throws InterruptedException
	{
		Thread.sleep(2000);
	usernameL().sendKeys("fjgdfffd");
	Thread.sleep(2000);
	}

	public static void password() throws InterruptedException
	{
		passwordL().sendKeys("Password123 ");
	Thread.sleep(2000);
	}
	
	public static void Submitbutton()
	{
	submitL().click();
	}
	//
	public static void Usernametextbox() throws InterruptedException
	{	
	usernamL().sendKeys("student");
	Thread.sleep(2000);
	}
	
	public static void passwordtextbox() throws InterruptedException
	{
	passL().sendKeys("Password");
	Thread.sleep(2000);
	}
	
	public static void submitbtn()
	{
	submit1().click();
	}
	
	public static void enterusernametxtbos() throws InterruptedException
	{
	Thread.sleep(2000);
	usrenameText().sendKeys("student");
    Thread.sleep(2000);
	}
	public static void enterpasswordetxtbos() throws InterruptedException
	{
	
    pasdd().sendKeys("Password123");
    Thread.sleep(2000);
	}
   public static void submitBt() throws InterruptedException
   {
    submitbtnL().click();
    Thread.sleep(2000);
   }
   
   public static void clickonpracticeelement() throws InterruptedException
   {
    practce().click();
    
    Thread.sleep(2000);
   }
    public static void clickontestexecution()
    {
   
    testE().click();
	
    }
    
	

}
