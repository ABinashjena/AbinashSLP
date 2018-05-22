package com.SLP.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.SB.qa.base.TestBase;

public class ListOfFacebookKeywordspage extends TestBase {
	LoginPage loginpage;
	Dashboardpage dashboard;
	ListOfFacebookKeywordspage facebookKeywordpage;
	
	@FindBy(xpath="/html//div[@class='bg-color-light']/div[@class='container content-sm']//a[@href='/keywords/create']/button[@type='button']")
	WebElement AddFacebookkeyword;

	@FindAll(@FindBy(xpath="//div[@class='container content-sm']//table/tbody/tr"))
	List<WebElement> totalrow;
	
	public void Tabledata()
	{
		int rowcount =totalrow.size();
		System.out.println(rowcount);
		String first_part = "//div[@class='container content-sm']//table/tbody/tr[";
		String second_part = "]/td[1]";
		for (int i=1; i<rowcount; i++)
		{
			 String final_xpath=first_part+i+second_part;
			 String cellvalue = driver.findElement(By.xpath(final_xpath)).getText();
			 Assert.assertEquals(cellvalue,prop.getProperty("Keywordb"));
		}
		
		
		
	}
	
	
	public ListOfFacebookKeywordspage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Facebookkeywordpage()
	{
		dashboard.ClickonFacebookKeyword();
	}
	
	public Createfbkeywordpage AddFacebookkeywords()
	{
		AddFacebookkeyword.click();
		return new Createfbkeywordpage();
	}
	
	public String verifylistOfFacebookKeywordspage()
	{
		return driver.getCurrentUrl();

	}
	
	

}
