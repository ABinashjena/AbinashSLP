package com.SLP.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Verify12345isinsearchfieldornot {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://poweradspy.com/");
//		driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("12345");
//		String xx = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).getAttribute("value");
//		System.out.println(xx);
//		Assert.assertEquals(xx, "12345");

		driver.findElement(By.xpath("//*[@id=\"menu-item-31\"]/a")).sendKeys(Keys.ENTER);
		
		
		
	}

}
