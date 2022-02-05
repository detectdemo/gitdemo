package webdriver_Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example7_getUrl 
{

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//det url
	   String url =driver.getCurrentUrl();
		
		System.out.println(url);  //https://www.google.com/
		
		
		
		
		
	}
}
