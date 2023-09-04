package pages;

public class Validation extends BaseClass
{
	public static void UrlsEqualOrNot(String expectedurl,String Actualurl)
	{
		if(expectedurl.equals(Actualurl))
		{
			System.out.println(loginpage.driver.getCurrentUrl());
			System.out.println("test case is pass");
		}
		else
		{
			System.out.println(loginpage.driver.getCurrentUrl());
			System.out.println("test case is fail");
		}
	}
	public static void errormsgDisplay()
	{
		if(loginpage.errormsg().isDisplayed())
		{
			System.out.println(loginpage.errormsg().getText());
			System.out.println("the error message is matched");
		}
		else
		{
			System.out.println(loginpage.errormsg().getText());
			System.out.println("the error message is not matched");
		}
	}

}
