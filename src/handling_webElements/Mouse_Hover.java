package handling_webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://luxire.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement element = driver.findElement(By.xpath("(//a[text() = 'Jackets'])[1]"));
		Actions a = new Actions(driver);
		
		a.moveToElement(element).perform();
		
		driver.findElement(By.xpath("(//a[text() = 'Outerwear'])[2] ")).click();
		
		driver.close();
		

	}

}
