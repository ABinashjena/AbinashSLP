package com.SLP.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SB.qa.base.TestBase;

public class Createfbkeywordpage extends TestBase{
	
	LoginPage loginpage;
	Dashboardpage dashboard;
	ListOfFacebookKeywordspage facebookKeywordpage;
	
	@FindBy(xpath="//*[@id=\"CreateForm\"]/div[1]/label")
	WebElement pagename;
	@FindBy(xpath="/html//input[@id='Keyword']")
	WebElement Enterkeyword;
	@FindBy(xpath="/html//button[@id='js_right_All_1']")
	WebElement selectgrp;
	@FindBy(xpath="/html//div[@id='btnAddCredits']")
	WebElement submit;
	
	
	public Createfbkeywordpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean  verifiyCreatefbkeywordpage()
	{
	 boolean xx = pagename.isDisplayed();
		return xx;
	}
	
	public ListOfFacebookKeywordspage createkeyword()
	{
		Enterkeyword.sendKeys(prop.getProperty("Keywordb"));
		selectgrp.click();
		submit.click();
		return new ListOfFacebookKeywordspage();
	}
	

}
