package com.SLP.qa.testcases;

import java.util.ArrayList;
import java.util.List;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;

public class DropDown extends TestBase {

	
	@BeforeMethod
	public void SetUp()
	{
		initilization();
		
	}
	@Test
	public void DropdownTest()
	{
		driver.findElement(By.xpath("//button[.='PRICING']")).click();
		driver.findElement(By.xpath("//a[.='Contact Us']")).click();
		WebDriverWait wait=new WebDriverWait(driver,10);
		WebElement element = driver.findElement(By.xpath("/html//input[@id='f_name']"));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys("Testing");
		driver.findElement(By.xpath("//*[@id=\"b_email\"]")).sendKeys("test@test.com");
		driver.findElement(By.xpath("//*[@id=\"p_num\"]")).sendKeys("3759048392");
		WebElement element1 = driver.findElement(By.xpath("/html//select[@id='CountrySelect']"));
		Select select=new Select(element1);
		List<WebElement> allvalue = select.getOptions();
		for(WebElement text :allvalue)
		{
			String value = text.getText();
			System.out.println(value);
		}
		ArrayList<String> l1=new ArrayList<String>();
		
		


//			select.selectByVisibleText(value);

//		
//		select.selectByVisibleText("India");
//     	select.selectByValue("IN");
//		select.selectByIndex(1);
//		driver.findElement(By.xpath("//div[@id='pricing_custom_Modal']/div[@role='document']//div[@class='modal-footer']/button[@type='button']")).click();
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	

}
