package webdriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_close 
{

	public static void main(String[] args) throws InterruptedException {
	
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe" );
		
		
		WebDriver driver=new ChromeDriver();
		
		
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
	}
}
