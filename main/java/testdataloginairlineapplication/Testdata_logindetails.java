package testdataloginairlineapplication;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Testdata_logindetails {
public static String mobileno;
public static String mail;
public static void  data() throws EncryptedDocumentException, IOException
{
	FileInputStream fs=new FileInputStream("C:\\Users\\HARI\\eclipse-workspace\\MavenProjects\\test-output\\Airlinelogindetails.xlsx");
	Workbook wf=WorkbookFactory.create(fs);
	mobileno=NumberToTextConverter.toText(wf.getSheet("Sheet1").getRow(1).getCell(0).getNumericCellValue());
	mail=wf.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
}
}
