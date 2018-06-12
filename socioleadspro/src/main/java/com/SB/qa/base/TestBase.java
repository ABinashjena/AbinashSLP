package com.SB.qa.base;

import java.awt.Dimension;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.SLP.qa.util.TestUtil;



public class TestBase {
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() 
	{
		
		prop=new Properties();
		FileInputStream fs;
		try {
			fs = new FileInputStream("C:\\Users\\GLB-150\\git\\AbinashSLP\\socioleadspro\\src\\main\\java\\com\\SLP\\qa\\config\\config.properties");	
			prop.load(fs);
         } catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
	        }
	
	public static void initilization()
	{
		
		
		
		String browsename =prop.getProperty("browser");
		if(browsename.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
			driver=new ChromeDriver();
		
	                                  }
			
			else if(browsename.equals("Firefox")) {			
			System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
			driver=new FirefoxDriver();
			                      }
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			//driver.manage().timeouts().pageLoadTimeout(TestUtil.Page_load_timeout,TimeUnit.SECONDS);
			//driver.manage().timeouts().implicitlyWait(TestUtil.Implicitywait_timeout,TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
	
	public static void sendKeys(WebDriver driver,WebElement element,int timeout,String value)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
		element.sendKeys("");	
	}
	public static void clickOn(WebDriver driver,WebElement element,int timeout)
	{
		new WebDriverWait(driver,timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	
}










