package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	ChromeDriver driver;
	

@Before
public void setUp()
{
driver=new ChromeDriver();	
}

@Test
public void test() throws Exception
   
{

driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=676742245123&hvpos=&hvnetw=g&hvrand=3439328853660152546&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007776&hvtargid=kwd-10573980&hydadcr=14453_2367553");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobile");
driver.findElement(By.xpath("*//input[@id='nav-search-submit-button']")).click();

driver.findElement(By.xpath("//div[@id='nav-tools']/a[4]")).click();
driver.findElement(By.xpath("//div[@id=\"nav-xshop\"]/a[6]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//label[@for=\"apb-browse-refinements-checkbox_0\"]")).click();



}}