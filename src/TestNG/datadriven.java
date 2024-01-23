package TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datadriven {
ChromeDriver driver;

@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
}

@Test
public void datadriven() throws IOException,InterruptedException
{
	driver.get("https://www.facebook.com");
	FileInputStream f=new FileInputStream("C:\\Users\\PRANA\\OneDrive\\Desktop\\Book1.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet s=wb.getSheet("Sheet1");
	int rowcount=s.getLastRowNum();
	for(int i=1;i<=rowcount;i++)
	{
		String username=s.getRow(i).getCell(0).getStringCellValue();
		String password=s.getRow(i).getCell(1).getStringCellValue();
		System.out.println("username="+username+"/n"+"password="+password);
		//driver.findElement(By.name("username")).clear();
		//Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys(username);
		driver.findElement(By.name("pass")).sendKeys(password);
		driver.findElement(By.name("login")).click();
		
	}
	
	
}
}
