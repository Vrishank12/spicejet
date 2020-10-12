package TestNG;

import org.testng.annotations.Test;

public class Annotations {
	
	@Test(priority=1)
	public void gmailApplicationLaunch()
	{
		System.out.println(" Gmail Application Launch ");
	}
		
	@Test(priority=2)
	public void inBox()
	{
		System.out.println(" Testing InBox Functionality ");
	}
	
@Test(enabled=false)//The current test case will be ignored by the TestNG during test Run
	public void sentMail()
	{
		System.out.println(" Testing SentMail Functionality ");
	}
	
	@Test(priority=3)
	public void composeMail()
	{
		System.out.println(" Testing composeMail Functionality ");

	}
	

}
