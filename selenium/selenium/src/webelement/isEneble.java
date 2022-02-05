package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEneble {

	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
       
		
		boolean result =driver.findElement(By.xpath("//button[@value=\"1\"]")).isEnabled();
		
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("element is Enable");
		}
		else
		{
			System.out.println("element is disebal");
		}
		
		
		
		
		
	}
}
