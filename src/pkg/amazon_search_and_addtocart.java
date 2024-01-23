package pkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class amazon_search_and_addtocart {
	ChromeDriver driver;

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_8b9xsvs1gj_b&adgrpid=136127568877&hvpone=&hvptwo=&hvadid=617721249835&hvpos=&hvnetw=g&hvrand=11732184071197956811&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007776&hvtargid=kwd-29089840&hydadcr=5716_2362046&gclid=CjwKCAiAhJWsBhAaEiwAmrNyq-BuXC9hJaJiBfs-b-_E0Y7y2jL41coiM5-XeHYwWGIM5yXF0CsCcxoCXbgQAvD_BwE");
		driver.manage().window().maximize();
		
	}
	@Test
	public void test() 
	{
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile phones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		if(driver.getTitle()=="Amazon.in:mobile phones")
		{
			System.out.println("title is same");
		}
		else
		{
			System.out.println("title not same");
		}
		
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		
		for (String handle : allWindowHandles)
		{
			if (!handle.equalsIgnoreCase(parentWindow))
			{
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
				driver.switchTo().window(handle);
				//js.executeScript("window.scrollBy(0,250)", "");
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")));
				driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).click();
				
			} 
			
		}
		
		
		
		
		
	}
		
		
	}
		
		

