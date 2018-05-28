package com.SLP.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoitcarresrpage {

	public static void main(String[] args) throws InterruptedException, IOException {

	
	    WebDriver driver;
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.socioboard.com/");
		driver.findElement(By.xpath("/html/body/div[2]/nav/div/ul[1]/li[6]/a/i")).click();
		driver.findElement(By.xpath("//*[@id=\"Help\"]/li[1]/a")).click();
		Thread.sleep(2000);
		WebElement xx = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
		driver.switchTo().frame(xx);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"zr-joblist-detail_85078000000393281\"]/td[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"zr-detail-view-applybtn\"]")).click();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"crmWebToEntityForm\"]/form[2]/div[1]/div[1]/input")).sendKeys("Abinash");
		 driver.findElement(By.xpath("//*[@id=\"crmWebToEntityForm\"]/form[2]/div[1]/div[2]/input")).sendKeys("Jena");
		 driver.findElement(By.xpath("//*[@id=\"crmWebToEntityForm\"]/form[2]/div[1]/div[3]/input")).sendKeys("Abinash@test.com");
		 driver.findElement(By.xpath("//*[@id=\"crmWebToEntityForm\"]/form[2]/div[1]/div[4]/input")).sendKeys("9097234518");
		 driver.findElement(By.xpath("//*[@id=\"crmWebToEntityForm\"]/form[2]/div[2]/div/textarea")).sendKeys("testing");
		 driver.findElement(By.xpath("//*[@id=\"crmWebToEntityForm\"]/form[2]/div[1]/div[4]/input")).sendKeys("9097234518");
		 driver.findElement(By.xpath("//*[@id=\"crmWebToEntityForm\"]/form[2]/div[2]/div/textarea")).sendKeys("testing");
		 driver.findElement(By.xpath("//*[@id=\"theFile_link(Attach resume)\"]")).click();
		 Thread.sleep(2000);
		 Runtime.getRuntime().exec("C:\\Users\\GLB-150\\Desktop\\test2.exe");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\"crmWebToEntityForm\"]/form[2]/div[4]/input[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//div[@id='thanksmessage']//a[@href='javascript:;']")).click();
		
		
		
		
		

	}

}
