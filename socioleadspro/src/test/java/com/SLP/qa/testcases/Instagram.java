package com.SLP.qa.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;

import com.SB.qa.base.TestBase;

public class Instagram extends TestBase {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
		 System.setProperty("webdriver.chrome.driver", "./Software/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.instagram.com/");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("username")).sendKeys("unpbved.de");
		 driver.findElement(By.name("password")).sendKeys("Avi!2345");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div[3]/button[2]")).click();
		 driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/button")).click();
		 driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/div/div")).click();
		 driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/input")).sendKeys("Abinash");
	 List<WebElement> totalsearch = driver.findElements(By.xpath("//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/div[2]/div[2]/div/a"));
	 
        for(int i=2;i<totalsearch.size();i++)
        {
	 String first="//*[@id=\"react-root\"]/section/nav/div[2]/div/div/div[2]/div[2]/div[2]/div/a[";
	 String second="]/div/div/div/span";
	 String final_xpath=first+i+second;
	 List<WebElement> Table_data = driver.findElements(By.xpath(final_xpath));
	 for (int p=0;p<Table_data.size();p++)
     {
		 List<String> Table_data_text= new ArrayList<String>();
  	   Table_data_text.add(Table_data.get(p).getText());
  	 System.out.print(Table_data_text +"\n " );
        }
	
        }
      driver.quit();
	}
}

	
