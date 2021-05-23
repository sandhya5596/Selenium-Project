package handling_webElements.Pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_popup_actitime {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text() = 'Login ']")).click();
		
		driver.findElement(By.xpath("//a[@class = 'content users']")).click();
		
		driver.findElement(By.xpath("//div[text() = 'New User']")).click();
		Actions act = new Actions(driver);
		
		 WebElement firstname = driver.findElement(By.name("firstName"));
		act.moveToElement(firstname).perform();
		firstname.sendKeys("peter");
		driver.findElement(By.xpath("//div[@class = 'closeButton hideButton_panelContainer']")).click();
		
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.accept();
		
		driver.close();
	
		
		

	}

}
