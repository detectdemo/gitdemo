package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected3 {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
	

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		Thread.sleep(2000);
		WebElement female=driver.findElement(By.xpath("(//input[@type=\"radio\"])[1]"));
 
		             boolean result= female.isSelected();
		
		if(result==true)
		{
			System.out.println("elemenet is alredy selected");
		}
		else
		{
			System.out.println("elemenet is not selected");
			female.click();
			
			boolean result1=female.isSelected();
			
			if(result1==true)
			{
				System.out.println("elemenet is alredy selected");
			}
			else
			{
				System.out.println("elemenet is not selected");
			}
				
				
				
				
		}
	
	
	
	
	
	
	}

}
