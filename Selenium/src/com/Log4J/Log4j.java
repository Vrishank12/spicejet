package com.Log4J;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Log4j {

	WebDriver driver;
	 String	URL="https://www.google.com/"; 
	    
   Logger	 logger=Logger.getLogger("Log4j");
	 
	
	@BeforeMethod  
	public void SetUp()
	{
		
		PropertyConfigurator.configure("Log4j.properties"); 
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		  driver = new ChromeDriver();
		  logger.info("Chrome Browser opened successfully");
		  
	   // String	URL="https://www.google.com/";
	    
        driver.get(URL);
         
	    
	    driver.manage().window().maximize();
	    logger.info("window is successfully maxmize");
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
	    

	}
	
	@Test (priority=2)
	public void GoogleTitle ()
	{
		 String Title=driver.getTitle();
		 System.out.println(Title);
		 
		 
	 Assert.assertEquals("Google", Title);
		 Assert.assertEquals("Title is matched", "Google", Title);
		    logger.info("Title is successfull");
	} 
	
	@Test (priority=1) 
	public void CurrentUrl ()
	{
		String CurrentUrl= driver.getCurrentUrl();
	    System.out.println(CurrentUrl);
	    logger.info("CurrentUrl is successfull");
	} 
	
	 
	
	
	@AfterMethod  
	public void TearDown()
	{
		driver.quit();
		System.out.println("Logout from app");
		 logger.info("Logout is successfull");
	}
	




}
