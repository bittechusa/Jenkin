import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ManPage 
{
	FirefoxDriver dr;
	ManPage(FirefoxDriver x)
	{
		dr=x;
	}
	public ProductDetail clickManProduct() throws Exception
	{
		Thread.sleep(2000);
		dr.findElement(By.xpath("//a[text()='Analog']")).click();
		return new ProductDetail();
	}

}
