package com.SLP.qa.testcases;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;

public class Multiwindow extends TestBase {

	
	@BeforeMethod
	public void SetUp()
	{
		initilization();
		
	}
	@Test
	public void MultiwindowTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[1]/a/i")).click();
		ArrayList<String> al=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(al.get(1));
		String fburl = driver.getCurrentUrl();
		Assert.assertEquals(fburl, "https://www.facebook.com/socioleadspro");
		Thread.sleep(2000);
		driver.switchTo().window(al.get(0));
		String slpurl = driver.getCurrentUrl();
		Assert.assertEquals(slpurl, "https://www.socioleadspro.com/");
		driver.findElement(By.xpath("//div[@id='bs-example-navbar-collapse-1']/ul[@class='nav navbar-nav pull-right']//button[.='LOG IN']")).click();
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
}
