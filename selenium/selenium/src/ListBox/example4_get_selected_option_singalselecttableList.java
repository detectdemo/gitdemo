package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example4_get_selected_option_singalselecttableList 
{

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");		
		
		
		WebDriver driver=new ChromeDriver();
		

		
		//enter url
		driver.get("https://en-gb.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		Thread.sleep(2000);

		
	WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		
	Select s=new Select(month);
	//	WebElement selectoption = s.getFirstSelectedOption();
//	String text = selectoption.getText();
		
		//System.out.println(text);
		
	String	text1=s.getFirstSelectedOption().getText();
		
		
		System.out.println(text1);
		
		
	}
}
