package TestNG;

import org.testng.annotations.Test;

public class ExceptionTimeOut {

	
	@Test(expectedExceptions=NumberFormatException.class)
	public void Hi()
	{
		String d ="HELLO123";
		Integer.parseInt(d);
	}
	
	

}
