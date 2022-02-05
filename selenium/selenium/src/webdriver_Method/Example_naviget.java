package webdriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_naviget 
{

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe\\");
		
		
	WebDriver driver =new ChromeDriver();
	
	driver.navigate().to("https://www.facebook.com/");
	//waitfor 3 sec
	Thread.sleep(3000);
	driver.navigate().to("https://www.google.com/search?q=youtub&rlz=1C1ONGR_enIN944IN944&oq=&aqs=chrome.3.69i59i450l8.19966j0j1&sourceid=chrome&ie=UTF-8");
	
	Thread.sleep(3000);
	driver.navigate().back();
	
	Thread.sleep(3000);
	driver.navigate().forward();
	
	Thread.sleep(3000);
	driver.navigate().refresh();
		
	
		
		
		
		
		
		
		
		
	}
}
