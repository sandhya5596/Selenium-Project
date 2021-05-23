package handling_webElements.Pop_ups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_popup {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.id("course"));
		
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		
		driver.findElement(By.xpath("(//a[text() = 'Selenium Training'])[1]")).click();
		
		driver.findElement(By.xpath("//button[@ondblclick = 'addtocart()']")).click();
		
		Alert a1 = driver.switchTo().alert();
		String text = a1.getText();
		System.out.println(text);
		
		a1.accept();
		
		driver.close();
	
		
		

	}

}
