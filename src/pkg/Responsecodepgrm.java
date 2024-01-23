package pkg;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Test;

public class Responsecodepgrm {
 String link="https://moz.com/top500";
 
 @Test
 public void test()
 {
	 try
	 {
		 URL u=new URL(link);
		 HttpURLConnection con=(HttpURLConnection)u.openConnection();
		 int code=con.getResponseCode();
		 System.out.println(code);
		 
		 if(code==200)
		 {
			 System.out.println("response code is 200");
		 }
		 else
		 {
			 System.out.println("not 200");
		 }
	 }
	 catch(Exception e)
	 {
		 
	 }
 }
}
