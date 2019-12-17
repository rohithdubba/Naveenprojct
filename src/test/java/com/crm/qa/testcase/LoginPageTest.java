package com.crm.qa.testcase;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Actuallogin;
import com.crm.qa.pages.Loginpage;

public class LoginPageTest extends Testbase
{
Loginpage login  ;
	public LoginPageTest()
	{
		super();
	}
	
@BeforeMethod
	public void setup()
	{
		Initialize();
		login = new Loginpage();
	}
	
	@Test(priority=2)
	public void titletest()
	{
		String actualtitle=login.validatetitle();
		
	Assert.assertEquals(actualtitle, "Free CRM #12 cloud software for any business large or small");
	
	}
	
	@Test(priority =1)
	public void preloginbtn_validate()
	{
		String title =login.Prelogin();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
	/*@AfterMethod
	public void Teardwn()
	{
		driver.quit();
	} */
}
