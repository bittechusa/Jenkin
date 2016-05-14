package com.bit.ui.test;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SmokeTest
{
	FirefoxDriver dr;

	@BeforeTest
	public void m1()
	{
		String b=System.getProperty("browser");
		if(b.equals("f"))
		{
			dr=new FirefoxDriver();
		}
		else if(b.equals("c"))
		{
			dr=new FirefoxDriver();
		}
	}
	
	@Test
	public void alertHandle() throws InterruptedException
	{
		dr.get("file:///Users/bittech/Desktop/sa.html");
		dr.findElement(By.xpath("//input[@value='login']")).click();
		Thread.sleep(4000);
		Alert a=dr.switchTo().alert();
		a.accept();
		dr.findElement(By.xpath("//input[@value='login1']")).click();
		a.dismiss();
		dr.findElement(By.xpath("//input[@value='login2']")).click();
		a.sendKeys("dgfhjj");
		if(a.getText().equals("hi"))
		{
			a.accept();
		}
		else
			System.out.println("fail");
		
		
	}
	
	
	@Test
	public void iframeHandling()
	{
		dr.get("file:///Users/bittech/Desktop/sa.html");
		dr.switchTo().frame(0);
		dr.findElement(By.xpath("//a[@id='menubtn']")).click();
	    dr.switchTo().defaultContent();
		dr.findElement(By.xpath("//input[@type='text']")).sendKeys("hi");
	}
	
	@Test
	public void windowHandle() throws InterruptedException
	{
		dr.get("http://www.bittechusa.com");
		WebElement ele=dr.findElement(By.xpath(".//*[@id='menu']/li[3]/a"));
		String pwin=dr.getWindowHandle();
		Actions a=new Actions(dr);
		a.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		Thread.sleep(4000);
		Set<String> cwin=dr.getWindowHandles();
		for(String win:cwin)
		{
			if(!win.equals(pwin))
			{
				dr.switchTo().window(pwin);
				Thread.sleep(3000);
				dr.findElement(By.xpath(".//*[@id='menu']/li[5]/a")).click();
				System.out.println("clicked");
			}
		}
		
	}
	
	@Test
	public void screenshot() throws IOException
	{
		  dr.get("http://www.bittechusa.com");
		  File sf=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	      FileUtils.copyFile(sf, new File("/Users/bittech/Desktop/shot"+Math.random()*1000+".png"),true);
	        
	}
	 @Test
	    public void scrollDown() throws InterruptedException
	    {
	        FirefoxDriver dr=new FirefoxDriver();
	        dr.get("http://www.eshopper24.com");
	        dr.manage().window().maximize();
	        dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        WebElement ele=dr.findElement(By.xpath("html/body/div[4]/div[2]/div/section/div[16]/figure/a/img"));
	        Coordinates co=((Locatable)ele).getCoordinates();
	        co.inViewPort();
	        Thread.sleep(3000);
	    }
	
	@Test
	public void handleKeyboard() throws InterruptedException
	{
		dr.get("http://www.bittechusa.com");
		Thread.sleep(3000);
		    Keyboard kb=((HasInputDevices)dr).getKeyboard();
	        kb.sendKeys(Keys.chord(Keys.COMMAND,Keys.SHIFT,"p"));
	        Thread.sleep(5000);
	        kb.sendKeys(Keys.F5);
	}
	
	@AfterMethod
	public void end()
	{
		dr.quit();
	}

}
