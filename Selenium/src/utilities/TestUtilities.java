package utilities;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class TestUtilities {


	public static   Object[][] getTestdataMethod() throws IOException
	{
		 FileInputStream file = new FileInputStream("C://Users//hp//workspace//Selenium//src//excelsheets//Book1.xlsx");
		                                           
		  XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			 
			 
			
			int rowcount= sheet.getLastRowNum();
			int cellcount = sheet.getRow(0).getLastCellNum();
			 
			
			Object[][] data = new Object[rowcount][cellcount];
			
			
			
			for(int i=0;i<rowcount;i++)
			{
				Row row = sheet.getRow(i+1);
				for (int j=0;j<cellcount;j++)
					
				{
									
					 try{
						 if(row.getCell(j).getCellType() == CellType.NUMERIC)
						 {
							 data[i][j]= String.valueOf((long)row.getCell(j).getNumericCellValue());
							 System.out.println(data[i][j]);
									 
						 }else if (row.getCell(j).getCellType() == CellType.STRING)
						 {
							 data[i][j]= row.getCell(j).getStringCellValue();
							 System.out.println(data[i][j]);
							 
						 }
					 }catch(Exception e)
					 {
				 data[i][j]= "";
					 }
					   
					}
				
				
				
				
				FileOutputStream file1 = new FileOutputStream("C://Users//hp//workspace//Selenium//src//excelsheets//Book1.xlsx");
			    workbook.write(file1);
				
			}
			
			
             
					 
			return data;
	}

	}