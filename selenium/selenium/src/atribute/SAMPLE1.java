package atribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SAMPLE1 
{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	//	driver.findElement(locator)---> locator types--->xpath
	//	driver.findElement(By.xpath(xpathExpression))---->xpath by attribute
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ABC");
		
		
		driver.findElement(By.xpath("//input[@name=\"pass\"]")).sendKeys("vinod");
		
		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
		
		
	}
}
