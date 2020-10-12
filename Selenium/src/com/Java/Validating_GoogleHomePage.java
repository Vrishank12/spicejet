package com.Java;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validating_GoogleHomePage {

	public static void main(String[] args) {
		String google_url="http://google.com";
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
		driver.get(google_url);
	
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
