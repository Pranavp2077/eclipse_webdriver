package TestNG;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo99doubleclick {
ChromeDriver driver;
@BeforeTest
public void setup()
{
driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/simple_context_menu.html");
}
@Test
public void testone()
{
	Actions act=new Actions(driver);
	
	WebElement edit=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
	WebElement dbl=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	
	act.contextClick(rht);
	act.contextClick(edit);
	
	act.perform();
	Alert a=driver.switchTo().alert();
	String alerttext=a.getText();
	a.accept();
	
	act.doubleClick(dbl);
	act.perform();
	Alert b=driver.switchTo().alert();
	String alerttexttwo=b.getText();
	System.out.println(alerttexttwo);
	
	
	
}
}
