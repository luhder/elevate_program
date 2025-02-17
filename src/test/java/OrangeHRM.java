import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHRM {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		
	 driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
	
		
	}
	
	@Test(priority = 1)
	public static void login() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Test(priority = 2)
	public static void adminPage() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > aside:nth-child(1) > nav:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(1) > a:nth-child(1) > svg:nth-child(1)")).click();
		
		WebElement addEmployee = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
		
		addEmployee.click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Job']")).click();//Navigate to the job section
		
		driver.findElement(By.xpath("//a[normalize-space()='Job Titles']")).click();//select the job title
		
		driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();//add job title
		
		//Job title creation
		
		WebElement jobTitle = driver.findElement(By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']"));
		jobTitle.sendKeys("SDET-1");
		
		WebElement jd = driver.findElement(By.xpath("//textarea[@placeholder='Type description here']"));
		
		jd.sendKeys("Conduct manual testing and prepare proper document for each stage");
		
		WebElement note = driver.findElement(By.xpath("//textarea[@placeholder='Add note']"));
		note.sendKeys("The interview will be start from March");
		
		WebElement save = driver.findElement(By.xpath("//button[normalize-space()='Save']"));
		save.click();
		
		System.out.println("Job created successfully");
		
		
	}
	
	@Test(priority = 3)
	public static void leavePage() {
		
		driver.findElement(By.cssSelector("body > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > aside:nth-child(1) > nav:nth-child(1) > div:nth-child(2) > ul:nth-child(2) > li:nth-child(3) > a:nth-child(1) > svg:nth-child(1)")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Apply']")).click();//Leave	
		
	}
	

}
