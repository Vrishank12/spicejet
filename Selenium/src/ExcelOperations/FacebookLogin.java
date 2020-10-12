package ExcelOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws IOException {
		String facebook_url="http://facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "C://Users//hp//workspace//Selenium//DriverFiles//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
		driver.get(facebook_url);
		
	    FileInputStream file = new FileInputStream("C://Users//hp//workspace//Selenium//src//excelsheets//FacebookLogin.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
	    
		
		int rowCount	=sheet.getLastRowNum();
		
		
		for(int i=1;i<=rowCount;i++)
		{
			Row row=sheet.getRow(i);
			
			driver.navigate().refresh();

		//*[@id="email"]---email
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(row.getCell(0).getStringCellValue());
		//*[@id="pass"]----pass
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(row.getCell(0).getStringCellValue());
	}

	}
}

