package com.SLP.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SLP.qa.pages.Landingpage;
import com.SLP.qa.pages.LoginPage;

public class LandingpageTest extends TestBase {
	
	
	
	Landingpage landingpage;
	public LandingpageTest()
	{
		super();
	}
        @BeforeMethod
    public void setup() throws InterruptedException
       {
	      initilization();
	     landingpage=new Landingpage();
	    Thread.sleep(2000);  
       }
        @Test(priority=1)
        public void SLP135verifyLandingpageTest() throws InterruptedException
        {
        	String pagetitle = landingpage.verifyLandingpage();
            System.out.println(pagetitle);
        	Thread.sleep(1000);
        	Assert.assertEquals(pagetitle,"SocioleadsPro");	
        }
        @Test(dependsOnMethods= {"SLP135verifyLandingpageTest"})
        public void SLP136headerallbuttonTest()
        {
        	landingpage.headerallbutton();
        }
        @Test(priority=2) 
        public void SLP137bodyallbuttonTest()
        {
        	landingpage.bodyallbutton();
        }
        @Test(priority=3) 
        public void SLP138footerallbutonTest()
        {
        	landingpage.footerallbuton();
        }
        @Test(priority=4) 
        public void SLP139clickonFacebook_iconTest() throws InterruptedException
        {
        	String url = landingpage.clickonFacebook_icon();
        	Assert.assertEquals(url, "https://www.facebook.com/socioleadspro");
        	
        	
        }
        
        @Test(priority=5) 
        public void SLP140clickonlinkedin_iconTest() throws InterruptedException
        {
        	String url = landingpage.clickonlinkedin_icon();
        	Assert.assertEquals(url, "https://www.linkedin.com/company/socioleadspro");
        	
        	
        }
        @Test(priority=6) 
        public void SLP141clickontwitter_iconTest() throws InterruptedException
        {
        	String url = landingpage.clickontwitter_icon();
        	Assert.assertEquals(url, "https://twitter.com/SocioLeadsPro");
        	
        	
        }
        @Test(priority=7) 
        public void SLP142clickonbloglinkTest() throws InterruptedException
        {
        	String url = landingpage.clickonbloglink();
        	Assert.assertEquals(url, "http://blog.socioleadspro.com/");
        	
        	
        }
       
        @Test(priority=8) 
        public void SLP143clickonproductlinkTest() throws InterruptedException
        {
        	String productpageurl = landingpage.clickonproductlink();
        	Assert.assertEquals(productpageurl, "https://www.socioleadspro.com/Product");
        	
        }
        @Test(priority=9) 
        public void SLP144clickonaboutlinkTest() throws InterruptedException
        {
        	String aboutpageurl = landingpage.clickonaboutlink();
        	Assert.assertEquals(aboutpageurl, "https://www.socioleadspro.com/About");
        	
        }
        
        @Test(priority=10) 
        public void SLP145clickonextensionlinkTest() throws InterruptedException
        {
        	String extensionpageurl = landingpage.clickonextensionlink();
        	Assert.assertEquals(extensionpageurl, "https://www.socioleadspro.com/extension");
        	
        }
        
        @Test(priority=11) 
        public void SLP146clickonpricingpageTest() throws InterruptedException
        {
        	landingpage.clickonpricingpage();
        	
        }
        
        @Test(priority=12) 
        public void SLP147clickonloginpageTest() throws InterruptedException
        {
        	landingpage.clickonloginpage();
        }
        
        @Test(priority=13) 
        public void SLP148clickonstartgeneratingleadslinkTest() throws InterruptedException
        {
        	landingpage.clickonstartgeneratingleadslink();
        }
        
        @Test(priority=14) 
        public void SLP149clickonPrivacyPolicylinkTest() throws InterruptedException
        {
        	
        	String title = landingpage.clickonPrivacyPolicylink();
        	Assert.assertEquals(title,"SocioLeadsPro Privacy Policy");
        }
        
      @AfterMethod
      public void tearDown()
      {
    	driver.quit();
      }
	
	
	
	
}
