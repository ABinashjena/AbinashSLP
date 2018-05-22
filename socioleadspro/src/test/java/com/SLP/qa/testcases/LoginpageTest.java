package com.SLP.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SLP.qa.pages.Dashboardpage;
import com.SLP.qa.pages.LoginPage;

public class LoginpageTest extends TestBase {
	
	LoginPage loginpage;
	Dashboardpage dashboard;
	public LoginpageTest()
	{
	super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initilization();
		loginpage=new LoginPage();
	}
	@Test(priority=1)
	public void logoTest()
	{
		loginpage.validateLoginpagetitle();
	}
	
	@Test(priority=2)
	public void loginTest() throws InterruptedException
	{
		dashboard=loginpage.login(prop.getProperty("Emailid"),prop.getProperty("Password"));
		Thread.sleep(10000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	

}
