package questions;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file = new FileInputStream("F:\\Excel\\Registration.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		
		for(int i=0;i<rows;i++) {
			XSSFRow row = sheet.getRow(i);
			
			for(int j=0;j<cols;j++) {
				XSSFCell cell = row.getCell(j);
			    switch(cell.getCellType()) {
			    case STRING: System.out.print(cell.getStringCellValue()); break;
			    case NUMERIC: System.out.print(cell.getNumericCellValue()); break;
			    
			    }
			  System.out.print(" | ");
			}
			System.out.println();
		}

	}

}
