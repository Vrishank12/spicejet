package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PractiseTestng {
	
	
	@BeforeSuite
	public void setUp() {
		System.out.println("setup system property for chrome");
		
	}

	@BeforeTest
	public void launchBrowser() {
		System.out.println("launch browser");
		
		
	}
	
	@BeforeMethod
	public void Login() {
		
		System.out.println("login in app");
	}
	
	
	//@test----used to write the test cases
	
	@Test
	public void googleTitle() {
		
		System.out.println("google title page");
		
	}
	
	@Test
	public void SearchTest() {
		
		System.out.println("Search Test");
		
	}
	
	@AfterMethod
	public void logOut(){
		System.out.println("logout to app");
	}
	
	@AfterTest
	public void closeBrowser(){
		
		System.out.println("close the browser");
	}
	
	@AfterSuite
	public void generateTest(){
		System.out.println("generate test");
	}
	
}

