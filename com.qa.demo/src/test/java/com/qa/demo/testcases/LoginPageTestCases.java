package com.qa.demo.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Log;
import com.qa.demo.BaseTest.BaseTest;
import com.qa.demo.Pages.LoginPage;
import com.qa.demo.Utility.*;

public class LoginPageTestCases extends BaseTest {
   LoginPage loginPage;
	
	public LoginPageTestCases(){//constructor
		super();
	}

	
	@BeforeMethod
	public void SetUp()
	{
		initialization(); //launching browser
	loginPage	=new LoginPage();
		
	}
	
	
	@Test(priority=1)
	public void LoginPageTitle()
	{
		 String title =loginPage.validatingLogInPageTitle();
		 Assert.assertEquals(title, "Facebook – log in or sign up"); //testng(validating)
		// Log.info("Title is successfully matched"); //log4j results
		 logger = report.createTest("LogInPage Test"); //expent reports
			logger.info("validating Title");
			logger.pass("LogIn page Title Validation Successfully");
		
	}
	
	@Test(priority=2)
	
	public void loginTest() throws InterruptedException
	{
		loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
		//Log.info("successfully login" );
	}
		
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	//	Log.info("successfully close the application");
		report.flush();
	}
	
	

}
