import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class login {

		// TODO Auto-generated method stub
	
		public static WebDriver driver = new ChromeDriver();
		
		@BeforeClass
		public static void setup() {
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		}
		
		@Test (priority = 1)
		public static void validlogin() throws InterruptedException {
			
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Logout
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		
		}
		
		@Test(priority = 2)
		public static void invalidLogin() throws InterruptedException {
			
			
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("ASDFGHJKL");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("asdfghjkl");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		WebElement errormsg = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']"));
		
		Assert.assertEquals("Invalid credentials", errormsg.getText());
		
		}
		
	

}
