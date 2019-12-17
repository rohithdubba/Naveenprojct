package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.crm.qa.util.Testutil;

public class Testbase
{
	public static WebDriver driver;
	public static Properties prop;
	public Testbase()
	{
	/*try {
		FileInputStream ip=new FileInputStream("C:\\Users\\Admin\\frameworkimplement\\freecrmtest\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
	} 
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}*/
		
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/crm"
					+ "/qa/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
	public static void Initialize()
	{
	String browsername=	prop.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\chromedriver.exe" );
			driver=new ChromeDriver();
			
		}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_TIME, TimeUnit.SECONDS);
			
			driver.manage().timeouts().implicitlyWait(Testutil.IMPLICIT, TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
		}

}
