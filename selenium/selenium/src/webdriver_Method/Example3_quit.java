package webdriver_Method;

import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_quit
{
 public static void main(String[] args) throws InterruptedException {
	
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
	 
	 
	 ChromeDriver driver =new ChromeDriver();
	 
	 driver.get("https://www.facebook.com/");
	 
	 //wait for 3 sec
	 Thread.sleep(3000);
	 driver.quit();
	 
	 
	 
	 
	 
}
}
