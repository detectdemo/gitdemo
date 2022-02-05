package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselected
{

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		Thread.sleep(2000);
		

		boolean femal=driver.findElement(By.xpath("//label[text()=\"Female\"]")).isSelected();
		System.out.println(femal);
		
		if(femal==true)
		{
			System.out.println("element is select");
		}
		else {
			System.out.println("element is not select");
		}
		
		
		
		
		
		
		
	}

}
