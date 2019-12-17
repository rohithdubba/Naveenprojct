package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class Loginpage extends Testbase {
	
	@FindBy(xpath="//a[@href='https://ui.freecrm.com']")
	WebElement prelgn_btn;

	public Loginpage() 
	{
		PageFactory.initElements(driver, this);
		
		
	}

public String validatetitle()
{
	return driver.getTitle();
}

public String Prelogin()
{

	prelgn_btn.click();
	
	
	return  driver.getTitle();
}
}