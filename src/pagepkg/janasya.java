package pagepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class janasya {

ChromeDriver driver;

	By jenethnic=By.xpath("//*[@id=\\\\\\\"HeaderNavigation\\\\\\\"]/nav/ul/li[3]/a");
	By jenkurthas=By.xpath("//*[@id=\"HeaderNavigation\"]/nav/ul/li[3]/ul/li[3]/a");
	By jencart=By.xpath("//*[@id=\"44199301382314\"]");
	public janasya(ChromeDriver driver){
		this.driver=driver;
	}

	public void testethnic() 
	{			
			
		
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));  //object created
		Actions act=new Actions(driver);
			
		act.moveToElement(jenethnic).perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"mainContent\\\"]/div[1]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
	
		driver.findElement(jenkurthas).click();
}	
	public void testcart() 
	{
		
		driver.findElement(jencart).click();
		
}
}