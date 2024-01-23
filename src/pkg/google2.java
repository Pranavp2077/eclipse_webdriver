package pkg;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class google2 {
ChromeDriver driver;

@Before
public void setUp()
{
driver=new ChromeDriver();
driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}

@After
public void check()
{
	String btntext=driver.findElement(By.xpath("//input[@type=\"button\"]")).getAttribute("value");	
	String actualname="Check Availability";
	
	if(btntext==actualname)
	{
	System.out.println("same");
	}
	else
	{
		System.out.println("not same");
	}
}
}








