package com.SLP.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.SB.qa.base.TestBase;

public class Pricingpage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"pricing\"]/div/div[1]/div[1]/h2")
	WebElement Pricingpagetitle;
	@FindBy(xpath="//body[@class='am-page-signup am-page-signup-default']/div[1]/div[@class='am-body']//h1[.='Signup Form']")
	WebElement signupformpage;
	
	@FindBy(xpath="//*[@id=\"pricing\"]/div/div[1]/div[2]/div/div[1]")
	WebElement free;
	@FindBy(xpath="//*[@id=\"pricing\"]/div/div[1]/div[2]/div/div[3]/div/button")
	WebElement freetrynow;
	
	@FindBy(xpath="//*[@id=\"pricing\"]/div/div[1]/div[3]/div/div[1]")
	WebElement basic;
	@FindBy(xpath="//*[@id=\"pricing\"]/div/div[1]/div[3]/div/div[3]/div/button")
	WebElement basictrynow;
	
	@FindBy(xpath="//*[@id=\"pricing\"]/div/div[1]/div[4]/div/div[1]")
	WebElement standard;
	@FindBy(xpath="//*[@id=\"pricing\"]/div/div[1]/div[4]/div/div[3]/div/button")
	WebElement standardtrynow;
	
	@FindBy(xpath="//*[@id=\"pricing\"]/div/div[2]/div[1]/div/div[1]")
	WebElement premium;
	@FindBy(xpath="//*[@id=\"pricing\"]/div/div[2]/div[1]/div/div[3]/div/button")
	WebElement premiumtrynow;
	
	@FindBy(xpath="//*[@id=\"pricing\"]/div/div[2]/div[2]/div/div[1]")
	WebElement business;
	@FindBy(xpath="//*[@id=\"pricing\"]/div/div[2]/div[2]/div/div[3]/div/button")
	WebElement businesstrynow;
	
	@FindBy(xpath="//*[@id=\"pricing\"]/div/div[2]/div[3]/div/div[1]")
	WebElement enterprise;
	@FindBy(xpath="//*[@id=\"pricing\"]/div/div[2]/div[3]/div/div[3]/div/span/a")
	WebElement enterpriseContactUs;
	//********************************Contact Us popup*************************************//
	@FindBy(xpath="//*[@id=\"myModalLabel\"]/b")
	WebElement popuptitle;
	@FindBy(xpath="//*[@id=\"f_name\"]")
	WebElement FullName;
	@FindBy(xpath="//*[@id=\"b_email\"]")
	WebElement BusinessEmail;
	@FindBy(name="CountrySelect")
	WebElement country;
	@FindBy(xpath="//*[@id=\"p_num\"]")
	WebElement cphoneno;
	@FindBy(xpath="//*[@id=\"pricing_custom_Modal\"]/div/div/div[3]/button")
	WebElement submit;
	@FindBy(xpath="//*[@id=\"toast-container\"]/div/div")
	WebElement sucessfullpoup;
	@FindBy(xpath="//*[@id=\"toast-container\"]/div/div")
	WebElement warningpoup;
	
	
	
	
	//********************************************SignupForm*********************************************************//
	@FindBy(xpath="//*[@id=\"product-2-2\"]")
	WebElement basicPlanradiobuton;
	@FindBy(xpath="//div/input[@id='name_f-0']")
	WebElement firstname;
	@FindBy(xpath="//div/input[@id='name_l-0']")
	WebElement lastname;
	@FindBy(xpath="//*[@id=\"email-0\"]")
	WebElement email_id;
	@FindBy(xpath="//*[@id=\"login-0\"]")
	WebElement username;
	@FindBy(xpath="//*[@id=\"pass-0\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"pass-confirm\"]")
	WebElement confirm_password;
	@FindBy(xpath="//*[@id=\"_qf_page-0_next-0\"]")
	WebElement next;
	
	
	public Pricingpage()
	{
		PageFactory.initElements(driver,this);
	}
	public String  verifyPricingpagetitle()
	{
		return Pricingpagetitle.getText();
	}
	public List<String> verifyAllplan()
	{
		
		List<String> l1= new ArrayList<String>();
		String Free = free.getText();
		String Basic = basic.getText();
		String Standard = standard.getText();
		String Premium = premium.getText();
		String Business = business.getText();
		String Enterprise = enterprise.getText();
		l1.add(Free);
		l1.add(Basic);
		l1.add(Standard);
		l1.add(Premium);
		l1.add(Business);
		l1.add(Enterprise);
		return l1;	
	}
	
	public String ClickonBasicpalntrynow() throws InterruptedException
	{
		basictrynow.click();
		Thread.sleep(2000);
		return signupformpage.getText();
		
	}
	
	public String ClickonStandardpalntrynow() throws InterruptedException
	{
		standardtrynow.click();
		Thread.sleep(2000);
		return signupformpage.getText();
		
	}
	public String ClickonPremiumpalntrynow() throws InterruptedException
	{
		premiumtrynow.click();
		Thread.sleep(2000);
		return signupformpage.getText();
		
	}
	
	public String ClickonBusinesspalntrynow() throws InterruptedException
	{
		businesstrynow.click();
		Thread.sleep(2000);
		return signupformpage.getText();
		
	}
	public String ClickonFreepalntrynow() throws InterruptedException
	{
	      freetrynow.click();
		 Thread.sleep(2000);
		 return signupformpage.getText();
		
	}
	
	public void FillSignupForm() throws InterruptedException
	{
		basictrynow.click();
		Thread.sleep(2000);
		basicPlanradiobuton.click();
		firstname.sendKeys(prop.getProperty("First_Name"));
		lastname.sendKeys(prop.getProperty("Last_Name"));
		email_id.sendKeys(prop.getProperty("E_Mail"));
		username.sendKeys(prop.getProperty("Username"));
		password.sendKeys(prop.getProperty("slp_Password"));
		confirm_password.sendKeys(prop.getProperty("slp_Password"));
		next.click();
		
	}

	public Landingpage FreepalnFillSignupForm() throws InterruptedException
	{
		freetrynow.click();
		Thread.sleep(2000);
		firstname.sendKeys(prop.getProperty("First_Name"));
		lastname.sendKeys(prop.getProperty("Last_Name"));
		email_id.sendKeys(prop.getProperty("E_Mail"));
		username.sendKeys(prop.getProperty("Username"));
		password.sendKeys(prop.getProperty("slp_Password"));
		confirm_password.sendKeys(prop.getProperty("slp_Password"));
		next.click();
		return new Landingpage();
		
	
	}
	
	public  boolean ClickonenterpriseplanContactUs() throws InterruptedException
	{
		enterpriseContactUs.click();
		Thread.sleep(2000);
		String text = popuptitle.getText();
		String text1="Contact Us";
		return text.equals(text1);
	}
	
	public String FillContactUspopup() throws InterruptedException
	{
		enterpriseContactUs.click();
		Thread.sleep(2000);
		FullName.sendKeys(prop.getProperty("First_Name"));
		BusinessEmail.sendKeys(prop.getProperty("E_Mail"));
		cphoneno.sendKeys(prop.getProperty("phoneno"));
		Select select=new Select(country);
		select.selectByVisibleText("India");
		//select.deselectByValue("IN");
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(500);
		return sucessfullpoup.getText();
	}
	public String FillContactUspopupwrongly() throws InterruptedException
	{
		enterpriseContactUs.click();
		Thread.sleep(2000);
		FullName.sendKeys(prop.getProperty("First_Name"));
		BusinessEmail.sendKeys(prop.getProperty("E_Mail"));
		cphoneno.sendKeys(prop.getProperty("phoneno"));
		Select select=new Select(country);
		select.selectByVisibleText("India");
		//select.deselectByValue("IN");
		Thread.sleep(1000);
		submit.click();
		Thread.sleep(500);
		return warningpoup.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
