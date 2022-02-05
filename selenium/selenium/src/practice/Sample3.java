package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 
{

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");

	    WebDriver driver=new ChromeDriver();
	    
	driver.get("https://www.google.com/");
	
	//driver.close();
	//driver.quit();
	
	//driver.navigate().to("https://www.google.com/");
	//driver.navigate(). back();
	//driver.navigate().forward();
	//driver.navigate().refresh();
	String actTitle  = driver.getTitle();
	String ecpTitle="Google";
	
	if(actTitle.equals(ecpTitle))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	driver.manage().window().maximize();
	
	String title=driver.getTitle();
	System.out.println(title);
	

	
	String url =driver.getCurrentUrl();
	System.out.println(url);
	
	
	
	
	
	}
	
}
