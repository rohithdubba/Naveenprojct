package com.crm.qa.testcase;

import org.testng.annotations.Test;

import com.crm.qa.base.Testbase;
import com.crm.qa.pages.Actuallogin;

public class Actuallogintest extends Testbase
{
	Actuallogin logobj;
	public Actuallogintest()
	{
		super();
		logobj= new Actuallogin();
	}
	
	
	@Test
	public void  actualloginvalidate(String userid, String password)
	{
		
		logobj.login(userid, password);
		
	}

}
