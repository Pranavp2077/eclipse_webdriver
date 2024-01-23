package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	ChromeDriver driver;
	

	@Before
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("https://moz.com/top500");
	}

	@Test
	public void test() {
	  List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
	  System.out.println("total no of links="+linkdetails.size());
	
	}}


