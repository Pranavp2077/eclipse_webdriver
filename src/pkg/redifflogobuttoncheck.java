package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class redifflogobuttoncheck {
ChromeDriver driver;

@Before
public void open()
{
driver=new ChromeDriver();
driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
driver.manage().window().maximize();
}

@Test
public void test()
{
//driver.findElement(By.xpath("*']")).click();
if(driver.findElement(By.xpath("//img[@src=\"/register/pix/redifflogo1.gif\"]")).isDisplayed())
{
System.out.println("present");
}
else
{
System.out.println("not present");	
}

if(driver.findElement(By.xpath("//input[@type=\"submit\"]")).isEnabled())
{
System.out.println("register is present");
}
else
{
System.out.println("not present");	
}
}
}

