package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printtileforlink {
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
	  for (WebElement webElement : linkdetails) {
          String name = webElement.getText();
          String link = webElement.getAttribute("href");
          System.out.println("Text="+name);
          System.out.println("link="+link);
	}}}


