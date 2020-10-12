package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 

public class SingleData {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C://Users//hp//workspace//Selenium//src//excelsheets//Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		
		System.out.println(cell.getStringCellValue());
	   
	


	}

}
