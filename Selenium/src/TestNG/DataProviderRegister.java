package TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.TestUtilities;


public class DataProviderRegister {

 //Logger	 logger=Logger.getLogger("Log4j");
 WebDriver driver;
	
	
	@BeforeMethod
	public void SetUp()
	{
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		  driver = new ChromeDriver();
	    String	URL="http://demo.automationtesting.in/Register.html";
	    //logger.info("Chrome Browser opened successfully");
	    
        
          
	    
	    driver.manage().window().maximize();
	    //logger.info("window is successfully maxmize");
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
	    driver.get(URL);
	    
	    
	}
	
	
	 

	
	
	@DataProvider(name="getTestdata")
	public Object[][] getData() throws IOException
	{
		Object data [][] = TestUtilities.getTestdataMethod();
		return data;
		
	}
	
	 
	
	@Test(dataProvider="getTestdata")
	public void register_test(String firstname,String lastName,String address,String email,String phone,
			String Radio,String checkbox,String skills,String country,String Year,String month,String Day,String Pwd
			,String CPwd,String Status) throws InterruptedException
		{
		
		    
		    
		
            driver.navigate().refresh();		
		
		  WebElement Firstname= driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		   Firstname.sendKeys(firstname);
		   
		   WebElement LastName= driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		   LastName.sendKeys(lastName);
		   
		   WebElement Address =   driver.findElement(By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-valid' and @ng-model='Adress']"));
		   Address.sendKeys(address);
		   
		   WebElement Email=   driver.findElement(By.xpath("//input[@type='email' and @ng-model='EmailAdress']"));
		   Email.sendKeys(email);
		   
 
	 
		   
		   WebElement Phone=   driver.findElement(By.xpath("//input[@type='tel' and @ng-model='Phone']"));
		    
		   Phone.sendKeys(phone);;
		 
		   //Radio Buttons
		   List<WebElement> radio=   driver.findElements(By.xpath("//input[@name='radiooptions']"));	   
		   for(int j=0;j<radio.size();j++)
		   {
			   WebElement rd= radio.get(j);
			   String id2=rd.getAttribute("value");
			   if (id2.equals(Radio))
			   {
				   rd.click();
				   System.out.println("Radio"+ j + "is" + rd.isSelected());
			   }
		   }
		   


		   //CheckBoxes
		   int a= driver.findElements(By.xpath("//input[@type='checkbox']")).size();
           List <WebElement>  Checkbox= driver.findElements(By.xpath("//input[@type='checkbox']")); 
	            
           for(int p=0;p<a;p++)
           {
           	 
           	WebElement El =Checkbox.get(p);     
               String id =El.getAttribute("value");
                if(id.equals(checkbox  ))
               	
            		   {
                         El.click();
                         System.out.println("CheckBox" +p+" is "+El.isSelected());  
                         
                          
            		   }
            
           }
    
		   Select Skills = new Select(driver.findElement(By.id("Skills")));
		   Skills.selectByVisibleText("Java");
		   
		   
		   Select Country = new Select(driver.findElement(By.id("countries")));
		   Country.selectByVisibleText("India");
		   
		   
		   Select year = new Select(driver.findElement(By.id("yearbox")));
		   year.selectByVisibleText("1992");
		   
		   Select Month = new Select(driver.findElement(By.xpath("//select[@ng-model='monthbox']")));
		   Month.selectByVisibleText("February");
		   
		   Select day = new Select(driver.findElement(By.id("daybox")));
		   day.selectByVisibleText("16");
		   
		   WebElement password=driver.findElement(By.xpath("//input[@onblur='validatepattern(this)']"));
		   password.sendKeys(Pwd);
		   
		   WebElement Cpassword=driver.findElement(By.xpath("//input[@ng-model='CPassword']"));
		   Cpassword.sendKeys(CPwd);
		   
		   
	    	WebElement  SignUp= driver.findElement(By.name("signup"));
	    	SignUp.click();
	    
		
	    	Thread.sleep(10000);
	    	 if(	driver.getPageSource().contains(" - Double Click on Edit Icon to "))
			    {
			    	System.out.println("SUCCESS");
			         

			    }
			    else
			    {
			    	System.out.println("FAILURE");
			    	 
			   driver.findElement(By.xpath("//button[@id='Button1' and @value='Refresh']")).click();
	  
			   
			   
		          driver.navigate().forward();
			    }
		}
		        @AfterMethod  
		      	public void TearDown()
		      	{
		      		driver.quit();
		      		System.out.println("Logout from app");
		  //    		 logger.info("Logout is successfull");
		      	}
		      	
			   
			    }
	

