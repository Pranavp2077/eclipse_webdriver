package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class firstseliniumscript {

	public static void main(String[] args) {

String expectedtitle=("instagram");
ChromeDriver driver=new ChromeDriver(); //to launch browser
driver.get("https://www.instagram.com/");
String actualtitle=driver.getTitle();  //store title of page to a string
System.out.println(actualtitle);

if(expectedtitle.equals(actualtitle))   //check both string are same
{
	System.out.println("both are same");	
}
else
{
	
	System.out.println("not same");
	}

driver.quit(); //quit browser
	}
	

}
