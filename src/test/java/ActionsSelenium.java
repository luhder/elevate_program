import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionsSelenium {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {

	driver = new ChromeDriver();
	
	driver.get("https://vinothqaacademy.com/mouse-event/");
	
	driver.manage().window().maximize();
	
	
	}
	@Test(priority = 1)
	public static void dragAndDrop() throws InterruptedException {
		
		
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggableElement']"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id='droppableElement']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, target);
		
	}
	
	@Test(priority = 2)
	public void mousehover() throws InterruptedException {
		
		
		Thread.sleep(2000);
		
		WebElement src = driver.findElement(By.xpath("//input[@id='textbox']"));
		Actions act = new Actions(driver);
		act.moveToElement(src);
		
	}
	
	@Test(priority = 3)
	public void rightClick() {
	    WebElement src = driver.findElement(By.xpath("//button[@id='rightclick']"));
	    Actions act = new Actions(driver);
	    act.contextClick(src).perform();  
	}

	@Test(priority = 4)
	public void doubleClick() {
		WebElement src = driver.findElement(By.xpath("//button[@id='dblclick']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(src).perform();
		
	}
	
	@Test(priority = 5)
	
	public static void keyboardAction() {
		
		WebElement textbox = driver.findElement(By.xpath("//input[@id='textbox']"));
		
		Actions act = new Actions(driver);
		
		act.sendKeys(textbox,"Hi helloo all").sendKeys(Keys.ENTER).build().perform();
		
	}
	

}
