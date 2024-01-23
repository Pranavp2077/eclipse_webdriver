package pkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fileupload {
ChromeDriver driver;

@Test
public void test() throws Exception
{
	driver = new ChromeDriver();
	driver.get("https://smallpdf.com/pdf-to-excel");
	driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[1]/header/div[2]/div/div/label/div/div[2]/form/label/div/div[2]/button[1]/span")).click();
	fileUpload("‪‪C:\\Users\\PRANA\\Downloads\\stylease bug pranav.pdf");
}
public void fileUpload(String p)throws AWTException
{
	StringSelection strSelection = new StringSelection(p);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
	Robot robot = new Robot();
	
	robot.delay(3000);
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_V);
	robot.delay(3000);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_V);
	
	robot.delay(3000);
	
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
}
}
