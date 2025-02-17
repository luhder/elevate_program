import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AumationDemoSiteForm {
	public static void main(String[] args) throws InterruptedException {
		
		
		//Create the instance for webdriver
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();//Maximize the window size
		
		driver.get("https://demo.automationtesting.in/Register.html");//Navigate to the URL
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("SampleFirstName");//First name 
		
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("SampleLastName");//Last Name
		
		driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']")).sendKeys("asdfghjklzxcvbnmqwertyuiop");//Address
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("SampleTesingMail@gamil.com");//Mail id
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");//Phone number
		
		driver.findElement(By.xpath("//input[@value='Male']")).click();//Gender
		
		//Hobbies selection
		
		driver.findElement(By.cssSelector("#checkbox1")).click();
		
		driver.findElement(By.cssSelector("#checkbox2")).click();
		
		//Language selection 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[contains(text(),'English')]")));
		
	    
	    //Skills selection
		WebElement skills = driver.findElement(By.id("Skills"));
		
		Select sc =  new Select(skills);
		
		sc.selectByContainsVisibleText("Java");
		
		Thread.sleep(1000);
		
		//Country selection
		
		WebElement country =  driver.findElement(By.cssSelector("span[role='combobox']"));
		
		country.click();
		
		driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("India");
		
		driver.findElement(By.cssSelector("li[role='treeitem']")).click();
		
		//Date of birth
		
		WebElement year = driver.findElement(By.id("yearbox"));
		
		Select yr = new Select(year);
		
		yr.selectByContainsVisibleText("2000");
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		
		Select mon = new Select(month);
		
		mon.selectByContainsVisibleText("January");
		
		WebElement date = driver.findElement(By.id("daybox"));
		
		Select dd = new Select(date);
		
		dd.selectByContainsVisibleText("1");
		
		//Password
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("SimplePassword1234567890@");
		
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("SimplePassword1234567890");
		
		
		//Submit button
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		
		
		
		
	}

}
