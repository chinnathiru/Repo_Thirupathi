package SeleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cyclospage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/home");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		By registerl=By.xpath("//div[text()=' Register ']");
		Thread.sleep(2000);
		WebElement register=driver.findElement(registerl);
		register.click();
		Thread.sleep(4000);
		
		By namel=By.xpath("//div[@class='flex-grow-1']//div//input[@id='id_1']");
		Thread.sleep(5000);
		WebElement name=driver.findElement(namel);
		name.click();
		Thread.sleep(6000);
		name.sendKeys("chinna");
		Thread.sleep(2000);
		
		By loginnamel=By.xpath("(//input[@class='form-control w-100 ng-untouched ng-pristine ng-invalid'])[1]");
		Thread.sleep(2000);
		WebElement loginname=driver.findElement(loginnamel);
		Thread.sleep(2000);
		loginname.sendKeys("thiruchinna");
		Thread.sleep(2000);
		By emaill=By.xpath("//div[@class='label-value-container']//div//input[@id='id_3']");
		Thread.sleep(4000);
		WebElement email=driver.findElement(emaill);
		email.sendKeys("chinna@gmail.com");
		Thread.sleep(2000);
		
		By websitel=By.xpath("//input[@name='website']");
		Thread.sleep(2000);
		WebElement website=driver.findElement(websitel);
		Thread.sleep(2000);
		website.sendKeys("www.chinna.com");
		Thread.sleep(2000);
		
		By genderl=By.xpath("//label[text()=' Male ']");
		Thread.sleep(2000);
		WebElement gender=driver.findElement(genderl);
		Thread.sleep(2000);
		gender.click();
		Thread.sleep(2000);
		By nextbtnl=By.xpath("//span[text()='Next']");
		Thread.sleep(2000);
		WebElement nextbtn=driver.findElement(nextbtnl);
		Thread.sleep(2000);
		nextbtn.click();
	    Thread.sleep(3000);
		By passwordl=By.xpath("//div[@class='label-value-container']//div//input[@id='id_7']");
		Thread.sleep(3000);
		WebElement password=driver.findElement(passwordl);
		Thread.sleep(3000);
		password.click();
		password.sendKeys("thiru@1234");
		Thread.sleep(3000);
		
		By cpasswordl=By.xpath("//div[@class='label-value-container']//div//input[@id='id_8']");
		Thread.sleep(3000);
		WebElement cpassword=driver.findElement(cpasswordl);
		Thread.sleep(3000);
		cpassword.click();
		cpassword.sendKeys("thiru@1234");
		Thread.sleep(3000);
//		By checkboxl=By.xpath("//input[@type='checkbox']");
//		Thread.sleep(3000);
//		WebElement checkbox=driver.findElement(checkboxl);
//		Thread.sleep(3000);
//		checkbox.click();
//		Thread.sleep(3000);
//		By submitl=By.xpath("//span[text()='Submit']");
//		Thread.sleep(3000);
//		WebElement submit=driver.findElement(submitl);
//		Thread.sleep(3000);
//		submit.click();

	}

}
