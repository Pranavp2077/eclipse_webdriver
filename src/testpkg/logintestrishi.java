package testpkg;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.health_rishi;
import pagepkg.login_rishi;

public class logintestrishi {
public static ChromeDriver driver;
@BeforeTest
public void setUp()
{
driver=new ChromeDriver();
driver.get("https://rishiherbalindia.linker.store/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

}
@Test(priority=0)
public void testloginone() throws Exception
{
login_rishi ob=new login_rishi(driver);
ob.setvalues("pranavp0000@gmail.com","Terminator123");
ob.login();
}

@Test(priority=1)
public void testlogintwo() throws Exception
{
	health_rishi ob=new health_rishi(driver);
	ob.setvalues("2", "how much quantity available");
	ob.login();
}
}
