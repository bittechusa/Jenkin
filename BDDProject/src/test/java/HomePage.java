import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage 
{
	FirefoxDriver dr;
	HomePage(FirefoxDriver x)
	{
		dr=x;
	}
	public ManPage clickMan()
	{
		dr.findElement(By.xpath("//a[@class='tr_delay_hover color_light tt_uppercase']")).click();
		return new ManPage(dr);
	}
	public Women clickWomen()
	{
		dr.findElement(By.xpath("//a[@class='tr_delay_hover color_light tt_uppercase']//b[text()='Women']")).click();
		return new Women(dr);
	}

}
