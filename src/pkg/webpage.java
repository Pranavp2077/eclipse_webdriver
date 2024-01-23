package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpage {
	ChromeDriver driver;
	
	@Before
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/PRANA/OneDrive/Desktop/webpage.html");
		
	}
	@Test
	public void input() throws Exception
	{
		driver.findElement(By.xpath("//input[@type=\"button\"]")).click();
		Thread.sleep(1000);
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		a.accept();
		System.out.println("alert text="+alerttext);
		//a.dismiss() for cancel alert
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("PRANAV");
		driver.findElement(By.xpath("//input[@type=\"test\"]")).sendKeys("PRAKASH");
		
	}
	
}
