import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination
{
	FirefoxDriver dr=new FirefoxDriver();

	@Given("^User Navigate to LogIn Page$")
	public void user_Navigate_to_LogIn_Page()  {
	    dr.get("http://www.facebook.com");
	}

	@When("^User enters \"([^\"]*)\"$")
	public void user_enters(String arg1) throws Throwable {
	   dr.findElement(By.id("email")).sendKeys(arg1);
	   Thread.sleep(2000);
	}
	@And("^Users enter \"([^\"]*)\"$")
	public void users_enter(String arg1) throws Throwable {
	   dr.findElement(By.id("pass")).sendKeys(arg1);
	   Thread.sleep(2000);
	}


@Then("^Message displayed Login Successfully$")
public void message_displayed_Login_Successfully() {
   dr.quit(); 
}



}
