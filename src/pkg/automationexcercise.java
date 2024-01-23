package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automationexcercise {
	ChromeDriver driver;

	@Before
	public void open()
	{
	driver=new ChromeDriver();
	driver.get("https://automationexercise.com/login");
	driver.manage().window().maximize();
	 List<WebElement> linkdetails=driver.findElements(By.tagName("a"));
	  System.out.println("total no of links="+linkdetails.size());
	}

	@Test
	public void test()
	{
		if(driver.findElement(By.xpath("//a/img[@src=\"/static/images/home/logo.png\"]")).isDisplayed())
		{
		System.out.println("logopresent");
		}
		else
		{
		System.out.println("logo not present");	
		}
	}
	@Test
	public void testtwo()
	{
	driver.findElement(By.xpath("//form/input[@type=\"text\"]")).sendKeys("pranav prakash");
	driver.findElement(By.xpath("//form/input[@data-qa=\"signup-email\"]")).sendKeys("pranav123@gmail.com");
	driver.findElement(By.xpath("//form/button[@data-qa=\"signup-button\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("pranav@5825");
	Select drpDay = new Select(driver.findElement(By.xpath("//select[@id=\"days\"]")));
	drpDay.selectByVisibleText("10");
	Select drpMnt = new Select(driver.findElement(By.xpath("//select[@id=\"months\"]")));
	drpMnt.selectByVisibleText("April");
	Select drpYr = new Select(driver.findElement(By.xpath("//select[@id=\"years\"]")));
	drpYr.selectByVisibleText("1998");
	
	
	driver.findElement(By.xpath("//input[@id=\"first_name\"]")).sendKeys("PRANAV");
	driver.findElement(By.xpath("//input[@id=\"last_name\"]")).sendKeys("PRAKASH");
	driver.findElement(By.xpath("//input[@id=\"company\"]")).sendKeys("LUMINAR");
	driver.findElement(By.xpath("//input[@id=\"address1\"]")).sendKeys("PRANAVAM");
	driver.findElement(By.xpath("//input[@id=\"address2\"]")).sendKeys("Alimukku");
	driver.findElement(By.xpath("//input[@id=\"state\"]")).sendKeys("Kerala");
	driver.findElement(By.xpath("//input[@id=\"city\"]")).sendKeys("Punalur");
	driver.findElement(By.xpath("//input[@id=\"zipcode\"]")).sendKeys("689696");
	driver.findElement(By.xpath("//input[@id=\"mobile_number\"]")).sendKeys("Alimukku");
	driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]")).click();	
	}
		  
	
	{
		
	}
		
		  
}
	