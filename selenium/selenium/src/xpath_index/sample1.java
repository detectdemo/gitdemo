package xpath_index;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		
	  //create new a\c
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		//LN
		driver.findElement(By.xpath("(//input[@type=\"text\"])[3]")).sendKeys("abc");
		//FN
         driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("1234");
		
		
		
		
	}

}
