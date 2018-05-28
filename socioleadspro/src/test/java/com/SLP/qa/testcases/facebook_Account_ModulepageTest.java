package com.SLP.qa.testcases;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SB.qa.base.TestBase;
import com.SLP.qa.pages.Landingpage;
import com.SLP.qa.pages.LoginPage;
import com.SLP.qa.pages.facebook_Account_Modulepage;

public class facebook_Account_ModulepageTest extends TestBase {

	
	Landingpage landingpage;
	LoginPage loginPage;
	facebook_Account_Modulepage facebook_account_modulepage;
	
	public facebook_Account_ModulepageTest()
	{
		super();
		
	}
	
    @BeforeMethod
   public void setup() throws InterruptedException
      {
	      initilization();
	      loginPage=new LoginPage();
	    Thread.sleep(2000);  
	    loginPage.login(prop.getProperty("Emailid"), prop.getProperty("Password"));
	    Thread.sleep(2000);
	   facebook_account_modulepage= new facebook_Account_Modulepage();
      }
    
    @Test(priority=1,enabled=false)
    public void SLP001verifythefacebook_Account_ModulepageTest()
    {
    	boolean result = facebook_account_modulepage.verifythefacebook_Account_Modulepage();
    	Assert.assertEquals(result, true);
    }
    @Test(priority=2)
    public void SLP002AddfacebookaccountTest() throws InterruptedException
    {
    	boolean result =facebook_account_modulepage.Addfacebookaccount();
    	Assert.assertEquals(result, true);
    }
    
    @Test(priority=3)
    public void SLP004Facebook_profile_tableTest() throws InterruptedException
    {
    	boolean result =facebook_account_modulepage.Facebook_profile_table();
    	Assert.assertEquals(result, true);
    }
    
    @Test(priority=4)
    public void SLP005Facebook_id_columTest() throws InterruptedException
    {
    	boolean result =facebook_account_modulepage.Facebook_id_colum();
    	Assert.assertEquals(result, true);
    }
    
    @Test(priority=5)
    public void SLP006Added_Groups_columnTest() throws InterruptedException
    {
    	boolean result =facebook_account_modulepage.Added_Groups_column();
    	System.out.println(result);
    	Assert.assertEquals(result, true);
    }
    
    @Test(priority=6)
    public void SLP008ActionrowTest() throws InterruptedException
    {
    	List<Boolean> result =facebook_account_modulepage.Actionrow();
    	System.out.println(result);
    	List<Boolean> l2=new ArrayList<Boolean>();
		l2.add(true);
		l2.add(true);
    	Assert.assertEquals(result, l2);
    }
    
    @Test(priority=7)
    public void SLP009Facebook_Keywords_columnTest() throws InterruptedException
    {
    	boolean result =facebook_account_modulepage.Facebook_Keywords_column();
    	Assert.assertEquals(result,"true");
    }
    @Test(priority=8)
    public void SLP010View_Keywords_columnTest() throws InterruptedException
    {
    	boolean result =facebook_account_modulepage.View_Keywords_column();
    	Assert.assertEquals(result,"true");
    }
    
    @Test(priority=9)
    public void SLP011ClickonAddkeywordsButtonTest() throws InterruptedException
    {
    	String value = facebook_account_modulepage.ClickonAddkeywordsButton();
    	Assert.assertEquals(value, "Add keyword");
    }
    
    @Test(priority=10)
    public void SLP012checkUser_Added_Groups_popupTest() throws InterruptedException
    {
    	List<String> value = facebook_account_modulepage.checkUser_Added_Groups_popup();
    	List<String> l2=new ArrayList<String>();
    	//l2.add("User Added Groups");
    	l2.add("Group Name");
    	l2.add("Members");
    	System.out.println(value);
    	System.out.println(l2);
    	Assert.assertEquals(value, l2);
    }
    
    
    
    
    @AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
}
