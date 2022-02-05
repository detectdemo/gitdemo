package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example_day 
{

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");		
		
		WebDriver driver=new ChromeDriver();
		
		
		//enter url
		driver.get("https://en-gb.facebook.com/");
		
		//click new create a\c
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		Thread.sleep(2000);
		
		//step 1
		WebElement day = driver.findElement(By.xpath("//select[@id=\"day\"]"));
	    //step 2
		Select d =new Select(day);
		
		//step 3
		
	//	 d.selectByIndex(1);
	//	d.selectByValue("3");
		d.selectByVisibleText("27");
		
		
		
		
		
		
		
		
	}
}
