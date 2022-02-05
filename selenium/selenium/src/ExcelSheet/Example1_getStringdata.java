package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example1_getStringdata 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
	
		FileInputStream file=new FileInputStream("C:\\Users\\vijay\\Book1.xlsx");
		
		
	Workbook book = WorkbookFactory.create(file);
		
	Sheet sh = book.getSheet("Book1");
		
Row rw = sh.getRow(0);
		
		
		Cell cl = rw.getCell(0);
		
		String value = cl.getStringCellValue();
		
		System.out.println(value);
		
	}
	
}
