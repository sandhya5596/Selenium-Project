package datadriven_chapter_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException; 
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_FRom_ExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream f = new FileInputStream("./SeleniumExcelFile.xls.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		driver.get(url);
		
		String username = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.id("email")).sendKeys(username);
 
		String password = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		driver.findElement(By.id("pass")).sendKeys(password);

		driver.close();
	}

}
