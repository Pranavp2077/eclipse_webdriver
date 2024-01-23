package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;


public class TestingDemo {
	ChromeDriver driver;
	@BeforeTest(alwaysRun = true)
	public void driverload()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod(alwaysRun = true)
	public void open()
	{
	
	driver.get("https://www.calculator.net/");
	driver.manage().window().maximize();
	}
	
	@Test
	public void logocheck()
{
		
		String expectedtitle="Calculator.net: Free Online Calculators - Math, Fitness, Finance, Science";		
		String actualtitle=driver.getTitle();  //store title of page to a string
		System.out.println(actualtitle);

		if(expectedtitle.equals(actualtitle))   //check both string are same
		{
			System.out.println("both are same");	
		}
		else
		{
			
			System.out.println("not same");
			}
		
	}
	@Test(priority=1,groups= {"sanity"}) //invocationCount=1
	public void testone()
	{
	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[1]")).click();
	
	}
	@Test(priority=2,groups= {"smoke","sanity"})
	public void testtwo()
	{
	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]")).click();
	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[3]")).click();
	
	
	}
	@Test(priority=3,groups= {"regression"})  //dependsOnMethods="testtwo",enabled=true,
	public void testthree()
	{
	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();	
	driver.findElement(By.xpath("//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
	}
	
	@AfterMethod
	public void aftermtd()
	{
	System.out.println("calculated");
	}
	@AfterTest
	public void teardown()
	{
		System.out.println("browser quit");
		for(int i=0;i<3;i++)
		{
		driver.quit();
		}
	}
}
