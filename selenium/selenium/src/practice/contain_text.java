package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class contain_text 
{

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://en-gb.facebook.com/");
	
	// forget password
	  //  driver.findElement(By.xpath("//a[contains(text(),'sword')]")).click();
		
	    //creat new a\c
	    driver.findElement(By.xpath("//a[contains(text(),'New ')]")).click();
		
		
		
		
	}
}
