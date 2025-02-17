import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fileUploadDownload {

	public static WebDriver driver = new ChromeDriver();

	
	@Test(priority = 1)
	public static void  fileupload() throws InterruptedException {
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/upload-download");
		
		Thread.sleep(40000);
		
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("\"C:\\Users\\REDHUL\\Downloads\\Hi.txt\"");
		
	}
	
	@Test(priority=2)
	public void filedownload() throws InterruptedException {
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/upload-download");
		
		Thread.sleep(40000);
		
		driver.findElement(By.xpath("//a[@id='downloadButton']")).click();
		
		File file = new File("C:\\Users\\REDHUL\\Downloads\\sampleFile.jpeg");
		
		if(file.exists()) {
			System.out.println("File downloaded successfully");
		}
		else {
			System.out.println("File downloaded failed");
		}
		
	}

}
