package com.Java;

import org.openqa.selenium.chrome.ChromeDriver;

public class ApplicationNavigation {

	public static void main(String[] args) {
		
						
				System.setProperty("webdriver.chrome.driver", "C://Users//hp//workspace//Selenium//DriverFiles//chromedriver.exe");
				ChromeDriver hi = new ChromeDriver();
				
		// hi(Object) always represents to the Class - will always points to the current Browser
				// Opened By the WebDriver

				// Using the hi(Object) - navigating to the application Url on the Browser
				hi.get("http://www.facebook.com");
				
		//hi(Object) always represents to the current Browser(no matter whatever is existing on it)
				hi.get("http://gmail.com");
				
//		 	navigate().to() - another method to open an application on the Browser	
				hi.navigate().to("http://bing.com");
				
				// Closing the Browser using close()
				hi.close();


	}

}
