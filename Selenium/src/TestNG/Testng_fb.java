package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testng_fb {
	
	
	@Test(dataProvider="testData")
	public void Logintest(String email,String pwd)
	{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    String URL="https://www.facebook.com/";
	    
         driver.get(URL);
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	    
	    
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys(email);
	    
	    
	   driver.findElement(By.id("pass")).clear(); 	    
	   driver.findElement(By.id("pass")).sendKeys(pwd);
	    
	     
	}
	
	
	@DataProvider(name="testData")
    public Object[][] testDataFeed()
    {
		
       Object[][] data= new Object[2][2];
       
       data[0][0]="renukamohan8@gmail.com";
       data[0][1]="08062008";
       
       
       data[1][0]="VenkataSiva@gmail.com";
       data[1][1]="0256314";
       
        
		return data;

    }
}
