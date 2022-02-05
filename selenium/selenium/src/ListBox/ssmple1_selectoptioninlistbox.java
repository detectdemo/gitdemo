package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ssmple1_selectoptioninlistbox 
{

	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		 Thread.sleep(2000);
        //select month
		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
	    Select s=new Select(month);
		s.selectByIndex(1);
		
		//select day
		WebElement day= driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select s1=new Select(day);
             s1.selectByValue("4");
             s1.selectByVisibleText("7");
		 
		
		
		
		
	}   
}
