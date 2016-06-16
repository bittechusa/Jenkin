import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationPOM 
{
	FirefoxDriver dr;
	BaseTest b;
	HomePage hp;
	ManPage mp;
	Women wm;
	@Before
	public void open()
	{
		System.out.println("browser start");
		dr=new FirefoxDriver();
	}
	@After
	public void close()
	{
		System.out.println("browser closed");
		b.end();
	}
	@Given("^I enter eshopper homepage$")
	public void i_enter_eshopper_homepage()  {
	   b=new BaseTest(dr);
		hp=b.start(); 
	}

	@When("^i click manLink$")
	public void i_click_manLink()  {
	   
	   mp=hp.clickMan();
	}

	@And("^i click product$")
	public void i_click_product() throws Exception  {
	   mp.clickManProduct(); 
	   //b.end();
	}
	@When("^i click WomenLink$")
	public void i_click_WomenLink()  {
	   wm=hp.clickWomen();
	}

	@When("^i click Womenproduct$")
	public void i_click_Womenproduct() {
	    wm.verifyWomen();
	   // b.end();
	}
	@Before("@only")
	public void onlyExecute()
	{
		System.out.println("only run before anotation tag");
	}
	@After("@only")
	public void onlyExecute1()
	{
		System.out.println("only run after anotation tag");
	}
	@When("^i click AcLink$")
	public void i_click_AcLink()  {
	   wm=hp.clickWomen();
	}

	



}
