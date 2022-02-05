import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class other_xpath {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();

		driver.get("file:///C:/Users/vijay/Documents/n/xpathtext.html");
		
	//	driver.findElement(By.xpath("//input[@id=\"1232\"]")).sendKeys("abc");
		
	//	driver.findElement(By.xpath("//input[@id=\"126\"]")).sendKeys("xyz");
		driver.findElement(By.linkText("facebook")).click();
		
		
		
	}
}
