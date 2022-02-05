package webdriver_Method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example10_setposition 
{

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		//set size
		Dimension d=new Dimension(100, 200);
		driver.manage().window().setSize(d);
		//get size
		Dimension d1=driver.manage().window().getSize();
		System.out.println(d1);
		
		//set position
		Point d2=new Point(200,400);
		driver.manage().window().setPosition(d2);
		
		
		
		
	}
}
