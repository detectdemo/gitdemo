package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class text 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://en-gb.facebook.com/");
	//forget paasword
	//  driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		
		
		
		
		
		
		
		
	}
}
