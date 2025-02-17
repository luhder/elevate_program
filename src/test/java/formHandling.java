import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class formHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://magento.softwaretestingboard.com/");
		
		driver.findElement(By.xpath("//div[@class='panel header']//a[normalize-space()='Create an Account']")).click();
		
		//First Name
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Abc");
		
		//Last Name
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("efg");
		
		//Mail
		driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("Abcdemofortesting@gmail.com");
			
		//password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("AbcPassord123456=");
		
		//confirm password
		driver.findElement(By.xpath("//input[@id='password-confirmation']")).sendKeys("AbcPassord123456=");
		
		//Submit button
		driver.findElement(By.xpath("//button[@title='Create an Account']//span[contains(text(),'Create an Account')]")).click();
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("https://magento.softwaretestingboard.com/customer/account/")) {
			System.out.println("Account Created Suucessfully");
		}
		else {
			System.out.println("Account creation Failed");
		}
		

	}

}
