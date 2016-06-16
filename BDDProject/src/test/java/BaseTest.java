import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	FirefoxDriver dr;
	BaseTest(FirefoxDriver x)
	{
		dr=x;
	}
	public HomePage start()
	{
	
		dr.get("http://www.eshopper24.com");
		dr.manage().window().maximize();
		return new HomePage(dr);
	}
	public void end()
	{
		dr.quit();
	}

}
