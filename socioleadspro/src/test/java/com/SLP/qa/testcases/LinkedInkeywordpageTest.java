package com.SLP.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SLP.qa.pages.Dashboardpage;
import com.SLP.qa.pages.LInkedinaccountPage;
import com.SLP.qa.pages.LinkedInkeywordpage;
import com.SLP.qa.pages.LoginPage;

public class LinkedInkeywordpageTest extends TestBase{

	LoginPage loginpage;
	Dashboardpage dashboard;
	LInkedinaccountPage linkedinaccountpage;
	LinkedInkeywordpage linkedInkeywordpage;
	
	
	public LinkedInkeywordpageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initilization();
		loginpage=new LoginPage();
		Thread.sleep(2000);
	    dashboard = loginpage.login(prop.getProperty("Emailid"), prop.getProperty("Password"));
	    Thread.sleep(10000);
	    linkedinaccountpage=new LInkedinaccountPage();
	    linkedinaccountpage =dashboard.Clickonlinkedinaccount();
	    linkedInkeywordpage=linkedinaccountpage.ClickonaddingLinkedinKeyword();
	   
	}
	
	
	
	@Test
	public void AddingLDkeywordTest() throws InterruptedException
	{
		linkedInkeywordpage.AddingLinkedinKeyword();
	}

	
	@AfterMethod
	public void tearDown()
	{
	 //driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
