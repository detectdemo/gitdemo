package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class send 
{

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();

		driver.get("https://en-gb.facebook.com/");
		
	//	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("abc");
	//	driver.findElement(By.xpath("//input[@type=\"text\"]")).clear();
	//	driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("xyz");
		
	WebElement UN=	driver.findElement(By.xpath("//input[@type=\"text\"]"));
	
	UN.sendKeys("abc");
	Thread.sleep(2000);
	UN.clear();
	UN.sendKeys("xyz");
	
	
	
	}
	
	
	
}
