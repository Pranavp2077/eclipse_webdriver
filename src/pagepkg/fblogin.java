package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogin {
ChromeDriver driver;

By fbemail=By.id("email");
By fbpswd=By.id("pass");
By fbloginbuttton=By.name("login");

public fblogin(ChromeDriver driver){
	this.driver=driver;
}

public void setvalues(String email,String pswd)
{
	driver.findElement(fbemail).sendKeys(email);
	driver.findElement(fbpswd).sendKeys(pswd);
	}
public void login()
{
	driver.findElement(fbloginbuttton).click();
}
}
