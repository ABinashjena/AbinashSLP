package com.SLP.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SLP.qa.pages.Dashboardpage;
import com.SLP.qa.pages.LInkedinaccountPage;
import com.SLP.qa.pages.LoginPage;

public class LInkedinaccountPageTest extends TestBase{
	
	LoginPage loginpage;
	Dashboardpage dashboard;
	LInkedinaccountPage linkedinaccountpage;
	
	
	
	public LInkedinaccountPageTest()
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
	}
	
	
//	@Test(priority=1)
//	public void AddingLDaccountTest() throws InterruptedException
//	{
//		linkedinaccountpage.Addlinkedaccount();
//	}
//
//	@Test(priority=2)
//	public void DeletingLDaccountTest() throws InterruptedException
//	{
//		linkedinaccountpage.Deletinglinkedinacc();
//	}
	
	@Test()
public void LeadscountTest() throws InterruptedException
{
		linkedinaccountpage.Leadscount();
}
	
	@AfterMethod
	public void tearDown()
	{
	 driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
