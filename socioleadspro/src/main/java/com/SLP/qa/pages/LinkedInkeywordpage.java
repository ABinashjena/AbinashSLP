package com.SLP.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SB.qa.base.TestBase;

public class LinkedInkeywordpage extends TestBase {

	public static Alert alert;
	@FindBy(xpath="/html//input[@id='Keyword']")
	WebElement addingLinkedinKeyword;
	@FindBy(xpath="//select/option[@value='Delphi and Pascal Developers Group']")
	WebElement clickongrp;
	@FindBy(xpath="/html//button[@id='js_right_Selected']")
	WebElement selectongrp;
	@FindBy(xpath="/html//div[@id='btnAddCredits']")
	WebElement submit;
	
	
	public LinkedInkeywordpage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void AddingLinkedinKeyword() throws InterruptedException
	{
		Thread.sleep(2000);
		addingLinkedinKeyword.sendKeys(prop.getProperty("Keywordb"));
		clickongrp.click();
		selectongrp.click();
	
			
				submit.click();
				Thread.sleep(1000);
				//Alert alert;
				try {
					alert = driver.switchTo().alert();
					System.out.println(alert.getText());
					alert.accept();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
				
			}
			
	
		
			
	
			
	
	
	}
	
	
	
	
	
	
	

