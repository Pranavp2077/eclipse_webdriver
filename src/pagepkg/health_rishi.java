package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class health_rishi {
	ChromeDriver driver;
	
	
	By rhhealth=By.xpath("//*[@id=\"menu\"]/ul/li[2]/a");
	By rhsortdwn=By.xpath("//*[@id=\"input-sort\"]");
	By rhselect=By.xpath("//*[@id=\"input-sort\"]/option[2]");
	By enq=By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[2]/button/span");
	By qty=By.xpath("//*[@id=\"Quantity\"]");
	By enqwrite=By.xpath("//*[@id=\"Enquiry\"]");
	By send=By.xpath("//*[@id=\"sendEnquiryModal\"]/div/div/div[3]/button");
	

public health_rishi(ChromeDriver driver) throws Exception
{
	this.driver=driver;	
	Thread.sleep(3000);
	driver.findElement(rhhealth).click();
	driver.findElement(rhsortdwn).click();
	driver.findElement(rhselect).click();
	driver.findElement(enq).click();
	
	
}
public void setvalues(String quantity,String write) 
{
	
	driver.findElement(qty).sendKeys(quantity);
	driver.findElement(enqwrite).sendKeys(write);
	
}
public void login()
{
	driver.findElement(send).click();
}
}