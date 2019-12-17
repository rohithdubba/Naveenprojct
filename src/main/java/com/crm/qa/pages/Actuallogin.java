package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.Testbase;

public class Actuallogin extends Testbase {
	
	public Actuallogin()
	{
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//input[@name='email']")
WebElement uname;

@FindBy(xpath="//input[@name='password']")
WebElement pwd;

//div[@class='ui fluid large blue submit button']

@FindBy(xpath="////div[@class='ui fluid large blue submit button']")
WebElement BTN_submit;

public void login(String username, String password)
{
	uname.sendKeys(username);
	uname.sendKeys(password);
	BTN_submit.click();
}
}
