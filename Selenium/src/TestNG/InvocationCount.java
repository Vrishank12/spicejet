package TestNG;

import org.testng.annotations.Test;

public class InvocationCount {
	

	@Test(invocationCount=3)
	public void sum()
	{
		int a=12;
		int b=25;
		int c;
		c=a+b;
		System.out.println(" The sum is ...." + c);
	}

}
