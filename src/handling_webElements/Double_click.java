package handling_webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("//a[text() = 'COURSE']"));
				
				Actions a = new Actions(driver);
				a.moveToElement(ele).perform();
				
				driver.findElement(By.xpath("(//a[text() = 'Selenium Training'])[1]")).click();
				
				WebElement click = driver.findElement(By.xpath("//i[@class = 'fa fa-plus']"));
				a.doubleClick(click).perform();
				
				driver.close();

	}

}
