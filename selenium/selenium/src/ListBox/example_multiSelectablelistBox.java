package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example_multiSelectablelistBox {



	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/vijay/Documents/n/list1.html");
		
		
		
		WebElement list = driver.findElement(By.xpath("//select[@multipal=\"true\"]"));
		
		Select s= new Select(list);
		
	//	s.selectByVisibleText("ind");
	//	s.selectByIndex(2);
	     Thread.sleep(2000);
		s.deselectByVisibleText("ind");
		s.selectByIndex(1);
		
		
		
		
		
		
		
		
	}
}
