package atribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_text1 
{

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("hgfdd");
		//create new a\c by attribute
		driver.findElement(By.xpath("//a[@rel=\"async\"]")).click();
	
		
		
		
		
	}
}
