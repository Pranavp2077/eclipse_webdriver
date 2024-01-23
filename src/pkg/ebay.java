package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ebay {
	ChromeDriver driver;

	@Before
	public void Open()
	{
	driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
		}
	@Test
	public void Titleverfication()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String src=driver.getPageSource();
		if(src.equals("Ebay.com"))
		{
			System.out.println("present");
		}
		else
		{
			System.out.println("not present");
			
		}
		
	
	driver.findElement(By.xpath("//button[@id=\"gh-shop-a\"]")).click();
	driver.findElement(By.xpath("//table[@id='gh-sbc']/tbody/tr/td/ul/li[4]/a[1]")).click();
	
	//driver.findElement(By.xpath("//*[@id='s0-28-9-0-1[0]-0-2-0-title'] [contains(text(),'Shop by Category')]"));
			//driver.find_element_by_xpath("//tag [contains( text(), 'word')]")
	
	driver.findElement(By.xpath("//div[@class=\"b-visualnav__title\"]")).click();
	driver.findElement(By.xpath("//a[@aria-label=\"Your shopping cart\"]")).click();
	
	driver.findElement(By.xpath("//a[@data-test-id=\"start-shopping\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys("Books");
	driver.findElement(By.xpath("//input[@id=\"gh-btn\"]")).click();
	
	}
}


	
	


