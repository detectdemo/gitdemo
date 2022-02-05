package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample5 {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		//driver.close();
		//driver.quit();
	driver.navigate().to("https://www.google.com/");
//driver.navigate().to("https://en-gb.facebook.com/");
		
		//driver.navigate().back();
		//driver.navigate().forward();
		//Thread.sleep(3000);
		//driver.navigate().refresh();
		//Thread.sleep(3000);
	    //Dimension d=new Dimension(10, 10);
	     // driver.manage().window().setSize(d);
	     // Dimension d1=driver.manage().window().getSize();
	    //  System.out.println(d1);
		
 Point d2=new Point(100,200);
			
		driver.manage().window().setPosition(d2);
	      
	    Point d4=driver.manage().window().getPosition();
	    System.out.println(d4);
	  String title=driver.getTitle();
	  System.out.println(title);
	  
	  String url=driver.getCurrentUrl();
	  System.out.println(url);
		
	  
	  String actTitle=driver.getTitle();
	 
	  String expTitle="Google";
	  
	  if(actTitle.equals(expTitle))
			  {
		  
		  System.out.println("pass");
			  }
	  else
	  {
		  System.out.println("fail");
	  }
		
		
		
		
	}

}
