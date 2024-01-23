package testpkg;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.fblogin;

public class fblogintest {
public static ChromeDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
@Test
public void testlogin()
{
fblogin ob=new fblogin(driver);
ob.setvalues("bv@gmail.com","adad");
ob.login();

}
}
