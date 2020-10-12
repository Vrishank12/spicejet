package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrangeTest {
	
	WebDriver driver;
	 
	    
	
	 
	
	@BeforeMethod  
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "./driverFiles/chromedriver.exe");
		  driver = new ChromeDriver();
	    String	URL="https://www.google.com/";
	    
         driver.get(URL);
          
	    
	    driver.manage().window().maximize();
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
		    
	} 
	
	@Test (priority=1) 
	public void CurrentUrl ()
	{
		String CurrentUrl= driver.getCurrentUrl();
	    System.out.println(CurrentUrl);
	} 
	
	 
	
	
	@AfterMethod  
	public void TearDown()
	{
		driver.quit();
		System.out.println("Logout from app");
	}
	


}
