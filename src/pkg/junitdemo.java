package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitdemo {
	ChromeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
	}
	@Test
	public void Titleverfication()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void Usrc()  //run by method alphabet order 
	{
		String src=driver.getPageSource();
		if(src.contains("Cody Fajardo"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
		}
	}
	@After
	public void Teardown()
	{
		driver.quit();
	}
}
