package practice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdricer 
{

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vijay\\selenium\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		//driver.navigate().to("https://en-gb.facebook.com/");
		//driver.get("https://www.google.com/search?q=nature&rlz=1C1ONGR_enIN944IN944&sxsrf=AOaemvJhdN5qcY48qA5wVzMjtNJ4mT6COw:1632649188580&tbm=isch&source=iu&ictx=1&fir=HfNKSByD0ISavM%252CzlPyDhWqicGhNM%252C_%253BVE7AiPlReOUUcM%252CBgwJO-fS-rcTUM%252C_%253BUAwBuHU_B9UiXM%252CWdc2RwTDh0HtEM%252C_%253Br5CavR1d3332DM%252CkTscBPJzXBAiXM%252C_%253BQC4wivayEDSXIM%252C8nXU_Ux1qkbBuM%252C_%253B7R70dX6q9IWSRM%252CSCzx4CWv1GhJCM%252C_%253BYhKme_VKhRy1PM%252CXiPjPRd_81FYMM%252C_%253BF1DjOPZ35KDnvM%252CfarmmKaY0LvsEM%252C_%253BOlqrKFapGVbfjM%252CZy0GNc2pQn7vzM%252C_%253BCttyWvj6nW8cFM%252CIa245SWV3q9jcM%252C_&vet=1&usg=AI4_-kQ7WiubiBlmRTcGn3rdatsqyeFHlw&sa=X&ved=2ahUKEwjB5LWXrJzzAhWY9nMBHc9gAqoQ9QF6BAhdEAE&cshid=1632649194340281#imgrc=r5CavR1d3332DM");
		
		//driver.navigate().back();
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		String title=driver.getTitle();
		String ecptitle="nature - Google Search";
				
		
		//if(title.equals(ecptitle))
		//{
		//	System.out.println("pass");
	//	}
		//else
		////	System.out.println("fail");
		//}
	//	System.out.println(title);
		
	
	//	String url=driver.getCurrentUrl();
	//	System.out.println(url);
		
	//	driver.manage().window().maximize();
		
		
       Dimension d=new Dimension(100, 200);
       driver.manage().window().setSize(d);

       Dimension d1=driver.manage().window().getSize();
       System.out.println(d1);
       
       Point p=new Point(100,200);
       driver.manage().window().setPosition(p);
       
       Point p1=driver.manage().window().getPosition();
       System.out.println(p1);
       
	
	}
}
