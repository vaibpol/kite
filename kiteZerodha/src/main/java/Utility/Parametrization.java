package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {
	
public static String getData (String sheetname,int row, int cell ) throws EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream ("F:\\Automation\\kiteZerodha\\src\\test\\resources\\ABC.xlsx");
	String value = WorkbookFactory.create(file).getSheet("DATA").getRow(row).getCell(cell).getStringCellValue();
	return value;
	
}
	
}
