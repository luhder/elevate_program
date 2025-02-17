import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement alert1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		
		alert1.click();
		
		Thread.sleep(2000);
		
		String msg= driver.switchTo().alert().getText();
		
		driver.switchTo().alert().accept();
		
		System.out.println(msg + " Alert handled sucessfully");
		
		driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
		
		WebElement alert2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		
		alert2.click();
		
		driver.switchTo().alert().dismiss();
		
		System.out.println(alert2.getText()+" Alert handled successfully");
		
		

		
	}

}
