package com.SLP.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;

import com.SLP.qa.pages.LoginPage;
import com.SLP.qa.pages.facebook_Account_Modulepage;

public class LoginpageTest extends TestBase {
	
	LoginPage loginpage;
	facebook_Account_Modulepage facebook_account_modulepage;
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
	@Test(enabled=false)
	public void logoTest() throws InterruptedException
	{
		String loginpagetitle = loginpage.validateLoginpagetitle();
		Assert.assertEquals(loginpagetitle, "Please login");
	}
	
	@Test(priority=2,invocationCount=5)
	public void loginTest() throws InterruptedException
	{
		facebook_account_modulepage=loginpage.login(prop.getProperty("Emailid"),prop.getProperty("Password"));

	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	

}
