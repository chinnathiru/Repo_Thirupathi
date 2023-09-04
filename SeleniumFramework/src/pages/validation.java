package pages;


public class validation extends Baseclass
{
	public static void urlequalornot(String Exzpected,String actual) throws Exception
	{
		if(Exzpected.equals(actual))
		{
			System.out.println("the current url is ="+loginpage.driver.getCurrentUrl());
			System.out.println("the urls are same");
		}
		else
		{
			System.out.println("the current url is ="+loginpage.driver.getCurrentUrl());
			System.out.println("the urls are not same opr not matched");
		}
	}
	public static void errormsgDisplayed() throws Exception
	{
		if(loginpage.errormsg().isDisplayed())
		{
			System.out.println("the error text message is ="+loginpage.errormsg().getText());
			System.out.println("the erroe msg displayed");
		}
		else
		{
			System.out.println("the error text message is ="+loginpage.errormsg().getText());
			System.out.println("the erroe msg not displayed");
		}
	}

	public static void Titleequalornot(String Exzpected,String actual) throws Exception
	{
		if(Exzpected.equals(actual))
		{
			System.out.println("the title is ="+loginpage.driver.getTitle());
			System.out.println("the titles are same");
		}
		else
		{
			System.out.println("the title is ="+loginpage.driver.getTitle());
			System.out.println("the titles are not same or not matched");
		}
	}
	
}
