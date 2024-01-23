package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdownselectvaluerediff {
ChromeDriver driver;
	

	@Before
	public void setUp()
	{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@Test
	public void test() 
	{
		
		//driver.findElement(By.xpath("//label[@for=\"apb-browse-refinements-checkbox_0\"]")).click();
		Select drpMonth = new Select(driver.findElement(By.xpath("//table[2]/tbody/tr[22]/td[3]/select[2]")));
		drpMonth.selectByVisibleText("FEB");
		
		Select drpDay = new Select(driver.findElement(By.xpath("//table[2]/tbody/tr[22]/td[3]/select[1]")));
		drpDay.selectByValue("02");
}
}