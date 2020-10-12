package com.Java;

import org.openqa.selenium.chrome.ChromeDriver;

public class Caturing_googleTitle {

	public static void main(String[] args) {
		
		
		// saving the application Url into a Variable
		String google_url="http://google.com";
		
		// Automating the Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C://Users//hp//workspace//Selenium//DriverFiles//chromedriver.exe");
		// Creating an Object for the ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
//Navigating to application Url-passing the variable(saved with Url address) to get() method
		driver.get(google_url);
		
//Identifying the title of the current WebPage using getTitle() and saving into a variable
		// getTitle() - returns a String value - declaring the variable as String dataType
	String google_HomePageTitle=driver.getTitle();
	
	// Printing the captured title as an outPut
	System.out.println(" The the title of Google Home page is : "+google_HomePageTitle);
	

	String expected_GoogleHomePageTitle="google";
System.out.println("The expected title of Google Home Page is:"+expected_GoogleHomePageTitle);
	

String actual_GoogleHomePageTitle=driver.getTitle();
System.out.println("The actual title of Google Home Page is:"+actual_GoogleHomePageTitle);

	
	
	//if(actual_GoogleHomePageTitle.equals(expected_GoogleHomePageTitle))
	if(actual_GoogleHomePageTitle.equalsIgnoreCase(expected_GoogleHomePageTitle))
	{
		System.out.println(" Title Matched - PASS ");
	}
	else
	{
		System.out.println(" Title Not Matched - FAIL ");
	}
	
	driver.quit(); // will close the Browser along with Tab's


	}

}
