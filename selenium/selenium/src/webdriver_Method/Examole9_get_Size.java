package webdriver_Method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Examole9_get_Size
{

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		  Dimension d2=driver.manage().window().getSize();
		System.out.println(d2);
		
		driver.manage().window().maximize();
		
		Dimension d3= driver.manage().window().getSize();
		System.out.println(d3);
		
		
		
		
		
		
		
	}
}
