package practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
	static WebDriver driver;
	
public static void launchbroswer() throws InterruptedException
{
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
}

}
