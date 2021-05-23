package handling_webElements.Pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime_Hideendivision_popup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text() = 'Login ']")).click();
		
		driver.findElement(By.xpath("(//button[@class = 'x-btn-text'])[1]")).click();
		
		driver.findElement(By.xpath("(//span[text() = '26'])[2]")).click();
		
		driver.close();
	}

}
