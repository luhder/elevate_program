import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class multipleWindow {
	
	public static WebDriver driver = new ChromeDriver();
	
	@BeforeClass
	public static void setup() {
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 1)
	public static void multiple() {
		
		
		
		driver.findElement(By.xpath("//button[@id='openwindow']")).click();
		
		driver.switchTo().frame(0);
		
	}
	

}
