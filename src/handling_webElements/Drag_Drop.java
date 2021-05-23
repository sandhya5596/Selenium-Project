package handling_webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Drag_Drop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement category = driver.findElement(By.name("addresstype"));
		category.click();
		
		Select s = new Select(category);
		s.selectByIndex(1);
		
		WebElement src = driver.findElement(By.id("Selenium Training"));
				WebElement dest = driver.findElement(By.id("cartArea"));
		
		Actions a = new Actions(driver);
		
		a.dragAndDrop(src, dest).perform();
		//driver.close();

	}

}
