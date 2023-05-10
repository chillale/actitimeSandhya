package excelValidating;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel1 {
	
	public static void main(String[] args) throws Throwable {
		FileInputStream fileInputStream = new FileInputStream("./EmpData.xlsx");
		Workbook workBook = WorkbookFactory.create(fileInputStream);
		Sheet sheet = workBook.getSheet("sheet2");
        int lastRow=sheet.getLastRowNum();
        for(int i=1;i<=lastRow;i++) {
        	int marks=(int) sheet.getRow(i).getCell(3).getNumericCellValue();
        	if(marks>300) {
        	    String value = sheet.getRow(i).getCell(1).getStringCellValue();
        	    System.out.println(value);
        	}
        }
	}

}
