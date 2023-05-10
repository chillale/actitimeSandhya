package genericUtility1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelFile {
	public static String readDataFromExcel(String sheetNumber, int rowNum, int cellNum) throws Throwable {
		FileInputStream fileInputStream = new FileInputStream("./Vtiger.xlsx");
		Workbook workBook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workBook.getSheet(sheetNumber);
         Row row = sheet.getRow(rowNum);
         Cell cell = row.getCell(cellNum);
         String value = cell.getStringCellValue();
         return value;
		
	}
	public static int getLastRowCount(String sheetNum) throws Throwable{
		FileInputStream fileInputStream = new FileInputStream("./Vtiger.xlsx");
		Workbook workBook = WorkbookFactory.create(fileInputStream);
		return workBook.getSheet(sheetNum).getLastRowNum();
	}

}
