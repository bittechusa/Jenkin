package jenkin;

import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ATest {
	
	@Test
	public void m1()
	{
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("http://www.facebook.com");
	}

}
