import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class demoWebShop {

 static WebDriver driver = new ChromeDriver();

@BeforeClass
public static void setup() {
	
	driver.get("https://demowebshop.tricentis.com/");
	
	driver.manage().window().maximize();
	
	
}

@Test (priority = 1)
public void register() {
	driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();//Register
	
	driver.findElement(By.xpath("//input[@id='gender-male']")).click();//Gender selection button
	
	driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("SampleFirstName");
	
	driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("SampleLastName");
	
	driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("SampleTestingMMmail@gmail.com");
	
	driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("SimplePassword@1test");
	
	driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("SimplePassword@1test");
	
	driver.findElement(By.xpath("//input[@id='register-button']")).click();
	driver.findElement(By.xpath("//input[@value='Continue']")).click();

	
}

@Test(priority = 2)
public static void searching() {
	WebElement searchIcon = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	searchIcon.sendKeys("Laptop");
	
	Actions act = new Actions(driver);
	
	act.sendKeys(Keys.ENTER).build().perform();

}


@Test(priority = 2)

public void checkout() {
	driver.findElement(By.xpath("//h2[@class='product-title']//a[contains(text(),'14.1-inch Laptop')]")).click();
	
	driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']")).click();
	
	driver.findElement(By.xpath("//span[normalize-space()='Shopping cart']")).click();//checkout
	
	driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
	
	driver.findElement(By.xpath("//button[@id='checkout']")).click();

	
	
}

@Test(priority = 3)
public void addressFilling() {
	WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"));
	
	Select sc = new Select(country);
	
	sc.selectByContainsVisibleText("India");
	
	driver.findElement(By.id("BillingNewAddress_CountryId")).sendKeys("Kazam");
	
	driver.findElement(By.cssSelector("#BillingNewAddress_Address1")).sendKeys("asdfghjklzxcvbnm");
	
	driver.findElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']")).sendKeys("123456");
	
	driver.findElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']")).sendKeys("1234567890");
	driver.findElement(By.xpath("//input[@onclick='Billing.save()']")).click();
	
	driver.findElement(By.xpath("//input[@id='PickUpInStore']")).click();
	
	driver.findElement(By.xpath("//input[@onclick='Shipping.save()']")).click();
	
	driver.findElement(By.cssSelector("input[class='button-1 payment-method-next-step-button']")).click();
	
	driver.findElement(By.cssSelector("input[class='button-1 payment-method-next-step-button']")).click();
	
	driver.findElement(By.xpath("//input[@class='button-1 payment-info-next-step-button']")).click();
	driver.findElement(By.xpath("//input[@value='Confirm']")).click();
	driver.findElement(By.xpath("//input[@value='Continue']")).click();
	
	
	
	
}


}
