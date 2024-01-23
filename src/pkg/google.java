package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {
ChromeDriver driver;

@Before
public void Open()
{
driver=new ChromeDriver();
	}

@Test
public void test()
{
driver.get("https://www.google.com/");	
driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("books");
driver.findElement(By.xpath("//input[@value='Google Search']")).click();


}
	}


