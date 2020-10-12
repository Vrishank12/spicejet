package com.Java;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Practise {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		String	url="http://demo.automationtesting.in/Register.html";
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		FileInputStream file = new FileInputStream("C://Users//hp//workspace//Selenium//src//excelsheets//RegisterForm.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int RowCount=sheet.getLastRowNum();
		for(int i=1;i<=RowCount;i++)
		{
			Row row=sheet.getRow(i);
			
			//<input type="text" placeholder="First Name" class="form-control ng-pristine ng-invalid ng-invalid-required ng-touched"
			//ng-model="FirstName" required="">
			
			driver.navigate().refresh();
			WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			firstName.clear();
			firstName.sendKeys(row.getCell(0).getStringCellValue());
			
			//<input type="text" placeholder="Last Name" class="form-control ng-pristine ng-invalid
			//ng-invalid-required ng-touched" ng-model="LastName" required="">
			
			WebElement lastName=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
			lastName.clear();
			lastName.sendKeys(row.getCell(1).getStringCellValue());
			
			//<textarea rows="3" class="form-control 
			//ng-pristine ng-valid ng-touched" ng-model="Adress"> </textarea>
			
			WebElement Address=driver.findElement(By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-valid' and @ng-model='Adress']"));
			Address.clear();
			Address.sendKeys(row.getCell(2).getStringCellValue());
			
			//<input type="email" class="form-control ng-pristine ng-valid-email ng-invalid ng-invalid-required ng-touched"
			//ng-model="EmailAdress" required="">
			
			WebElement Email=driver.findElement(By.xpath("//*[@type='email' and @ng-model='EmailAdress']"));
			Email.clear();
			Email.sendKeys(row.getCell(3).getStringCellValue());
			
			//<input type="tel" class="form-control ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-touched" 
			//ng-model="Phone" required="" pattern="^\d{10}$">
			//typecasting
			double d=row.getCell(4).getNumericCellValue();
			long x=(long)d;
			String PhoneNumber=Long.toString(x);
			
			WebElement Phone=driver.findElement(By.xpath("//*[@type='tel' and @ng-model='Phone']"));
			Phone.clear();
			Phone.sendKeys(PhoneNumber);
			
			//<input type="radio" name="radiooptions" ng-model="radiovalue" value="Male" 
			//required="" class="ng-pristine ng-invalid ng-invalid-required ng-touched">
			
			WebElement Male=driver.findElement(By.xpath("//input[@type='radio' and @value='Male']"));
			//<input type="radio" name="radiooptions"
			//ng-model="radiovalue" value="FeMale" class="ng-valid ng-dirty ng-valid-parse ng-touched">
			WebElement Female=driver.findElement(By.xpath("//input[@type='radio' and @value='FeMale']"));
			
			 if(row.getCell(5).toString().equalsIgnoreCase("Male"))
			   {
				
			Male.click();
				System.out.println("male button selected");
			}		
		
			else
			{
			
				Female.click();
				System.out.println("female button selected");
			
			
	
			
			
			
		
			}
	
	


			
		}
	}
	
}
