package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sample21 
{

	private static final String Takescreenshot = null;

	

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe") ;
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://en-gb.facebook.com/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
System.out.println(src);
		
		
		
		File dest=new File("C:\\Users\\vijay\\selenium\\sc\\sample1.jpg");
		
		
		FileHandler.copy(src, dest);
		
		
		
		
		
		
		
		
		
		
	}
}
