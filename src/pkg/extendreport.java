package pkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import junit.framework.Assert;

public class extendreport {
ChromeDriver driver;
String baseurl="https:www.facebook.com";
ExtentHtmlReporter reporter;
ExtentTest test;
ExtentReports extent;

@BeforeTest
public void veftest()
{
	reporter=new ExtentHtmlReporter("./reports/myreport1.html");
	reporter.config().setDocumentTitle("Automationreport");
	reporter.config().setReportName("functional test");
	//reporter.config().setTheme(Theme.Dark);
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("hostname", "localhost");
	extent.setSystemInfo("os", "windows10");
	extent.setSystemInfo("testername", "abc");
	extent.setSystemInfo("browser name", "chrome");
	driver=new ChromeDriver();
}
@BeforeMethod
public void setup()
{
driver.get("https://www.facebook.com/");	
}

@Test
public void fbtitleverification() throws Exception
{
test=extent.createTest("fbtitleverification");
String Exp="Facebook – log in or sign up";

String actual=driver.getTitle();
System.out.println(actual);
Assert.assertEquals(Exp, actual);
System.out.println("hello");
}

@Test
public void fblogotest() throws IOException
{
test=extent.createTest("fblogoTest");
boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
Assert.assertTrue(b);


}
@AfterTest
public void teardown()
{
extent.flush();
}

@AfterMethod
public void browserclose(ITestResult result) throws IOException
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		test.log(Status.FAIL,"TEST CASE FAILED IS"+result.getName());
		test.log(Status.FAIL,"TEST CASE FAILED IS"+result.getThrowable());
		String screenshotpath=screenshotMethod(driver,result.getName());
		test.addScreenCaptureFromPath(screenshotpath);
	}
	else if(result.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.SKIP,"TEST CASE IS SKIPPED IS"+result.getName());
	}
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS,"TEST CASE IS PASSED IS"+result.getName());
	}
		
	}

public static String screenshotMethod(ChromeDriver driver,String screenshotname) throws IOException
{	
	File src=((TakesScreenshot)driver.getScreenshotAs(OutputType.FILE));
	
	String destination="./Screenshot/"+screenshotname +".png";
	//File finaldestinaton=new File(destination);
	//FileHandler.copy(src, new File(destination));
	return destination
}
}