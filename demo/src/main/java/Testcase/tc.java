package Testcase;

import org.testng.annotations.Test;

import Base.Driversetup;
import page.locator;

public class tc extends locator {

	
	String baseUrl ="https://rahulshettyacademy.com/locatorspractice/";
	
	@Test 
	public void learning () throws InterruptedException
	{
		driver.get (baseUrl);

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//oprate element 
		tc locator = new tc ();
		locator.clickname ();
		locator.clickpass();
		locator.clickcheck();
		locator.clickbtn();
		Thread.sleep(2000);
		
		
		locator.clickfp();
		Thread.sleep(2000);
		locator.clickusername();
		Thread.sleep(2000);
		locator.clickemail ();
		Thread.sleep(2000);
		locator.clickphn();
		Thread.sleep(2000);
		
		locator. clickresetlogin ();
		Thread.sleep(2000);
		
		
		locator.clickgo();
		Thread.sleep(2000);
		locator.clickname2();
		Thread.sleep(2000);
		locator.clickpass2();
		Thread.sleep(2000);
		locator.clickbtn1();
		Thread.sleep(2000);
		locator.clicklog();
		Thread.sleep(2000);
		
		
		
		
	}
	
	
}
