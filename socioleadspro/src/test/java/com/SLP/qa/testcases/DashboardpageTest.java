package com.SLP.qa.testcases;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SLP.qa.pages.Dashboardpage;
import com.SLP.qa.pages.LoginPage;

public class DashboardpageTest extends TestBase {
	
	LoginPage loginpage;
	Dashboardpage dashboard;
	
	public DashboardpageTest()
	{
		super();
	}

	// Browser server service
//	ChromeDriverService services;
//	WebDriver driver;
//	
//	 @BeforeClass 
//	 public void startServer() throws IOException { 
//		 // Setting up server 
//		 services = new ChromeDriverService.Builder().usingDriverExecutable(new File("./Software/chromedriver.exe")).usingAnyFreePort().build(); 
//		 services.start(); 
//		 } 
//	 @AfterClass
//	 public void stopServices()
//	 {  // Killing server  
//		 services.stop(); 
//	 }
	
	
	
	
	
	
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		//driver = new RemoteWebDriver(services.getUrl(), new ChromeOptions());
		initilization();
		loginpage=new LoginPage();
		Thread.sleep(2000);
	    dashboard = loginpage.login(prop.getProperty("Emailid"), prop.getProperty("Password"));
		
	    Thread.sleep(10000);
	}
	
	@Test(priority=1)
	public void AddingFBaccountTest() throws InterruptedException
	{
		dashboard.AddingFBaccount();
	}
	@Test(priority=2)
	public void DeletingFBaccountTest() throws InterruptedException
	{
		dashboard.Deletefacebookacc();
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}
	
}
