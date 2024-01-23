package pkg;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class assertiontitleverify {
ChromeDriver driver;

@BeforeTest
public void beforeTest()
{
driver=new ChromeDriver();
driver.get("https://www.google.com");
}

@Test
public void titleverification()
{
String exp="google";
String title=driver.getTitle();
Assert.assertEquals(title, exp);
System.out.println("hello");
}
}
