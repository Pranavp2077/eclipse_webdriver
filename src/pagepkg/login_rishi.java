package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_rishi {
	ChromeDriver driver;
	
	//By rhlogin=By.name("My Account");
	
	By rhaccnt=By.xpath("//*[@id=\"top-links\"]/ul/li[1]");
	By rhlogin=By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a");
	By rhemail=By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input");
	By rhpswd=By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input");
	By rhloginbutton=By.xpath("//*[@id=\"cont-login-with-email\"]/form/button[1]");
public login_rishi(ChromeDriver driver) throws Exception
{
	this.driver=driver;	
	driver.findElement(rhaccnt).click();
	driver.findElement(rhlogin).click();
	Thread.sleep(1000);
}
public void setvalues(String email,String pswd) 
{
	
	driver.findElement(rhemail).sendKeys(email);
	driver.findElement(rhpswd).sendKeys(pswd);
	
}
public void login()
{
	driver.findElement(rhloginbutton).click();
}

}

