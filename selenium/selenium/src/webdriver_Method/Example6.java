package webdriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example6_getTitle

{

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
				 //cheack act and excp title

		//get title
		 String title=driver.getTitle();
		 System.out.println(title);     //Google
		 
           // cheack title
		  String actTitle =driver.getTitle();
		  String expTitle ="Google";
		  
		  if(actTitle.equals(expTitle))
		  {
			  System.out.println("pass"); //pass
		  }
		  else
		  {
			  System.out.println("fail");
		  }
	}
}
