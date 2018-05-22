package com.SLP.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SB.qa.base.TestBase;

public class LInkedinaccountPage extends TestBase {
	
	
	
	@FindBy(xpath="/html//div[@class='bg-color-light']/div[@class='container content-sm']//button[@type='button']")
	WebElement adldacc;
	@FindBy(xpath="/html//input[@id='session_key-login']")
	WebElement ldemail;
	@FindBy(xpath="/html//input[@id='session_password-login']")
	WebElement ldpwd;
	@FindBy(xpath="/html//ul[@id='mini-profile--js']//input[@name='signin']")
	WebElement ldsignin;
	@FindBy(xpath="//span[@class=\"label label-sm label-danger label-mini\"]")
	WebElement deleteLDacc;
	@FindBy(xpath="//a[@href='../Keywords/LinkedInKeywordCreate']")
	WebElement addldkeyword;
	//---------------------------LeadsCount---------------------------------//
	@FindBy(xpath="//table//a[@href='../LinkedInKeywords']")
	WebElement View;
	
		@FindBy(xpath="//div/table/tbody/tr[2]/td[2]/a/span")
		WebElement leads;

	public LInkedinaccountPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public String Addlinkedaccount() throws InterruptedException
	{
		
		Thread.sleep(1000);
		adldacc.click();
		Thread.sleep(1000);
		ldemail.sendKeys(prop.getProperty("LDEmail"));
		ldpwd.sendKeys(prop.getProperty("LDpassword"));
		ldsignin.click();
        return driver.getTitle();
		
	}
	
	public void Deletinglinkedinacc() throws InterruptedException
	{
		deleteLDacc.click();
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(1000);
		//alert.accept();
		Alert alert1=driver.switchTo().alert();
		System.out.println(alert1.getText());
		alert1.accept();
	}
	
	
	public LinkedInkeywordpage ClickonaddingLinkedinKeyword()
	{
		addldkeyword.click();
		
		return new LinkedInkeywordpage();
	}
	
	public void Leadscount() throws InterruptedException
	{
		View.click();
		Thread.sleep(2000);
		String leadsno=leads.getText();
		String total=leadsno.replace("(Leads)","");
		System.out.println(total);
	}
	
	
	
	

}
