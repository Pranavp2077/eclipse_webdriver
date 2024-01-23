package pkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class datepicker {
ChromeDriver driver;

@BeforeTest
public void setUp()
{
driver=new ChromeDriver();
driver.get("https://www.trivago.com/");
}

@Test
public void datepickertest()
{
driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div/fieldset/button[1]/span/span[1]")).click();
datepickermethod("April 2024","10");
}

public void datepickermethod(String expmonth,String expdate)
{
	while(true)
	{
		String month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).getText();
		System.out.println(month);
		
		if(month.equals(expmonth))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();		
		}
	}
List<WebElement> alldates=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
for(WebElement datelement:alldates)
{
	String date=datelement.getText();
	if(date.equals(expdate))
	{
		datelement.click();
		break;
	}
}
}
}
