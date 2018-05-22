package com.SLP.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SB.qa.base.TestBase;

public class Dashboardpage extends TestBase{

	@FindBy(xpath="	///div[@innertext=' Facebook Profile']")
	WebElement pagename;
	//**************************Facebook account******************************************************************//
	@FindBy(xpath="//button[@class=\"btn btn-primary btn-xs pull-right\"]")
	WebElement adfbacc;
	@FindBy(xpath="	//*[@id=\"email\"]")
	WebElement fbemail;
	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement fbpwd;
	@FindBy(xpath="//*[@id=\"loginbutton\"]")
	WebElement loginbutton;
	@FindBy(xpath="//*[@id=\"grpdatainfo\"]/div[1]/span")
	WebElement firstgrp;
	@FindBy(xpath="//div[@id='SelectGroups']/div[@role='document']//button[@type='button']")
	WebElement submitgrp;
	@FindBy(xpath="//span[@class=\"label label-sm label-danger label-mini\"]")
	WebElement deletefbacc;
	//**************************Facebook account******************************************************************//
	@FindBy(xpath="//a[@href='../FacebookKeywords']")
	WebElement FacebookKeyword;
	
	
	
	//**************************LinkedIn account******************************************************************//
	@FindBy(xpath="//li/a[@href='../LDCredits']")
	WebElement linkedinaccpage;
	
	
	
	   //intilizating the page object
			public Dashboardpage()
			{
				PageFactory.initElements(driver,this);
			}
			
			public String verifydashboardPage()
			{
				return pagename.getText();
			}
			
			
			public String AddingFBaccount() throws InterruptedException
			{
				adfbacc.click();
				Thread.sleep(1000);
				fbemail.sendKeys(prop.getProperty("FBEmail"));
				fbpwd.sendKeys(prop.getProperty("FBpassword"));
				loginbutton.click();
				Thread.sleep(1000);
				firstgrp.click();
				submitgrp.click();
				return driver.getTitle();
			}
			public void Deletefacebookacc()
			{
				deletefbacc.click();
				Alert alert= driver.switchTo().alert();
				System.out.println(alert.getText());
				alert.accept();
			}
			public LInkedinaccountPage Clickonlinkedinaccount()
			{
				linkedinaccpage.click();
               return new LInkedinaccountPage();
				
			}
			
			public ListOfFacebookKeywordspage ClickonFacebookKeyword()
			{
				FacebookKeyword.click();
				return new ListOfFacebookKeywordspage();
			}
			
			
}
