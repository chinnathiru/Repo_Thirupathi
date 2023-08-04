package cyclospage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	static WebDriver driver;
	public static void  lanchbrowser() throws InterruptedException
	{
		 driver=new ChromeDriver();
		driver.get("https://demo.cyclos.org/ui/home");
		driver.manage().window().maximize();
		Thread.sleep(4000);
	}

}
