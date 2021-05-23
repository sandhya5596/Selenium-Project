package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://twitter.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.name("session[username_or_email]"));
		if (ele.isDisplayed())
		{
			System.out.println("Pass: email text field is displayed");
			ele.sendKeys("sandhya.bhoomika@gmail.com");
		}
		else
		{
			System.out.println("Fail: email or phone text field not displayed");
		}
		
		WebElement login = driver.findElement(By.xpath("//a[@href = '/login']"));
		if (login.isEnabled())
		{
			System.out.println("Pass: login button is enabled.");
		}
		else
		{
			System.out.println("Fail: login button is not enabled.");
		}
		
		driver.close();
				
	}

}
