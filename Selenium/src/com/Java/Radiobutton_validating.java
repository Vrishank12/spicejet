package com.Java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton_validating {

	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    String	URL="http://demo.guru99.com/test/radio.html";
		    
	driver.get(URL);
		    
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		    
		    WebElement radio1 = driver.findElement(By.id("vfb-7-1"));							
	
		    
		    WebElement radio2 = driver.findElement(By.id("vfb-7-2"));	
	        WebElement radio3= driver.findElement(By.id("vfb-7-3"));
	        
	        
	      //Radio Button1 is selected		
	        radio1.click();			
	        System.out.println("Radio Button Option 1 Selected");					
	        		
	        //Radio Button1 is de-selected and Radio Button2 is selected		
	        radio2.click();			
	        System.out.println("Radio Button Option 2 Selected");			
	        
	        //Radio Button2 is de-selected and Radio Button3 is selected	
	        radio3.click();
	        System.out.println("Radio Button Option 3 Selected");	
	        
	        // Selecting CheckBox		
	        WebElement option1 = driver.findElement(By.id("vfb-6-0"));		
	        WebElement option2 = driver.findElement(By.id("vfb-6-1"));		
	        WebElement option3 = driver.findElement(By.id("vfb-6-2"));		

	        // This will Toggle the Check box 		
	        option1.click();
	        option2.click();
	        option3.click();
	        

	      //   Check whether the Check box is toggled on 		
	        if (option1.isSelected()) {					
	            System.out.println("Checkbox1 is Toggled On");					

	        } else {			
	            System.out.println("Checkbox1 is Toggled Off");					
	        }	
	        
	        if (option2.isSelected()) {					
	            System.out.println("Checkbox2 is Toggled On");					

	        } else {			
	            System.out.println("Checkbox2 is Toggled Off");					
	        }	
	        
	        if (option3.isSelected()) {					
	            System.out.println("Checkbox3 is Toggled On");					

	        } else {			
	            System.out.println("Checkbox3 is Toggled Off");					
	        }	
	        
	         
	         
	        
	         
	         
	        //Selecting Checkbox and using isSelected Method		
	         driver.get("http://demo.guru99.com/test/facebook.html");					
	         WebElement chkFBPersist = driver.findElement(By.id("persist_box"));							
	         //for (int i=0; i<2; i++) {											
	            chkFBPersist.click (); 			
	           // System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
			
	 	 driver.close();	


	}

}//dout
