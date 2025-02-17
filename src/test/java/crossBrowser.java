import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class crossBrowser {
 public static void main(String[] args) {
	         testBrowser("chrome");
	         testBrowser("firefox");
	        
	     
 }

	     public static void testBrowser(String browser) {
	         WebDriver driver = null;

	             switch (browser) {
	                 case "chrome" :  driver = new ChromeDriver();
	                     break;
	                 case "firefox": driver = new FirefoxDriver();
	                     break;
	                 default:
	                     System.out.println("Invalid browser: " + browser);
	                     return;
	             }
	             driver.manage().window().maximize();
	             
	             // Set an implicit wait
	             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	             // Navigate to the test website
	             driver.get("https://www.flipkart.com/");

	            System.out.println("The website opened in "+browser+" browser");
	          
	       
	         }
	     
	 

}

