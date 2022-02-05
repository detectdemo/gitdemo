package webdriver_Method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example8_setSize 
{

	 static public void main(String[] args) {
		
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		
		Dimension d= new Dimension(400,700);  //w,h
		driver.manage().window().setSize(d);
		
		Dimension d1=new Dimension(100,200);
		driver.manage().window().setSize(d1);  //w,h
		
	}
}
