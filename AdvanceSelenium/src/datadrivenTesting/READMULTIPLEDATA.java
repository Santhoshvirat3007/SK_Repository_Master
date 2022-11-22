package datadrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class READMULTIPLEDATA
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream FIS=new FileInputStream("./Excel/Testdata.xlsx");
		Workbook book = WorkbookFactory.create(FIS);
		Sheet sh = book.getSheet("Sheet1");
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		for(int i=0;i<links.size();i++)
		{
			Row ro = sh.createRow(i);
			Cell cel = ro.createCell(0);
			cel.setCellValue(links.get(i).getAttribute("href"));
			
		}
		FileOutputStream FOUT=new FileOutputStream("./Excel/Testdata.xlsx");
		book.write(FOUT);
		
	}

}
