package OrangeHRMProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass 
{
	static WebDriver driver;
	public static void lauchBroswer()
	{
		 driver =new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     	driver.manage().window().maximize();
	}

}
