package handling_webElements.Pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_popup_skillrary {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text() = 'LOGIN']")).click();
		driver.findElement(By.id("email")).sendKeys("user");
		driver.findElement(By.id("password")).sendKeys("user");
		driver.findElement(By.id("last")).click();
		
		driver.findElement(By.xpath("//img[@class = 'user-image']")).click();
		driver.findElement(By.xpath("//a[text() = 'Profile']")).click();
		driver.findElement(By.xpath("//a[@class = 'btn btn-success btn-flat btn-sm']")).click();
		driver.findElement(By.id("photo")).sendKeys("D:\\Photos\\01\\DSC_6790.JPG");
		
		driver.close();
		

	}

}
