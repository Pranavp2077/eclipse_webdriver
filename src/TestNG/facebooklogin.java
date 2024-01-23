package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class facebooklogin {
ChromeDriver driver;

@BeforeTest
public void driverload()
{
driver=new ChromeDriver();
}
@BeforeMethod
public void urlload()
{
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
}
@Parameters({"un","ps"})
@Test(priority=1)
public void testone(String un,String ps)
{
driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(un);
System.out.println("username passed success");
driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(ps);	
System.out.println("password passed success");
driver.findElement(By.xpath("//*[@id=\"u_0_5_fZ\"]")).click();
}

@Test(priority=2)
public void testtwo()
{
	
driver.findElement(By.xpath("//*[@id=\"u_0_5_fZ\"]")).click();	
System.out.println("click successfull");
}
@AfterMethod
public void aftermtd()
{
System.out.println("success");
}
}
