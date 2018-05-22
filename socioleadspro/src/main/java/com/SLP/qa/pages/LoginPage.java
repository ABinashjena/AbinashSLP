package com.SLP.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SB.qa.base.TestBase;

public class LoginPage extends TestBase{


	@FindBy(xpath="	//a/img[@class='img-responsive']")
	WebElement logo;
	@FindBy(xpath="//li/a/button[@class=\"btn btn-warning btn-sm\"]")
	WebElement loginbutton;
	@FindBy(xpath="//div/input[@id=\"amember-login\"]")
	WebElement email;
	@FindBy(xpath="//div/input[@id=\"amember-pass\"]")
	WebElement password;
	@FindBy(xpath="//div/input[@value='Login']")
	WebElement submit;
	
	
	
	
	//intilizating the page object
		public LoginPage()
		{
			PageFactory.initElements(driver,this);
		}
		
		public boolean   validateSLPlogo()
		{
			return logo.isDisplayed();
		}
	public String validateLoginpagetitle()
	{
		return driver.getTitle();
	}
	
        public Dashboardpage login(String un,String pwd)
        {
        	loginbutton.click();
        	email.sendKeys(un);
        	password.sendKeys(pwd);
        	submit.click();
			return new Dashboardpage();
                }
	
	
	
	
	
	
}
