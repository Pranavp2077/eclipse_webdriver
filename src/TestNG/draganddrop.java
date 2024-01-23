package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class draganddrop {
ChromeDriver driver;

@BeforeTest
public void driverload()
{
driver=new ChromeDriver();	


}
@BeforeMethod
public void opensite()
{
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();	
}

@Test
public void testone() 
{
	Actions act=new Actions(driver);
	WebElement bank=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	WebElement sales=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	WebElement fivethsnd=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	WebElement debtacnt=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	WebElement debtamt=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	WebElement crdtacnt=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	WebElement crdtamt=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
	
	act.scrollByAmount(10, 0);
	act.dragAndDrop(bank, debtacnt);
	
	act.dragAndDrop(fivethsnd, debtamt);
	
	act.dragAndDrop(sales, crdtacnt);
	
	act.dragAndDrop(fivethsnd, crdtamt);
	
	act.perform();
	
}

@AfterMethod
public void aftermethod()
{
System.out.println("completed");	
}

@AfterTest
public void aftertest()
{
	
System.out.println("drag and drop completed");
}
}
