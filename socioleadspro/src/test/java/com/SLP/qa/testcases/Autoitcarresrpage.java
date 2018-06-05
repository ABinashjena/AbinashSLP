package com.SLP.qa.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.SLP.qa.util.TestUtil;
import com.beust.jcommander.Parameter;

public class Autoitcarresrpage {
	WebDriver driver;
	@Parameters({"browser","url"})
	@AfterMethod
	public void setUP(String browser,String url) throws InterruptedException
	{
		  if(browser.equals("chrome")) {
		    	
				System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
				driver=new ChromeDriver();
			    }else if(browser.equals("Firefox"))
			    {
			    	System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
					driver=new FirefoxDriver();
			    }
			    
			    
				driver.manage().window().maximize();
				driver.get(url);
				
				
				  
				driver.findElement(By.xpath("/html/body/div[2]/nav/div/ul[1]/li[6]/a/i")).click();
				driver.findElement(By.xpath("//*[@id=\"Help\"]/li[1]/a")).click();
				driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
				WebElement xx = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
				driver.switchTo().frame(xx);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"zr-joblist-detail_85078000000393281\"]/td[1]/a")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"zr-detail-view-applybtn\"]")).click();
				Thread.sleep(2000);
	}
	
	@DataProvider
	public Iterator<Object[]> getData()
	{
		ArrayList<Object[]> testdata = TestUtil.getDatafromExcel();
		return testdata.iterator();
	
	}
	@Test(dataProvider="getData")
	public void Autoitscript(String First_Name,String Last_Name,String Email,String Phone,String Skill_Set) throws InterruptedException, IOException
	{
	
		 driver.findElement(By.xpath("//*[@id=\"crmWebToEntityForm\"]/form[2]/div[1]/div[1]/input")).sendKeys(First_Name);
		 driver.findElement(By.xpath("//*[@id=\"crmWebToEntityForm\"]/form[2]/div[1]/div[2]/input")).sendKeys(Last_Name);
		 driver.findElement(By.xpath("//*[@id=\"crmWebToEntityForm\"]/form[2]/div[1]/div[3]/input")).sendKeys(Email);
		 driver.findElement(By.xpath("//*[@id=\"crmWebToEntityForm\"]/form[2]/div[1]/div[4]/input")).sendKeys(Phone);
		 driver.findElement(By.xpath("//*[@id=\"crmWebToEntityForm\"]/form[2]/div[2]/div/textarea")).sendKeys(Skill_Set);
//		 driver.findElement(By.xpath("//*[@id=\"crmWebToEntityForm\"]/form[2]/div[1]/div[4]/input")).sendKeys("9097234518");
//		 driver.findElement(By.xpath("//*[@id=\"crmWebToEntityForm\"]/form[2]/div[2]/div/textarea")).sendKeys("testing");
		 driver.findElement(By.xpath("//*[@id=\"theFile_link(Attach resume)\"]")).click();
		 Thread.sleep(2000);
	     Runtime.getRuntime().exec("C:\\Users\\GLB-150\\Desktop\\test2.exe");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"crmWebToEntityForm\"]/form[2]/div[4]/input[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='thanksmessage']//a[@href='javascript:;']")).click();	

	}
@BeforeMethod
public void tearDown()
{
	//driver.quit();
}
}
