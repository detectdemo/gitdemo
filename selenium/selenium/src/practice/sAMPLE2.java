package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sAMPLE2 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new  ChromeDriver();
		
		//driver.get("https://www.youtube.com/");
		
		//driver.close();
		//driver.quit();
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().to("https://www.youtube.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.quit();
		
		
	}
	
	
}
