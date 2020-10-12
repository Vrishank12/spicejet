package testUtilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestFb {


	public static   Object[][] getTestdataMethod() throws IOException
	{
		 FileInputStream file = new FileInputStream("C://Users//hp//workspace//Selenium//src//excelsheets//FacebookLogin.xlsx");
		  XSSFWorkbook workbook = new XSSFWorkbook(file);
			//XSSFSheet sheet = workbook.getSheet("Sheet1");
			 XSSFSheet sheet = workbook.getSheetAt(0);
			 
			
			int rowcount= sheet.getLastRowNum();
			int cellcount = sheet.getRow(0).getLastCellNum();
			 
			
			Object[][] data = new Object[rowcount][cellcount];
			
			
			for(int i=0;i<rowcount;i++)
			{
				Row row = sheet.getRow(i);
				for (int j=0;j<cellcount;j++)
					
				{
									
					  data[i][j] = sheet.getRow(i+1).getCell(j).toString();
					  System.out.print(" "+ data[i][j]);
					 
				} 
				
		       System.out.println();  
				//sheet.getRow(i+1).createCell(2).setCellValue("pass");
				
				}
//			  FileOutputStream file1 = new FileOutputStream("C://Users//siva//Desktop//Venkat//com.Selenium//src//com//ExcelSheets//FacebookLogin.xlsx");
//			    workbook.write(file1);
				
		 
			return data;
	}

 
	 
}
