package com.SLP.qa.testcases;

import java.util.Iterator;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SLP.qa.pages.Landingpage;
import com.SLP.qa.pages.Pricingpage;

public class PricingpageTest extends TestBase {
	
	Landingpage landingpage;
	Pricingpage pricingpage;
	
	
	public PricingpageTest()
	{
		super();
	}
	
	   @BeforeMethod
	    public void setup() throws InterruptedException
	       {
		      initilization();
		     landingpage=new Landingpage();
		    Thread.sleep(2000);  
		    pricingpage=landingpage.Clickonpricingbutton();
		    Thread.sleep(1000); 
	       }
	   
	 @Test(priority=1)
	 public void SLP150verifyPricingpagetitleTest()
	 {
		 String title = pricingpage.verifyPricingpagetitle();
		 Assert.assertEquals(title,"Plans That Meet Your Needs");
	 }
	 
	 @Test(priority=2)
	 public void SLP151verifyAllplanTest()
	 {
		 List<String> l2 = pricingpage.verifyAllplan();
		 Iterator itr = l2.iterator();
		 String name[]= {"Free","Basic Plan","Standard","Premium","Business","Enterprise"};
		 int len=name.length;
		 for(int i=0;i<len;i++)
		 {
			 
		// checking the next element availabilty
	       if(itr.hasNext())
	        {
	            //  moving cursor to next element
	            String planname = (String) itr.next();
	           Assert.assertEquals(planname,name[i]);
	          
	        }
		 
		 }
	 }
	 
	 
	 @Test(groups = { "Plan_ Try now" },priority=3)
	 public void SLP152AClickonBasicpalntrynow() throws InterruptedException
	 {
		 String signuppagename = pricingpage.ClickonBasicpalntrynow();
		 Assert.assertEquals(signuppagename,"Signup Form");
		 
	 }
	 @Test(groups = { "Plan_ Try now" },priority=4)
	 public void SLP152BClickonStandardpalntrynow() throws InterruptedException
	 {
		 String signuppagename = pricingpage.ClickonStandardpalntrynow();
		 Assert.assertEquals(signuppagename,"Signup Form");
		 
	 }
	 
	 @Test(groups = { "Plan_ Try now" },priority=5)
	 public void SLP152CClickonPremiumpalntrynowTest() throws InterruptedException
	 {
		 String signuppagename = pricingpage.ClickonPremiumpalntrynow();
		 Assert.assertEquals(signuppagename,"Signup Form");
		 
	 }
	 
	 @Test(groups = { "Plan_ Try now" },priority=6)
	 public void SLP152DClickonBusinesspalntrynowTest() throws InterruptedException
	 {
		 String signuppagename = pricingpage.ClickonPremiumpalntrynow();
		 Assert.assertEquals(signuppagename,"Signup Form"); 
	 }
	 @Test(priority=7,enabled=false)
	 public void SLP153FillSignupFormTest() throws InterruptedException
	 {
		 pricingpage.FillSignupForm();
	 }
	 @Test(groups = { "Plan_ Try now" },priority=8)
	 public void SLP154ClickonFreepalntrynowTest() throws InterruptedException
	 {
		 String signuppagename = pricingpage.ClickonFreepalntrynow();
		 Assert.assertEquals(signuppagename,"Signup Form"); 
	 }
	 @Test(priority=9,enabled=false)
	 public void SLP155FreepalnFillSignupFormTest() throws InterruptedException
	 {
		 Landingpage lp = pricingpage.FreepalnFillSignupForm();
		 Thread.sleep(2000);
		 String title = lp.verifyLandingpage();
		 Assert.assertEquals(title,"SocioleadsPro");
	 }
	   
	 @Test(priority=10)
	 public void SLP156ClickonenterpriseplanContactUsTest() throws InterruptedException 
	 {
		 boolean result = pricingpage.ClickonenterpriseplanContactUs();
		 Assert.assertEquals(result, true);
	 }  
	   
	 @Test(priority=11)
	 public void SLP157FillContactUspopupTest() throws InterruptedException 
	 {
		 String msg = pricingpage.FillContactUspopup();
		 Assert.assertEquals(msg,"Your Request is successful,Our support will contact you soon.");
	 } 
	   
	 @Test(priority=12)
	 public void SLP158FillContactUspopupwronglyTest() throws InterruptedException 
	 {
		 String msg = pricingpage.FillContactUspopupwrongly();
		 Assert.assertEquals(msg,"You already Requested ,Our support will contact you soon.");
	 } 

	  
	   @AfterMethod
	      public void tearDown()
	      {
	    	driver.quit();
	      }
		
	
	
	
	
	
	
	
	
	
	

}
