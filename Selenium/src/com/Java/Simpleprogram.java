package com.Java;

import org.openqa.selenium.chrome.ChromeDriver;

public class Simpleprogram {
	public static void main(String[] args) {
		

		 System.setProperty("webdriver.chrome.driver", "C://Users//hp//workspace//Selenium//DriverFiles//chromedriver.exe");
	     ChromeDriver driver= new ChromeDriver();
	     
	          
	 
	 String    URL = ("https://renukashiva1-trials65101.orangehrmlive.com/auth/login");
	 driver.get(URL);
	    
 
	  
	 String Title=driver.getTitle();
	 System.out.println(Title);
	    
	    String CurrentUrl= driver.getCurrentUrl();
	    System.out.println(CurrentUrl);
	    
	    
		driver.quit();
		
	}

}
