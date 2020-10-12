package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AddDatatoExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C://Users//hp//workspace//Selenium//src//excelsheets//Book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet3");
		
		
		Row row=sheet.createRow(1);
		Cell cell= row.createCell(1);
		
		cell.setCellValue("Hi Aishu and Sree");
		
		
		
		FileOutputStream file1 = new FileOutputStream("C://Users//hp//workspace//Selenium//src//excelsheets//Book1.xlsx");
		workbook.write(file1);


	}

}
