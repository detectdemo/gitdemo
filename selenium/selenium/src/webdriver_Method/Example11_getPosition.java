package webdriver_Method;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example11_getPosition {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe ");
		
		
		
		WebDriver driver =new ChromeDriver();
		
    
		driver.get("https://www.google.com/");
		
		//GET POSITION
		Point d4=driver.manage().window().getPosition();
		System.out.println(d4);
		
		
	}

}
