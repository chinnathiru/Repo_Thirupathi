package SeleniumBasic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hyr 
{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.manage().window().maximize();
		
		By Addtxtbox=By.xpath("//button[text()='Add Textbox1']");
		WebElement Addtxtboxl=driver.findElement(Addtxtbox);
		Addtxtboxl.click();
		
		By textbox=By.xpath("(//input[@id='txt1'])[1]");
		WebElement textboxl=driver.findElement(textbox);
		textboxl.sendKeys("rfdfhdf");
		
		By Addtxtbox2=By.xpath("//button[text()='Add Textbox2']");
		WebElement Addtxtboxl2=driver.findElement(Addtxtbox2);
		Addtxtboxl2.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		By textbox2=By.xpath("(//input[@id='txt1'])[1]");
		WebElement textboxl2=driver.findElement(textbox2);
		textboxl2.sendKeys("ghgfhfgh");
		
	}
}
