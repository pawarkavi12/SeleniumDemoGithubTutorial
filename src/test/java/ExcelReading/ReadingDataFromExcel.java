package ExcelReading;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\Desktop\\Time_Table.xlsx");
		
		XSSFWorkbook xssf = new XSSFWorkbook(fis);  
		XSSFSheet sheet = xssf.getSheet("Employee");
		int RowCount = sheet.getLastRowNum();
		System.out.println(RowCount);
		
		XSSFRow row = sheet.getRow(0);
		int ColCount = row.getLastCellNum();
		System.out.println("total no of colume:"+ColCount );
		
		//String data = sheet.getRow(0).getCell(0).getStringCellValue();
		
		
		  for(int i =0;i<=RowCount;i++)
		  {
		String data =sheet.getRow(i).getCell(0).getStringCellValue();
		System.out.println(data);
		  
		  }
		 
	}

}
