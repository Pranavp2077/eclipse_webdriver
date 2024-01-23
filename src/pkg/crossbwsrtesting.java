package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class crossbwsrtesting {
	
WebDriver driver;
@Parameters("browser")
@BeforeTest
public void setUp(String browser)
{
	if(browser.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox"))
	{
		driver=new FirefoxDriver();
	}
	else
	{
		driver=new EdgeDriver();
	}
}
@Test
public void testone()
{
driver.get("https://www.youtube.com/");	
driver.quit();
}
}
