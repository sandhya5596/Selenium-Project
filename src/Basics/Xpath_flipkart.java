package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_flipkart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://app.howsy.com/login");
			driver.findElement(By.name("email")).sendKeys("sandhya.bhoomika@gmail.com");
			driver.findElement(By.name("password")).sendKeys("sandhya5596");
			driver.findElement(By.xpath("//button[@type= 'submit']")).click();
			String title = driver.getTitle();
			System.out.println(title);
			
			// verification
			if(title.equals("Howsy Customers")) 
			{
				System.out.println("pass:Home page is displayed");
			}
			else
			{
				System.out.println("Fail:Home page is not dispalyed");
			}
			String url = driver.getCurrentUrl();
			System.out.println(url);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@type= 'submit']")).click();
			driver.close();
			
			
		}
}
