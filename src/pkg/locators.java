package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators {
ChromeDriver driver;
String baseurl="https://m.facebook.com/";
@Before
public void locators()
{
	driver=new ChromeDriver();
	driver.get(baseurl);
}

@Test
public void inspect()
{
driver.findElement(By.name("email")).sendKeys("Pranavp0000@gmail.com");
driver.findElement(By.name("pass")).sendKeys("newpassword");
driver.findElement(By.name("login")).click();
}

}
