package com.SLP.qa.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SB.qa.base.TestBase;

public class facebook_Account_Modulepage extends TestBase {
	
	@FindBy(xpath="//*[@id=\"#main_content\"]/div/div/div[1]/div/button")
	WebElement AddFacebookAccountButton;
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement fbemailid;
	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement fbpass;
	@FindBy(xpath="//*[@id=\"loginbutton\"]")
	WebElement fbloginbuton;
	@FindBy(xpath="//*[@id=\"#main_content\"]/div/div/div[2]/div/table/tbody/tr/td[6]/span[2]")
	WebElement accdeletebuton;
 //*****************************Facebook_profile_table*********************************************//
	@FindBy(xpath="//*[@id=\"#main_content\"]/div/div/div[2]/div/table/thead/tr/th[1]")
	WebElement facebook_idcolumn;
	@FindBy(xpath="//*[@id=\"#main_content\"]/div/div/div[2]/div/table/thead/tr/th[2]")
	WebElement FacebookKeywordscolumn;
	@FindBy(xpath="//*[@id=\"#main_content\"]/div/div/div[2]/div/table/thead/tr/th[3]")
	WebElement ViewKeywordscolumn	;
	@FindBy(xpath="//*[@id=\"#main_content\"]/div/div/div[2]/div/table/thead/tr/th[4]")
	WebElement AddedGroupscolumn;
	@FindBy(xpath="//*[@id=\"#main_content\"]/div/div/div[2]/div/table/thead/tr/th[5]")
	WebElement TotalGroupscolumn;
	@FindBy(xpath="//*[@id=\"#main_content\"]/div/div/div[2]/div/table/thead/tr/th[6]")
	WebElement Actioncolumn;
	@FindBy(xpath="//*[@id=\"#main_content\"]/div/div/div[2]/div/table/tbody/tr/td[1]")
	WebElement facebook_id_column;
	@FindBy(xpath="//*[@id=\"#main_content\"]/div/div/div[2]/div/table/tbody/tr/td[4]/a/span")
	WebElement Added_Groups_column;
	@FindBy(xpath="//*[@id=\"#main_content\"]/div/div/div[2]/div/table/tbody/tr/td[6]/span[1]")
	WebElement AddedmoreGroupsbutton;
	@FindBy(xpath="//*[@id=\"#main_content\"]/div/div/div[2]/div/table/tbody/tr/td[6]/span[2]")
	WebElement delete;
	@FindBy(xpath="//*[@id=\"#main_content\"]/div/div/div[2]/div/table/tbody/tr/td[2]/a")
	WebElement Add_Keywords_button;
	@FindBy(xpath="//*[@id=\"#main_content\"]/div/div/div[2]/div/table/tbody/tr/td[3]/a")
	WebElement view_button;
	@FindBy(xpath="//*[@id=\"CreateForm\"]/div[1]/label")
	WebElement create_fb_keyword_page;
//************************User Added Groups popup**************************************************************************//
	@FindBy(xpath="//*[@id=\"CreateForm\"]/div[1]/label")
	WebElement UserAddedGroupspopup_title;
	@FindBy(xpath="//*[@id=\"UserAddedFBGroupModal\"]/div/div/div[2]/table/thead/tr/th[1]")
	WebElement Group_Name_column;
	@FindBy(xpath="//*[@id=\"UserAddedFBGroupModal\"]/div/div/div[2]/table/thead/tr/th[2]")
	WebElement Members_column;
	
	
	
	
	public facebook_Account_Modulepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean  verifythefacebook_Account_Modulepage()
	{
	        return AddFacebookAccountButton.isDisplayed();
	}
	
	public boolean Addfacebookaccount() throws InterruptedException
	{
		AddFacebookAccountButton.click();
		Thread.sleep(2000);  
		fbemailid.sendKeys(prop.getProperty("FBEmailid"));
		fbpass.sendKeys(prop.getProperty("FBPassword"));
		fbloginbuton.click();
		Thread.sleep(2000);  
		return accdeletebuton.isDisplayed();
	}

	
	public boolean Facebook_profile_table()
	{
		List<String> l1=new ArrayList<String>();
	l1.add(facebook_idcolumn.getText());
	l1.add(FacebookKeywordscolumn.getText());
	l1.add(ViewKeywordscolumn.getText());
	l1.add(AddedGroupscolumn.getText());
	l1.add(TotalGroupscolumn.getText());
	l1.add(Actioncolumn.getText());
	System.out.println(l1);
	   List<String> l2=new ArrayList<String>();
	l2.add("Facebook_id");
	l2.add("Facebook Keywords");
	l2.add("View Keywords");
	l2.add("Added Groups");
	l2.add("Total Groups");
	l2.add("Action");
	   return l1.equals(l2);
	   }
	
	public boolean  Facebook_id_colum()
	{
		
		  String value = facebook_id_column.getText();
		 return (value.contains("@") || value.contains("."));
		
	}
	
	public boolean  Added_Groups_column()
	{
		String value = Added_Groups_column.getText();
		int i =Integer.parseInt(value);
		return i>=0;
	}
	public List<Boolean>  Actionrow()
	{
		List<Boolean> l1=new ArrayList<Boolean>();
		l1.add(AddedmoreGroupsbutton.isDisplayed());
		l1.add(delete.isDisplayed());
		return l1;	
	}
	
	public boolean Facebook_Keywords_column()
	{
		return Add_Keywords_button.isDisplayed();	
	}
	
	public boolean View_Keywords_column()
	{
		return view_button.isDisplayed();	
	}
	
	public String ClickonAddkeywordsButton() throws InterruptedException
	{
	 Add_Keywords_button.click();
	 Thread.sleep(2000);
	 return create_fb_keyword_page.getText();
	}
	
	public List<String> checkUser_Added_Groups_popup() throws InterruptedException
	{
		Added_Groups_column.click();
	 Thread.sleep(2000);
	 List<String> l1=new ArrayList<String>();
	 //l1.add(UserAddedGroupspopup_title.getText());
	 l1.add(Group_Name_column.getText());
	 l1.add(Members_column.getText());
	 return l1;
	 
	}
	
	
	
	
}
