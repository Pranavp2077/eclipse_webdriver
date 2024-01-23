package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class testloginurlcheck {
	ChromeDriver driver;

	@BeforeTest
	public void beforeTest()
	{
	driver=new ChromeDriver();
	driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@Test
	public void titleverification()
	{
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("student");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		
		String exp="https://practicetestautomation.com/logged-in-successfully/";
		System.out.println(exp);
		System.out.println(driver.getCurrentUrl());
		String act=driver.getCurrentUrl();
		if(exp.equals(act))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
	}
}
