package webdriver_Method;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_get 
{

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
	}
}
