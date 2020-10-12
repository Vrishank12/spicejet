package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBasics {
	@BeforeSuite //1
	public void SetUp()
	{
		System.out.println("SetUp System property for chrome");
	}

	@BeforeTest //2
	public void launchBrowser()
	{
		System.out.println("Launch Browser");
	}

	
	@BeforeClass //3
	public void login()
	{
		System.out.println("Login into App");
	}
	
	@BeforeMethod //4
	public void enterURL()
	{
		System.out.println("Enter URL");
	}
	
	@Test(priority=1) //5
	public void GoogleTitleTest()
	{
		System.out.println("Google Title Test");
	} 
	
	
	@Test(priority=2) //6
	public void getText()
	{
		System.out.println("get text method");
	}
	
	
	@AfterMethod //7
	public void logOut()
	{
		System.out.println("Logout from app");
	}
	
	@AfterClass //8

	public void DeleteAllCookies()
	{
		System.out.println("delecte all Cookies");
	}
	
	@AfterTest //9
	public void closeBrowser()
	{
		System.out.println("Close the browser");
	}
	
	
	
	@AfterSuite //10
	public void GenerateTestReports()
	{
		System.out.println("Generate Test Results");
	}




}
