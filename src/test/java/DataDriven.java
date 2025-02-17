import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DataDriven {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		Thread.sleep(2000);
		
		WebElement usernameField = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		
		WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	
		
	}

}
