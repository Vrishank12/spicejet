package com.Java;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookValidating {

	public static void main(String[] args) {



//public class ValidatingURL_Facebook {

	//public static void main(String[] args) {
		
		String facebook_url="http://facebook.com";
				
		System.setProperty("webdriver.chrome.driver", "C://Users//hp//workspace//Selenium//DriverFiles//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
		driver.get(facebook_url);
		
		String actual_FacebookHomePageTitle=driver.getTitle();
System.out.println(" The actual Title of Facebook Home page is : "
															+actual_FacebookHomePageTitle);
		
		String actual_FacebookHomePageCurrentUrl=driver.getCurrentUrl();
System.out.println(" The actual URL address of Facebook Home page is : "
														+actual_FacebookHomePageCurrentUrl);
		
		String expected_FacebookTitle="Facebook – log in or sign up";
System.out.println("The expected title of facebook home page is :"+expected_FacebookTitle);
		
		String expected_FacebookUrl="facebook.com";
System.out.println("The expected url address of facebook homePage is:"+expected_FacebookUrl);
		
		// Title validation
		if(actual_FacebookHomePageTitle.equals(expected_FacebookTitle))
		{
			System.out.println(" Title Matched -PASS ");
		}
		else
		{
			System.out.println(" Title not matched - FAIL");
		}
		
		// URl Validation
		if(actual_FacebookHomePageCurrentUrl.contains(expected_FacebookUrl))
		{
			System.out.println(" URl matched - PASS ");
		}
		else
		{
			System.out.println(" URL not matched - FAIL ");
		}
		String Capture_GoogleTitle=driver.getTitle();
		System.out.println("the title of google home page is:"+Capture_GoogleTitle);
		driver.quit();


		
		
		
		
	}

}
