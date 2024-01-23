package pkg;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class fileuploadwindowhandle {
ChromeDriver driver;

@BeforeTest
public void beforeTest()
{
driver=new ChromeDriver();	
}

@Test
public void main() throws IOException,Exception
{
	driver.get("https://smallpdf.com/pdf-to-excel");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/header/div[2]/div/div/label/div/div[2]/form/label/div/div[2]/button[1]/span")).click();
	Thread.sleep(3000);
	Runtime.getRuntime().exec("C:\\Users\\PRANA\\OneDrive\\Desktop\\T1.exe");
	Thread.sleep(3000);
}
}
