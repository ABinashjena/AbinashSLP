package com.SLP.qa.testcases;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingNoofLinkinhomepageTest extends Values {
	public static WebDriver driver;
	
	public static Values number()
	{
	
		Values obj=new Values();
		obj.a=10;
		obj.b=20;
		
		return obj;
	}
	
//	public void takescreenshot()
//	{
//		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File src = ts.getScreenshotAs(OutputType.FILE);
//	FileUtils.copyFile(src, dest);
//		
//			
//	}
	
	public static void main(String...args)
	{
		System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://poweradspy.com/");
		List<WebElement> link = driver.findElements(By.xpath("//a"));
		System.out.println(link.size());
		List<WebElement> link1 = driver.findElements(By.xpath("//img"));
		System.out.println(link1.size());
		
		Iterator<WebElement> img = link1.iterator();
		while(img.hasNext())
		{
			System.out.println(img.next());
		}
		
		
//		Values no = number();
//		System.out.println(no);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}


