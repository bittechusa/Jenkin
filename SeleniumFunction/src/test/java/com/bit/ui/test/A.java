package com.bit.ui.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class A 
{
	@Test
	public void test1()
	{
		add(17,19);
		add(56,67);
		login(By.xpath(".//*[@id='me-header']/div[1]/div/ul/li[2]/a/strong"));
		//login(By.xpath(".//*[@id='menu']/li[2]/a"));
	}
	FirefoxDriver dr=new FirefoxDriver();

	@Test
	public void test2() throws InterruptedException
	{
		dr.get("http://bittechusa.com");
		JavascriptExecutor s=(JavascriptExecutor)dr;
		//s.executeScript("arguments[0].click()", dr.findElement(By.xpath("")));
		//s.executeScript("arguments[0].value=''",, dr.findElement(By.xpath("")));
		//s.executeScript("return document.title");
		s.executeScript("window.scrollBy(500,1600)");
		Thread.sleep(5000);
		  
//		add(17,19);
//		add(56,67);
//		//login(By.xpath(".//*[@id='me-header']/div[1]/div/ul/li[2]/a/strong"));
//		login(By.xpath(".//*[@id='menu']/li[2]/a"));
//		dr.get("http://bittechusa.com/EMS/EMS-Login-Interface.aspx");
//		type(dr.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtUserName']")),"gdfhgs");
//		type(dr.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtPass']")),"112344h");
//		
//		clickElement(dr.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnLogin']")));
	}
	
	public void type(WebElement ele,String s)
	{
		ele.sendKeys(s);
	}
	
	public void add(int a, int b)
	{
		//int a=7;int b=9;
		System.out.println(a+b);
	}
	public void clickElement(WebElement ele1)
	
	{
		ele1.click();
		
	}
	
	public void login(By a)
	{
		
		dr.get("http://bittechusa.com/EMS/EMS-Login-Interface.aspx");
		//dr.findElement(a).click();
	}
	
	

}
