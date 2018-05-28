package com.SLP.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.SB.qa.base.TestBase;

public class Landingpage extends TestBase {
//****************Header_landing_page_buttons********************************************//
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[1]/a")
	WebElement fbicon;
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a/i")
	WebElement liicon;
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a/i")
	WebElement twicon;
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[4]/a")
	WebElement blog;
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a")
	WebElement product;
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[6]/a")
	WebElement about;
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[7]/a")
	WebElement extension;
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[8]/a/button")
	WebElement pricing;
	@FindBy(xpath="//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[9]/a/button")
	WebElement login;
//****************Body_landing_page_buttons********************************************//
	@FindBy(xpath="/html/body/section[3]/div/div/div/div/div/div[2]/a")
	WebElement startgeneratingleads;
	@FindBy(xpath="/html/body/section/div/div/div/article/h2[1]/strong")
	WebElement PrivacyPolicypagetitle;
	
//*********************************Footer_landing_page_buttons*******************************//
	@FindBy(xpath="/html/body/footer/div/div/div/ul/li[1]/a/i")
	WebElement ffbicon;
	@FindBy(xpath="/html/body/footer/div/div/div/ul/li[2]/a/i")
	WebElement fliicon;
	@FindBy(xpath="/html/body/footer/div/div/div/ul/li[3]/a/i")
	WebElement ftwicon;
	@FindBy(xpath="/html/body/footer/div/div/div/p/a")
	WebElement privacypolicy;
	
	public Landingpage()
	{
		PageFactory.initElements(driver,this);
	}
	public String  verifyLandingpage()
	{
		return driver.getTitle();
	}
	public void headerallbutton()
	{
		boolean FBicon = fbicon.isDisplayed();
		boolean LIicon = liicon.isDisplayed();
		boolean TWicon = twicon.isDisplayed();
		boolean Blog = blog.isDisplayed();
		boolean Product = product.isDisplayed();
		boolean About = about.isDisplayed();
		boolean Extension = extension.isDisplayed();
		boolean Pricing = pricing.isDisplayed();
		boolean Login = login.isDisplayed();
		
		List l1 = new ArrayList();
		l1.add(FBicon);
		l1.add(LIicon);
		l1.add(TWicon);
		l1.add(Blog);
		l1.add(Product);
		l1.add(About);
		l1.add(Extension);
		l1.add(Pricing);
		l1.add(Login);
		//System.out.println(l1);
		List l2=new ArrayList();
		l2.addAll(l1);
		System.out.println(l2);
		 Assert.assertEquals(l1, l2,"failed");
		 
		 
		
		
	}
    
	public void bodyallbutton()
	{
		 boolean result = startgeneratingleads.isDisplayed();
		 List l1 = new ArrayList();
		 l1.add(result);
		 List l2=new ArrayList();
			l2.addAll(l1);
			System.out.println(l2);
			 Assert.assertEquals(l1, l2,"failed");
	}
    
	public void footerallbuton()
	{
		
		boolean FBicon = ffbicon.isDisplayed();
		boolean LIicon = fliicon.isDisplayed();
		boolean TWicon = ftwicon.isDisplayed();
		boolean PrivacyPolicy = privacypolicy.isDisplayed();
		List l1 = new ArrayList();
		l1.add(FBicon);
		l1.add(LIicon);
		l1.add(TWicon);
		l1.add(PrivacyPolicy);
		List l2=new ArrayList();
		l2.addAll(l1);
		System.out.println(l2);
		 Assert.assertEquals(l1, l2,"failed");
		 }
	
	public void switchToTab() {
		ArrayList<String> windowHandles = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(windowHandles.get(1));
		 }
	
	public String clickonFacebook_icon() throws InterruptedException
	  {
		fbicon.click();
	  Thread.sleep(2000);
	   switchToTab();
       return driver.getCurrentUrl();	
	}
	public String clickonlinkedin_icon() throws InterruptedException
	  {
		liicon.click();
	  Thread.sleep(2000);
	   switchToTab();
     return driver.getCurrentUrl();	
	}
	public String clickontwitter_icon() throws InterruptedException
	  {
		twicon.click();
	  Thread.sleep(2000);
	   switchToTab();
   return driver.getCurrentUrl();	
	}
	
	public String clickonbloglink() throws InterruptedException
	  {
		blog.click();
	  Thread.sleep(2000);
	   switchToTab();
 return driver.getCurrentUrl();	
	}
	
	
	public String clickonproductlink() throws InterruptedException
	{
		product.click();
		Thread.sleep(2000);
		return driver.getCurrentUrl();
		
	}
	
	public String clickonaboutlink() throws InterruptedException
	{
		about.click();
		Thread.sleep(2000);
		return driver.getCurrentUrl();
		
	}
	
	public String clickonextensionlink() throws InterruptedException
	{
		extension.click();
		Thread.sleep(2000);
		return driver.getCurrentUrl();
		
	}
	
	public Pricingpage clickonpricingpage() throws InterruptedException
	{
		pricing.click();
		Thread.sleep(2000);
		return new Pricingpage();
		
	}
	public LoginPage clickonloginpage() throws InterruptedException
	{
		login.click();
		Thread.sleep(2000);
		return new LoginPage();
		
	}
	
	public LoginPage clickonstartgeneratingleadslink() throws InterruptedException
	{
		startgeneratingleads.click();
		Thread.sleep(2000);
		return new LoginPage();
		
	}
	public String clickonPrivacyPolicylink() throws InterruptedException
	{
		privacypolicy.click();
		Thread.sleep(2000);
		switchToTab();
		return PrivacyPolicypagetitle.getText();
		
	}
	
	public Pricingpage Clickonpricingbutton()
	{
		pricing.click();
		return new Pricingpage();
	}
	
	
}
