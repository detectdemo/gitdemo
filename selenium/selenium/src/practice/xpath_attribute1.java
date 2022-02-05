package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class xpath_attribute1 
{


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		 
	    //driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("abc");
	    //driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("1234");
	   // driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
	    driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
	    
	    
	    
				
	}
}
