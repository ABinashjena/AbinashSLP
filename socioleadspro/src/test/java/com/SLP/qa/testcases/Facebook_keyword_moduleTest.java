package com.SLP.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SLP.qa.pages.Facebook_keyword_modulepage;
import com.SLP.qa.pages.Landingpage;
import com.SLP.qa.pages.LoginPage;
import com.SLP.qa.pages.facebook_Account_Modulepage;

public class Facebook_keyword_moduleTest extends TestBase{
	
	Landingpage landingpage;
	LoginPage loginPage;
	facebook_Account_Modulepage facebookAccountModulepage;
	Facebook_keyword_modulepage Facebookkeywordmodule;
	public Facebook_keyword_moduleTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initilization();
		loginPage=new LoginPage();
		loginPage.login(prop.getProperty("Emailid"), prop.getProperty("Password"));
		facebookAccountModulepage = new facebook_Account_Modulepage();
		
		Facebookkeywordmodule= new Facebook_keyword_modulepage();
		Facebookkeywordmodule=facebookAccountModulepage.ClickonViewButton();
	}
	@Test
	public void  Verify_Facebook_keyword_module_page_nameTest() throws InterruptedException
	{
		Thread.sleep(1000);
	boolean name = Facebookkeywordmodule.Verify_Facebook_keyword_module_page_name();
		Assert.assertEquals(name, true);
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
