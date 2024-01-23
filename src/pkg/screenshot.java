package pkg;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	ChromeDriver driver;
	
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/PRANA/OneDrive/Desktop/webpage.html");
	}
	@Test
	public void test() throws IOException
	{
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s,new File("E://screenshot.png"));
		
		WebElement button=driver.findElement(By.xpath("//input[@type=\"button\"]"));
		File s2=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s2,new File("./screenshot/displaybutton.png"));
	}

}
