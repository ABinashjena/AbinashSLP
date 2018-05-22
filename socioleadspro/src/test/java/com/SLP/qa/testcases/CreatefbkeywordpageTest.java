package com.SLP.qa.testcases;

import static org.testng.Assert.assertEquals;
//test repo

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SLP.qa.pages.Createfbkeywordpage;
import com.SLP.qa.pages.Dashboardpage;
import com.SLP.qa.pages.ListOfFacebookKeywordspage;
import com.SLP.qa.pages.LoginPage;

public class CreatefbkeywordpageTest extends TestBase {

	LoginPage loginpage;
	Dashboardpage dashboard;
	ListOfFacebookKeywordspage listOfFacebookKeywordspage;
	Createfbkeywordpage createfbkeywordpage;
	
	public CreatefbkeywordpageTest()
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
	    listOfFacebookKeywordspage=dashboard.ClickonFacebookKeyword();
	    createfbkeywordpage=listOfFacebookKeywordspage.AddFacebookkeywords();
	    Thread.sleep(10000);
	}
	
	
//	@Test(dependsOnMethods= {"createkeywordTest"})
//	public void verifiyCreatefbkeywordpageTest()
//	{
//		String actual = listOfFacebookKeywordspage.verifylistOfFacebookKeywordspage();
//		Assert.assertEquals(actual , "https://www.socioleadspro.com/FacebookKeywords");
//		
//	}
	@Test(priority=1)
	public void createkeywordTest()
	{
		createfbkeywordpage.createkeyword();
	}
	
	
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
