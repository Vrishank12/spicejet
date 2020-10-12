package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider2 {

	
	
	@Test(dataProvider="loginDataProvider")
	public void Testdata(String email, String pwd)
	{
		System.out.println(email+"  "+pwd);
	}
	@DataProvider(name="loginDataProvider")
	public Object[][] getData()
	{ 
		Object[][] data={{"mom@gmail.com","mom"},{"abc@gmail.com","abc"}}; 
		/*data[0][0]="mom";
		data[0][1]="aish";
		data[1][0]="bol";
		data[1][1]="bye";
		*/
		return data;
		

/*	@Test(dataProvider="loginDataprovider")
	public void Logintest(String email,String pwd)
	{
		System.out.println(email + "    "+ pwd);
	}
	
	
	@DataProvider(name="loginDataprovider")
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		
		//1st row
		data[0][0]="hello";
		data[0][1]="pandi";
		
		//2nd row
		data[1][0]="hi";
		data[1][1]="idiot";
		
		//3rd row
		data[2][0]="Bye";
		data[2][1]="rascal";
				
		return data;
*/		
	}
	 

	
	
}
