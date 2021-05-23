package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement create = driver.findElement(By.xpath("(//div[@class = '_6ltg'])[2]"));
		create.click();
		
		WebElement radio = driver.findElement(By.name("sex"));
		radio.click();
		if (radio.isSelected())
		{
			System.out.println("Pass: radio button is enabled");
		}
		else
		{
			System.out.println("Fail: radio not enabled.");
		}
		driver.close();
	}

}
