package handling_webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Skillrary_dropdown_select 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement category = driver.findElement(By.name("addresstype"));
		category.click();
		
		Select s = new Select(category);
		s.selectByIndex(1);
		
		driver.findElement(By.xpath("(//a[text() = 'Cucumber'])[3]")).click();
		
		Thread.sleep(3000);
		driver.close();

	}

}
