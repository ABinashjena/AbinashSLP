package com.SLP.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

public class Assertclasstest {
    public  WebDriver driver;
	@Parameters({"url"})
	@Test
	public void link_verification(String url)
	{  
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
		SoftAssert s=new SoftAssert();
		driver.findElement(By.xpath("//*[@id=\"menu-item-29\"]/a")).click();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);	
		String url1 = driver.getCurrentUrl();
	    s.assertEquals(url1, "https://www.socioleadspro.com/Productt");
	    driver.findElement(By.xpath("//*[@id=\"menu-item-28\"]/a")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	
	    String url2 = driver.findElement(By.xpath("//*[@id=\"splendid-content\"]/section/div/div/h1")).getText();
	    s.assertEquals(url2, "Pricing");
	    s.assertAll();
		
		
		
		
		
		
		
	}
	
	

}
